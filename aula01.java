public class aula01{

    public static void main(String[] args) {
        
        System.out.print("Hello word!!");
        System.out.println("ola, ola");
        int x, y,z;
       
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um nuemro: ");
        x = sc.nextInt();
        System.out.print("Digite um numero: ");
        y = sc.nextInt();
        z = (x+y) * y * y;
        System.out.println("seu numero:"+ z +" ");
    }
    
}
