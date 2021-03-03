package cursoLogica;

import java.util.Scanner;
/*
Crie um programa que lê, do console, o nome e o sobrenome de uma pessoa e depois imprime
o nome completo. Para isso, você vai precisar de duas variáveis: a primeira você pode chamar
de "nome" e a segunda de "sobrenome". Por último, você vai juntar o nome e o sobrenome em uma
única impressão.
 */

public class ex02TiposTexto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite aqui seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite aqui seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Olá, muito prazer "+nome+" "+sobrenome+"!");
        scanner.close();
    }
}
