package ATV_01;

public class Tecnico extends Assistente {
    private double bonusSalarial;

    public Tecnico(String nome, double salario, String numeroMatricula, double bonusSalarial) {
        super();
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double ganhoAnual() {
        return (getSalario() + bonusSalarial) * 12;
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }
}
