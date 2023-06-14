package com.mycompany.atvum;

// 1 - desenvolva um metodo que some de 0 a 50

public class AtvUm {

    public static void main(String[] args) {
        int resultado = soma(0);
        System.out.println("A soma de 0 ate 50 é igual a: " + resultado);
    }
    
    public static int soma(int nmr) {
        try {
            if (nmr <= 50) {
                return nmr + soma(nmr + 1);
            } 
            else {
                return 0;
            }
        } 
        catch (Exception e) {
            System.out.println("ocorreu um erro, verifique");
            e.printStackTrace();
            return 0;
        }
    }
    
}
