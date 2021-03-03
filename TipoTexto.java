package cursoLogica;

import java.util.Scanner;

public class TipoTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine(); //para ler string do console

        //String nome = "Vander";

        System.out.println("Olá " + nome + "!");
        scanner.close();

        Character variavelChar = 'A'; //pouco usado apenas para 1 caracter
    }
}
