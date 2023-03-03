package com.mycompany.java.revisao;

/**
 *
 * @author Ferna
 */

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int altura, base, area;

        System.out.print("Informe a altura do triângulo em cm: ");
        altura = ler.nextInt();

        System.out.print("Informe a base do triângulo em cm: ");
        base = ler.nextInt();

        area = base * altura / 2;

        System.out.println("A área do triângulo é " + area + " centímetros");
    }
}
