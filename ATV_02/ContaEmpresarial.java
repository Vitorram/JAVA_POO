
public class ContaEmpresarial extends ContaBancaria implements Transferencia, Pagamento{

    public ContaEmpresarial(int numero, String agencia, double saldo){
        super(numero, agencia, saldo);
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



@Override
public void transferir(ContaBancaria destino, double valor) {
    if (temSaldoSuficiente(valor)){
        this.sacar(valor);
        destino.depositar(valor);
        System.out.println("Trasferencia realizada");

    }else{
        System.out.println("Erro ao trasferir");
    }
}

protected double calcularTarifaMensal(){
    return 30.0;
}



@Override
public void sacar(double valor) {
    if (valor < 100) {
        System.out.println("Erro ao sacar: o valor mínimo para saque é R$100.");
    } else if (temSaldoSuficiente(valor)) {
       System.out.println("Saque de R$" + valor + " realizado com sucesso.");
    } else {
        super.sacar(valor);
        System.out.println("Erro ao sacar");
    }
}


}