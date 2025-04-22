public class Assistente extends Funcionario {
    private int numeroMatricula;

    public void setAss(int numeroMatricula){
        this.numeroMatricula = numeroMatricula;

    }
    
    public int getAss(){
        return numeroMatricula;
    }

    public double exibeDados(double valor) {
        return super.exibeDados(valor);
    }

    
}
