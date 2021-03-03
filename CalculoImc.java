package cursoLogica;

import java.util.Scanner;

public class CalculoImc {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("CÁLCULO DO ÍNDICE DE MASSA CORPORAL - IMC");
        System.out.print("Digite o seu peso (em Kg): ");
        Double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        Double altura = scanner.nextDouble();

        Double alturaQuadrado = altura * altura;

        Double imc = peso / alturaQuadrado;

        System.out.println("Seu IMC é: "+ imc);

        scanner.close();
    }

}
