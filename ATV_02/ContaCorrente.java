public class ContaCorrente extends ContaBancaria{
    public ContaCorrente (int numero, String agencia, double saldo){
        super(numero, agencia, saldo);
    }
    protected double calcularTarifaMensal(){
        return 15.0;
    }


}
