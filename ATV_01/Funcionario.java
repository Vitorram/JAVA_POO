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

    public double addAumento (double valor){
        return addAumento(valor);
    }
    public double ganhoAnual (double ganhos){
        return ganhoAnual(ganhos);
    }
    public double exibeDados (double dados){
        return exibeDados(dados);
    }
    
}