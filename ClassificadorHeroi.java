
import java.util.Scanner;



public class ClassificadorHeroi {
    public static void main(String[] args) {

        String nome;
        int xp;

        Scanner scan = new Scanner(System.in);
        

        System.out.println("Digite o nome: ");
        nome = scan.nextLine();
        
        System.out.println("Digite o seu XP: ");
        xp = scan.nextInt();
        
        if(xp == 1000 || xp < 1000){
            System.out.println("O Heroi do nome: " + nome + " esta no nivel: Ferro ");
            
        }
        else if(xp >= 1001 && xp < 2001 ){
            System.out.println("O Heroi do nome: " + nome + " esta no nivel: Bronze ");
        
        }
        else if(xp >= 2001 && xp <= 5000 ){
            System.out.println("O Heroi do nome: " + nome + " esta no nivel: Prata ");
        
        }
        else if(xp >= 5001 && xp <= 7000 ){
            System.out.println("O Heroi do nome: " + nome + " esta no nivel: Ouro ");
        
        }
         else if(xp >= 7001 && xp <= 8000 ){
            System.out.println("O Heroi do nome: " + nome + " esta no nivel: Platina ");
        
        }
         else if(xp >= 8001 && xp <= 9000 ){
            System.out.println("O Heroi do nome: " + nome + " esta no nivel: Ascedente ");
        
        }
          else if(xp >= 9001 && xp <= 10000 ){
            System.out.println("O Heroi do nome: " + nome + " esta no nivel: Imortal ");
        
        }
          else if(xp >= 10001 ){
            System.out.println("O Heroi do nome: " + nome + " esta no nivel: Radiante ");
        
        }
    }

}
