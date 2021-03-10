package cursoLogica;

import java.util.Scanner;

public class ex07EstruturasDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do candidato: ");
        String nomeCandidato = scanner.next();

        System.out.print("Digite a nota de Português: ");
        Double notaPortugues = scanner.nextDouble();

        System.out.print("Digite a nota de Matemática: ");
        Double notaMatematica = scanner.nextDouble();

        Double notaMinimaAprovacao = 150.0;
        Double notaMinimaMateria = 60.0;
        Double notaCandidato = notaPortugues + notaMatematica;

        if((notaMatematica >= notaMinimaMateria) && (notaPortugues >= notaMinimaMateria)
                    && (notaCandidato >= notaMinimaAprovacao)){
            System.out.println("Parabéns "+nomeCandidato+" você foi aprovado, sua nota final foi !"+nomeCandidato);
        }
        else {
            System.out.println(nomeCandidato+", infelizmente não atingiu a nota mínima para aprovação =(");
        }

    }
}
