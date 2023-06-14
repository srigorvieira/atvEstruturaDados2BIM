/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvtres;

/**
 *
 * @author igorv
 */
public class AtvTres {

    public static void main(String[] args) {
        try {
            int nmr = 20; // Número desejado para a sequência Fibonacci

            System.out.println("Essa é a sequência Fibonacci de " + nmr + ":");
            for (int i = 0; i <= nmr; i++) {
                long resultado = calcFibonacci(i);
                System.out.print(resultado + " ");
            }
        } catch (Exception e) {
            System.out.println("Atenção!! Ocorreu um erro durante o cálculo da sequência de Fibonacci.");
            e.printStackTrace();
        }
    }
    
    public static long calcFibonacci(int num) {
        if (num <= 1) {
            return num;
        } else {
            return calcFibonacci(num - 1) + calcFibonacci(num - 2);
        }
    }
}
