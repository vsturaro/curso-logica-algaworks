package cursoLogica.escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
/*
Crie um programa que vai receber, através do console, uma lista de atividades que vai ajudar o usuário a planejar suas tarefas para o dia seguinte.

Depois que o usuário informar, uma a uma, suas tarefas, as mesmas serão salvas em um arquivo de texto - cada tarefa vai ocupar uma linha desse arquivo.

Para receber cada tarefa do usuário, use o laço while. Enquanto o usuário não digitar um "x" no console, continue pedindo que ele informe as atividades.
*/

public class ex01Escrita {
    public static void main (String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> linhas = new ArrayList<String>();

        String tarefas = "";


        while (!tarefas.equals("x")) { //enquanto tarefas não for igual a x executa o laço
            System.out.print("Informe a tarefa para amanhã ou digite x para terminar: ");
            tarefas = scanner.nextLine();

            if("x".equals(tarefas)){ //quando for igual a x parar
                break;
            }
            linhas.add(tarefas);
        }
        scanner.close();

        Path arquivo = Paths.get("/home/vander/tmp/aula/ex01.txt");
        Files.write(arquivo, linhas);

        System.out.println("Fim...");
    }

}
