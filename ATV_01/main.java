package ATV_01;


public class main {
    public main(String[] args) {
	  Assistente adm = new Administrativo();
      Assistente tec = new Tecnico();
        
      adm.setNome("Vitor");
      adm.setMatricula(20);
      tec.setNome("Gabriel");
      tec.setMatricula(50);
      
      System.out.println(" ADIMINISTRATIVO - Nome: " + adm.getNome() + "- Matricula: " + adm.getMatricula());
      
      System.out.println(" TECNICO - Nome: " + tec.getNome() + "- Matricula: " + tec.getMatricula());

	}
}
