package exercícios;

import java.util.Scanner;

public class AreaTriangulo2 {
    
    public static void main (String [] args) {
        
        Scanner ler = new Scanner(System.in);
        
        float altura, base, areaCm, areaM;
        
        System.out.print("Informe a altura do triângulo em cm: ");
        altura = ler.nextFloat();
        
        System.out.print("Informe a base do triângulo em cm: ");
        base = ler.nextFloat();
        
        areaCm = base * altura / 2;
        areaM = areaCm / 100;
        
        System.out.println("A área do triângulo é " + areaCm + " centímetros ou " + areaM + " metros");
    }
}
