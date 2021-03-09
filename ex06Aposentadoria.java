package cursoLogica;

import java.util.Scanner;

public class ex06Aposentadoria {

    static final Integer IDADE_MINIMA = 55;
    static final  Integer TEMPO_MINIMO = 25;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        Integer idade = scanner.nextInt();

        System.out.print("Informe o tempo de contriuição: ");
        Integer tempoContribuicao = scanner.nextInt();

        Boolean aposentar = (idade >= IDADE_MINIMA) && (tempoContribuicao >=TEMPO_MINIMO);

        if(aposentar){
            System.out.println("Requisitos atendidos, aposentadoria concedida!");
        }
        else {
            System.out.println("Não atende aos requisitos mínimos");
        }
        scanner.close();
    }
}
