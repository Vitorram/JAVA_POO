import java.util.List;

public class RelatorioDeContas {

    public void gerarRelatorio(List<ContaBancaria> contas) {
        for (ContaBancaria conta : contas) {
            String tipo = "Conta Desconhecida";
            double tarifa = 0.0;

            
            if (conta instanceof ContaCorrente) {
                tipo = "Conta Corrente";
                tarifa = 12.50;
            } else if (conta instanceof ContaUniversitaria) {
                tipo = "Conta Universitária";
                tarifa = 5.00;
            } else if (conta instanceof ContaEmpresarial){
                tipo = "Conta Empresarial";
                tarifa = 30.00;
            }else if (conta instanceof ContaPoupanca){
                tipo = "Conta Poupança";
                tarifa = 0.00;
            }
            System.out.println("------------------");
            System.out.println("Tipo: " + tipo);
            System.out.println("Saldo: R$" + conta.getSaldo());
            System.out.println("Tarifa: R$" + tarifa);
        }
    }
}
