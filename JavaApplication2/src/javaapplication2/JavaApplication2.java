/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author a1620932
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello Word!");
        System.out.println("Digite um numero");
        Scanner scan = new Scanner(System.in);
        int valor1,valor2,resultado;
        valor1 = scan.nextInt();
        System.out.println("Digite outro numero");
        valor2 = scan.nextInt();
        resultado = valor1+valor2;
        System.out.println("SOMA = "+resultado);
    }
    
}
