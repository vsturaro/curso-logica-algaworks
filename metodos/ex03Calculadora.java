package cursoLogica.metodos;

import java.util.Scanner;

public class ex03Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double primeiroNumero = informeNumero(scanner);
        separador();

        Double segundoNumero = informeNumero(scanner);
        separador();

        Integer operacao = escolherOperacao(scanner);
        separador();

        Double resultado = realizarCalculo(operacao, primeiroNumero, segundoNumero);
        imprimir("O resultado da "+operacao+" de: "+primeiroNumero+ " por "+segundoNumero+" é: "+resultado);

        scanner.close();
    }

    static Double realizarCalculo(Integer operacao, Double primeiroNumero, Double segundoNumero) {
        Double resultado = null;

        switch (operacao) {
            case 0:
                resultado = adicao(primeiroNumero, segundoNumero);
                break;
            case 1:
                resultado = subtracao(primeiroNumero, segundoNumero);
                break;
            case 2:
                resultado = divisao(primeiroNumero, segundoNumero);
                break;
            case 3:
                resultado = multiplicacao(primeiroNumero, segundoNumero);
                break;
            default:
                System.err.println("Digite uma opção válida!");
                System.exit(1);
        }
        return resultado;
    }

    static Double adicao(Double primeiroNumero, Double segundoNumero){
        return primeiroNumero + segundoNumero;
    }
    static Double subtracao(Double primeiroNumero, Double segundoNumero){
        return primeiroNumero - segundoNumero;
    }
    static Double divisao(Double primeiroNumero, Double segundoNumero){
        return primeiroNumero / segundoNumero;
    }
    static Double multiplicacao(Double primeiroNumero, Double segundoNumero){
        return primeiroNumero * segundoNumero;
    }

    static Integer escolherOperacao (Scanner scanner){
        requisitarInformacaoTela("Escolha a operação desejada: ");

        String[] operacoes = new String[]{"Soma", "Subtração", "Divisão", "Multiplicação"};

        for (int i = 0; i < operacoes.length; i++){
            imprimir("(" +i+ ") "+operacoes[i]);
        }
        requisitarInformacaoTela("Digite o código da operação desejada: ");
        return scanner.nextInt();
    }

        static Double informeNumero (Scanner scanner){
        requisitarInformacaoTela("Digite o número desejado: ");
        return scanner.nextDouble();
    }

    static void imprimir(String texto){
        System.out.println(texto);
    }

    static void requisitarInformacaoTela(String texto){
        System.out.print(texto);
    }

    static void separador(){
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
}
