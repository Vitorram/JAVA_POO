public class exercicio2 {
    public static void main(String[] args) {
    ContaBancaria cc = new ContaCorrente(10, "ASAS", 500.00); 
    ContaBancaria cp = new ContaPoupanca(10, "ASAS", 500.00); 
    ContaUniversitaria conta = new ContaUniversitaria(101, "1234", 1000, 5.000f);
    
    //conta corrente indo felas

    System.out.println("Conta corrente");
    System.out.println("agencia: " + cc.getAgencia());
    System.out.println("saldo disponivel: " + cc.getSaldo());
    cc.aplicarTarifa();
    System.out.println("saldo apos tarifa: " + cc.getSaldo());
    cc.depositar(100);
    System.out.println("saldo apos deposito: " + cc.getSaldo());
    
    System.out.println("\n\n");

    System.out.println("Conta Poupança");
    System.out.println("agencia: " + cp.getAgencia());
    System.out.println("saldo disponivel: " + cp.getSaldo());
    cp.aplicarTarifa();
    System.out.println("saldo apos tarifa: " + cp.getSaldo());
    cp.depositar(100);
    System.out.println("deposito realizado, valor: 100 ");
    System.out.println("saldo apos deposito: " + cp.getSaldo());
    System.out.println("\n\n");

    System.out.println("Conta universitaria");
    System.out.println("agencia: " + conta.getAgencia());
    System.out.println("saldo disponivel: " + conta.getSaldo());
    conta.aplicarTarifa();
    System.out.println("saldo apos tarifa: " + conta.getSaldo());
    conta.depositarComLimite(100);
    System.out.println("deposito realizado, valor: 100 ");
    System.out.println("saldo apos deposito: " + conta.getSaldo());


}
}
