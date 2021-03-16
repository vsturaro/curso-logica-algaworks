package cursoLogica.vetores;

import java.util.Scanner;

public class ex01Vetores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String [] tarefas = new String[5];

       for(int i = 0; i < tarefas.length; i++){
            System.out.print("Digite a tarefa " +i+": ");
            tarefas[i] = scanner.nextLine();
        }

/*        System.out.print("Digite a primeira tarefa: ");
        tarefas[0] = scanner.nextLine();

        System.out.print("Digite a segunda tarefa: ");
        tarefas[1]  = scanner.nextLine();

        System.out.print("Digite a terceira tarefa: ");
        tarefas[2] = scanner.nextLine();

        System.out.print("Digite a quarta tarefa: ");
        tarefas[3]  = scanner.nextLine();

        System.out.print("Digite a quinta tarefa: ");
        tarefas[4] = scanner.nextLine();*/

        System.out.println("As tarefas do dia são: ");
        for(int i = 0; i < tarefas.length; i++){
            System.out.println(i+": "+tarefas[i]);
        }
    }
}
