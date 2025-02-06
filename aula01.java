public class aula01{

    public static void main(String[] args) {
        
        System.out.print("Hello word!!");
        System.out.println("ola, ola");
        int x, y,z;
       
//cauculo de dois numeros, testanto Scanner.    
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um nuemro: ");
        x = sc.nextInt();
        System.out.print("Digite um numero: ");
        y = sc.nextInt();
        z = (x+y) * y * y;
        System.out.println("seu numero:"+ z +" ");
//Notas de provas.
        float nota1, nota2, p2, notafinal, peso;
          System.out.println("Digite o peso da prova: ");
          peso = sc.nextInt();
          System.out.println("Digite a primeira nota: ");
          nota1= sc.nextInt();
          System.out.println("Digite a segunda prova: ");
          nota2= sc.nextInt();
          p2 = 10-nota1;
          notafinal = ((nota1* nota1) + (nota2 + p2)) / (nota1 + nota2);
          System.out.println("Nota final: "+notafinal+"");
//Fahrenheit para Celsius
         float c, f;
                System.out.print("Graus: ");
                c = sc.nextFloat();
                f =(c - 32)*5/9;
                System.out.print(+ f);
            
    }
    }
    
}
