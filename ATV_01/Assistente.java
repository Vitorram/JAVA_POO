
package ATV_01;
public class Assistente extends Funcionario {
    private int numeroMatricula;

    public void setMatricula(int numeroMatricula){
        this.numeroMatricula = numeroMatricula;
    }
    
    public int getMatricula(){
        return numeroMatricula;
    }

    public double exibeDados(double valor) {
        return super.exibeDados(valor);
    }


}
