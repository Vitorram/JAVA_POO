package ATV_01;


public class main {
    public main(String[] args) {
        Tecnico tecnico = new Tecnico("Carlos", 3000.0f, "T123", 500.0f);
        Administrativo administrativo = new Administrativo("Ana", 2800.0f, "A456", "noite", 300.0f);

        System.out.println("Técnico:");
        tecnico.exibeDados();
        System.out.println("Matrícula: " + tecnico.getMatricula());
        System.out.println();

        System.out.println("Administrativo:");
        administrativo.exibeDados();
        System.out.println("Matrícula: " + administrativo.getMatricula());
	}
}
