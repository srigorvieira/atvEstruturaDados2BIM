/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvdois;

import java.util.Scanner;

/**
 *
 * @author igorv
 */
public class AtvDois {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe algum número que seja inteiro: ");

        try {
            int nmr = s.nextInt();
            long fatorial = calcularFatorial(nmr);
            System.out.println("O fatorial de " + nmr + " é: " + fatorial);
        } catch (Exception e) {
            System.out.println("Atenção!! Houve um erro durante a execução do cálculo fatorial.");
            e.printStackTrace();
        }
    }
    
    public static long calcularFatorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }
}
