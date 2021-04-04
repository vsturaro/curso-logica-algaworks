package cursoLogica.leuturaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {
    public static void main(String[] args) throws IOException {

        Path arquivo = Paths.get("/home/vander/tmp/aula/ex01.txt");

        List<String> linhas = Files.readAllLines(arquivo);

        for(int i = 0; i < linhas.size(); i++){ //linhas.size mesma função array.length
            String nome = linhas.get(i); //atribui a cada linha em uma string nome
            System.out.println("Terefas do dia: "+i+": "+nome);
        }


    }
}
