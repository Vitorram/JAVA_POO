public class Banco {

   public static void realizarTransferencia(Transferencia origem, ContaBancaria destino, double valor) {
        if (origem instanceof ContaUniversitaria && valor > 5000) {
            System.out.println("Transferência negada: Conta Universitária só permite até R$5000.");
            return;
        }

        origem.transferir(destino, valor);
    }

    public static void realizarPagamento(Pagamento conta, String codigo, double valor){
        conta.pagarBoleto(codigo, valor);
    }
}