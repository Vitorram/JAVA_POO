public class ContaUniversitaria extends ContaBancaria implements Transferencia {
    private float limite = 5.000f;

    public ContaUniversitaria (int numero, String agencia, double saldo, float limite){
        super(numero, agencia, saldo);
        this.limite = limite;
    }

    protected double calcularTarifaMensal(){
        return 5.00;
    }

    public void depositarComLimite(double valor) {
        if (getSaldo() + valor < limite) {
            System.out.println("Erro ao depositar: o saldo não pode ultrapassar R$ 5.000,00.");
        } else {
            depositar(valor);
            System.out.println("Depósito realizado com sucesso.");
        }

    }
    @Override
public void transferir(ContaBancaria destino, double valor) {
    if (temSaldoSuficiente(valor)) {       
        if (destino instanceof ContaUniversitaria) {
            double saldoDestino = destino.getSaldo();
            if (saldoDestino + valor > 5000) {
                System.out.println("Essa transferência ultrapassa o limite da Conta Universitária (R$5000).");
                return;
            }
        }

        this.sacar(valor);
        destino.depositar(valor);
        System.out.println("Transferência realizada");

    } else {
        System.out.println("Erro ao transferir: saldo insuficiente.");
    }
}

    
}
