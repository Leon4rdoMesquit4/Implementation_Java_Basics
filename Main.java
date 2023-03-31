import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String nomeAnimal;
        int idade;
        String tipo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do seu animal: ");
        nomeAnimal = sc.nextLine();
        
        System.out.println("Digite a idade do seu animal: ");
        idade = sc.nextInt();        
        sc.nextLine();
        
        System.out.println("Digite o tipo do seu animal: ");
        tipo = sc.nextLine();
        
        System.out.println("Seu animal eh um " + tipo + " de idade " + idade + " de nome " + nomeAnimal);
    }
    
}