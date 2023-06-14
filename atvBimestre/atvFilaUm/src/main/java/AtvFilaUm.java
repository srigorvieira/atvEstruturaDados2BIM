import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtvFilaUm {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1 para adicionar um paciente");
            System.out.println("2 para chamar o próximo paciente");
            System.out.print("Escolha uma das opções (1 ou 2): ");
            int opcao = s.nextInt();
            s.nextLine();
            
            if (opcao == 1) {
                System.out.print("Qual é o nome do paciente: ");
                String nmPaciente = s.nextLine();
                fila.add(nmPaciente);
            } else if (opcao == 2) {
                if (!fila.isEmpty()) {
                    String proxPaciente = fila.poll();
                    System.out.println("Próximo paciente: " + proxPaciente);
                } else {
                    System.out.println("Atenção! Não há pacientes na fila.");
                }
            } else {
                System.out.println("Está opção não é válida, por favor, tente novamente!");
            }
        }
    }
}
