public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca (int numero, String agencia, double saldo){
        super(numero, agencia, saldo);
    }

    protected double calcularTarifaMensal(){
        return 0.0;
    }


}
