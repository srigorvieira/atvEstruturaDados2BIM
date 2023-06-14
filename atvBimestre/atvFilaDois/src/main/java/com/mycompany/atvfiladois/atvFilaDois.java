package com.mycompany.atvfiladois;

import com.mycompany.atvfiladois.model.Cliente;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class atvFilaDois {
    public static void main(String[] args) {
        Queue<Cliente> filaPrioritaria = new LinkedList<>();
        Queue<Cliente> filaNormal = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int atendidosPrioritarios = 0;
        int atendidosNormais = 0;
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Chamar cliente");
            System.out.print("Escolha uma opção (1 ou 2): ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            
            if (opcao == 1) {
                System.out.print("Digite o nome do cliente: ");
                String nomeCliente = scanner.nextLine();
                System.out.print("Digite o ano de nascimento do cliente: ");
                int anoNascimentoCliente = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
                
                Cliente cliente = new Cliente(filaPrioritaria.size() + filaNormal.size() + 1, nomeCliente, anoNascimentoCliente);
                
                if (cliente.anoNascimento > 65) {
                    filaPrioritaria.add(cliente);
                } else {
                    filaNormal.add(cliente);
                }
                
                System.out.println("Cliente adicionado com sucesso.");
            } else if (opcao == 2) {
                if (!filaPrioritaria.isEmpty()) {
                    if (atendidosPrioritarios < 2) {
                        Cliente cliente = filaPrioritaria.poll();
                        System.out.println("Cliente prioritário atendido: " + cliente);
                        atendidosPrioritarios++;
                    } else {
                        Cliente cliente = filaNormal.poll();
                        System.out.println("Cliente normal atendido: " + cliente);
                        atendidosPrioritarios = 0;
                        atendidosNormais++;
                    }
                } else if (!filaNormal.isEmpty()) {
                    Cliente cliente = filaNormal.poll();
                    System.out.println("Cliente normal atendido: " + cliente);
                    atendidosPrioritarios = 0;
                    atendidosNormais++;
                } else {
                    System.out.println("Essa fila não possui clientes na fila.");
                }
            } else {
                System.out.println("Opção inválida, por favor, tente novamente!");
            }
        }
    }
}
