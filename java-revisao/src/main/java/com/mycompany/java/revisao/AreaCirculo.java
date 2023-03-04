package com.mycompany.java.revisao;

/**
 *
 * @author Ferna
 */

import java.util.Scanner;

public class AreaCirculo {
    
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Informe o raio do círculo em cm: ");
        double raio = ler.nextDouble();
        
        double area = (raio * raio) * 22 / 7;
        double areaM = area / 100;
        
        System.out.printf("A área do círculo é %.2f", area);
        System.out.printf(" centímetos ou %.2f", areaM, " metros");
    }
}
