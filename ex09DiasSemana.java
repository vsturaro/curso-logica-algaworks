package cursoLogica;

import java.util.Scanner;

public class ex09DiasSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número para o dia da semana: ");
        Integer diaSemana = scanner.nextInt();
        String dia;

        switch (diaSemana){
            case 1: dia = "Domingo";
                break;
            case 2: dia = "Segunda-feira";
                break;
            case 3: dia = "Terça-feira";
                break;
            case 4: dia = "Quarta-feira";
                break;
            case 5: dia = "Quinta-feira";
                break;
            case 6: dia = "Sexta-feira";
                break;
            case 7 : dia = "Sábado";
                break;
            default: dia = "Digite um numero válido: 1 à 7";

        }
        System.out.println("O dia da semana indicado corresponde à: "+dia);
        scanner.close();
    }
}
