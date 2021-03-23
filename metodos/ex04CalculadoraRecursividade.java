package cursoLogica.metodos;

import java.util.Scanner;

public class ex04CalculadoraRecursividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTabuadaMultiplicacao(numeroDigitado(scanner), 0.0);

        linha();

        imprimirTabuadaDivisao(numeroDigitado(scanner), 1.0);

        scanner.close();
    }
    static void imprimirTabuadaMultiplicacao(Double multiplicando, Double multiplicador){
        imprimir(multiplicando+" x "+ multiplicador+" = "+(multiplicando * multiplicador));
        if(++multiplicador <= 10){
            imprimirTabuadaMultiplicacao(multiplicando, multiplicador);
        }
    }
    static void imprimirTabuadaDivisao(Double dividendo, Double divisor){
        imprimir(dividendo+" : "+divisor+" = "+(dividendo / divisor));
        if (++divisor <= 10){
            imprimirTabuadaDivisao(dividendo, divisor);
        }
    }

    static Double numeroDigitado(Scanner scanner){
        imprimirTextoConsole("Digite o número que deseja calcular a tabuada: ");
        return scanner.nextDouble();
    }

    static void imprimirTextoConsole(String texto){
        System.out.print(texto);
    }

    static void imprimir(String texto){
        System.out.println(texto);
    }

    static void linha(){
        System.out.println("---------------------------------------");
    }
}
