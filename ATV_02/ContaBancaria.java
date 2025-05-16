public abstract class ContaBancaria {
    private int numero;
    private String agencia;
    private double saldo;
    
    //construtor
    public ContaBancaria(int numero, String agencia, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    //metodos concretos//

    public double depositar(double valor){
        return saldo += valor;
    }
    public void consutarSaldo(){
        System.out.println(saldo);
    }

    public void aplicarTarifa() {
        double tarifa = calcularTarifaMensal();
        saldo -= tarifa;
        System.out.println("Tarifa mensal de R$ " + tarifa);
    }
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    //metodo abstract

    protected abstract double calcularTarifaMensal();



    //get e set

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //gets


}
