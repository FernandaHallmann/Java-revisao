package exercícios;

import java.util.Scanner;

/**
 *
 * @author Ferna
 */
public class aluno {
    
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        String nome = ler.nextLine();
        
        System.out.println("Informe seu sexo: ");
        char sexo = ler.next().charAt(0);
        sexo = Character.toLowerCase(sexo);
        
        System.out.print("Seu nome é " + nome);
        switch (sexo) {
            case 'm' -> System.out.println(" e seu sexo é masculino");
            case 'f' -> System.out.println(" e seu sexo é feminino");
            case 'g' -> System.out.println(" e seu sexo é gamer");
            case 'l' -> System.out.println(" e você é louco");
            default -> System.out.println(" e você é programador");
        }
    }
}
