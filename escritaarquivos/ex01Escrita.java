package cursoLogica.escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

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
