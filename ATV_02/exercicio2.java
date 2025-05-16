import java.util.ArrayList;
import java.util.List;




public class exercicio2 {
    public static void main(String[] args) {
         List<ContaBancaria> contas = new ArrayList<>();
    ContaBancaria cc = new ContaCorrente(10, "ASAS", 500.00); 
    ContaBancaria cp = new ContaPoupanca(10, "ASAS", 500.00); 
    ContaUniversitaria conta = new ContaUniversitaria(101, "ALAMEIDAS", 1000, 5.000f);
    ContaCorrente contaC = new ContaCorrente (21, "COMAAS", 300.00);
    ContaEmpresarial ce = new ContaEmpresarial(001, "ELITE", 50123.00);
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


    conta.transferir(cc, 100.0);
    System.out.println("\n");
    System.out.println("Trasferencia realizada, saldo disponivel em conta corrente: " + cc.getSaldo() + "\nSaldo em conta Universitaria: " +conta.getSaldo());
 

    System.out.println("Trasferencia sendo programada de CC para Conta Universitaria");
    contaC.transferir(conta, 9400);
    System.out.println("Saldo em conta universitaria: " + conta.getSaldo());
    System.out.println("\n");

    contas.add(contaC);
    contas.add(conta);
    contas.add(ce);

    RelatorioDeContas relatorio = new RelatorioDeContas();
    relatorio.gerarRelatorio(contas);

    ce.transferir(contaC, 2000);
    System.out.println("Após trasferencia: ");
    
    relatorio.gerarRelatorio(contas);

}
}
