public class ContaCorrente extends ContaBancaria implements Transferencia, Pagamento{
    public ContaCorrente (int numero, String agencia, double saldo){
        super(numero, agencia, saldo);
    }
    protected double calcularTarifaMensal(){
        return 15.0;
    }

    @Override
public void transferir(ContaBancaria destino, double valor) {
    if (temSaldoSuficiente(valor)){
        this.sacar(valor);
        destino.depositar(valor);
        System.out.println("Trasferencia realizada");

    }else{
        System.out.println("Erro ao trasferir: CONTA UNIVERSITARIA");
    }
}

@Override
 public void pagarBoleto(String codigo, double valor) {
        double valorTotal = valor + 2.0;
         if (temSaldoSuficiente(valor)) {
            sacar(valorTotal);
            System.out.println("Boleto de R$" + valor + " pago com taxa de R$2,00. Total debitado: R$" + valorTotal);
        } else {
            System.out.println("Saldo insuficiente para pagar o boleto. Total necessário: R$" + valorTotal);
        }
     
 }

}
