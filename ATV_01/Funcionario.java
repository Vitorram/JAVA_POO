package ATV_01;

public class Funcionario {
    private String nome;
    private float salario;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float getSalario() {
        return salario;
    }

    public void addAumento (double valor){
        this.salario += valor;
    }
    public double ganhoAnual (){
        return salario * 12;
    }
    public void exibeDados (double dados){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Ganho Anual: " + ganhoAnual());
    }
    
}