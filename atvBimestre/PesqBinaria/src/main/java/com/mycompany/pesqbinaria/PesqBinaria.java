package com.mycompany.pesqbinaria;

import java.util.Arrays;
import java.util.Scanner;

public class PesqBinaria {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite uma quantia de números a serem cadastrados: ");
        int quantidade = s.nextInt();

        int[] numeros = new int[quantidade];

        System.out.println("Digite os números:");

        for (int i = 0; i < quantidade; i++) {
            numeros[i] = s.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Selecione o qual o tipo de pesquisa deseja:");
        System.out.println("1 para pesquisa linear");
        System.out.println("2 para Pesquisa binária");

        int opcao = s.nextInt();

        System.out.print("Digite um número para ser pesquisado: ");
        int numeroPesquisado = s.nextInt();

        int indiceEncontrado;

        if (opcao == 1) {
            indiceEncontrado = pesquisaLinear(numeros, numeroPesquisado);
        } else if (opcao == 2) {
            indiceEncontrado = pesquisaBinaria(numeros, numeroPesquisado);
        } else {
            System.out.println("Opção inexistente!.");
            return;
        }

        if (indiceEncontrado == -1) {
            System.out.println("Não foi possível encontrar este numero na lista.");
        } else {
            System.out.println("O número desejado foi encontrado na posição " + indiceEncontrado + " da lista.");
        }
    }

    public static int pesquisaLinear(int[] numeros, int numeroPesquisado) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroPesquisado) {
                return i;
            }
        }
        return -1;
    }

    public static int pesquisaBinaria(int[] numeros, int nmrPesquisado) {
        int esquerda = 0;
        int direita = numeros.length - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (numeros[meio] == nmrPesquisado) {
                return meio;
            }

            if (numeros[meio] < nmrPesquisado) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1;
    }
}
