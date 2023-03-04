package com.mycompany.java.revisao;

import java.util.Scanner;

/**
 *
 * @author Ferna
 */
public class SomaNNumeros {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int soma = 0, num;
        
        System.out.printf("\nInforme quantos números você deseja somar: ");
        num = ler.nextInt();
        int a[] = new int[num];
        
        for (int i = 0; i < num; i++) {
            System.out.println("Informe o " + (i + 1) + "º número: ");
            a[i] = ler.nextInt(); 
        }
        
        for (int i = 0; i < num; i++) {
            soma += (a[i]); 
        }
        
        System.out.println("O resultado da soma dos " + num + " números é " + soma);
    }
    
}
