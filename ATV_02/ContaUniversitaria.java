public class ContaUniversitaria extends ContaBancaria{
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
}
