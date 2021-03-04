package cursoLogica;

import java.util.Scanner;

public class ex01OperadoresCalculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        Double primeiroNumero = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        Double segundoNumero = scanner.nextDouble();

        System.out.print("Defina o operador a ser utilizado (1)adição / (2)subtração / (3)multiplicação / (4)divisão: ");
        Integer operador = scanner.nextInt();

        Double resultado = null;
        String nomeOperador ="";

        if(operador.equals(1)){
            nomeOperador = "adição";
            resultado = primeiroNumero + segundoNumero;
        }
        if (operador.equals(2)){
            nomeOperador = "subtração";
            resultado = primeiroNumero - segundoNumero;
        }
        if (operador.equals(3)){
            nomeOperador = "multiplicação";
            resultado = primeiroNumero * segundoNumero;
        }
        if (operador.equals(4)){
            nomeOperador = "divisão";
            resultado = primeiroNumero / segundoNumero;
        }

        System.out.println("O resultado da "+nomeOperador+" é: " +resultado);
        scanner.close();
    }
}
