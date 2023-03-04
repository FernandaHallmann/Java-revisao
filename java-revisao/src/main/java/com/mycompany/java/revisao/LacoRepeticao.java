package com.mycompany.java.revisao;

/**
 *
 * @author Ferna
 */

import java.util.Scanner;

public class LacoRepeticao{
    
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Informe até onde o for deve ir: ");
        int b = ler.nextInt();
        
        for (int a = 0; a < b; a++) {
            //System.out.printf("Informe o %2dº valor: ", (a + 1), b);
            System.out.println(a + 1);
        }
    }
}
