package ATV_01;
public class Administrativo extends Assistente {

    private String turno;
    private float adicionalNoturno;
    
    public Administrativo(String nome, float f, String turno, String string, float g) {
        super();
        this.turno = turno;
        this.adicionalNoturno = (float) adicionalNoturno;
    }

    public double ganhoAnual(double valor) {
        double salarioTotal = getSalario();
        if (turno.equalsIgnoreCase("noite")) {
            salarioTotal += adicionalNoturno;
        }
        return salarioTotal * 12;
    }
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = (float) adicionalNoturno;
    }
}
