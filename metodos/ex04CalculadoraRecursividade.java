package cursoLogica.metodos;

import java.util.Scanner;

public class ex04CalculadoraRecursividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        imprimirTabuadaMultiplicacao(numeroDigitado(scanner),0);
        linha();

        //imprimir("Tabuada de divisão do número: "+numeroDigitadoDivisao(scanner));
        imprimirTabuadaDivisao(numeroDigitadoDivisao(scanner), 1.0);
        linha();

        //imprimir("Tabuada de soma do número: "+numeroDigitado(scanner));
        imprimirTabuadaSoma(numeroDigitado(scanner), 0);
        linha();

        //imprimir("Tabuada de subtração do número: "+numeroDigitado(scanner));
        imprimirTabuadaSubtracao(numeroDigitado(scanner),0);
        linha();

        scanner.close();
    }
    static void imprimirTabuadaMultiplicacao(Integer multiplicando, Integer multiplicador){
        imprimir(multiplicando+" x "+ multiplicador+" = "+(multiplicando * multiplicador));
        if(++multiplicador <= 10){
            imprimirTabuadaMultiplicacao(multiplicando, multiplicador);
        }
    }
    static void imprimirTabuadaDivisao(Double dividendo, Double divisor){
        imprimir(dividendo+" / "+ divisor+" = "+(dividendo / divisor));
        if(++divisor <= 10){
            imprimirTabuadaDivisao(dividendo, divisor);
        }
    }
    static void imprimirTabuadaSoma(Integer primeiraParcela, Integer segundaParcela){
        imprimir(primeiraParcela+" + "+segundaParcela+" = "+(primeiraParcela + segundaParcela));
        if (++segundaParcela <=10){
            imprimirTabuadaSoma(primeiraParcela, segundaParcela);
        }
    }
    static void imprimirTabuadaSubtracao(Integer minuendo, Integer subtraendo){
        imprimir(minuendo+" - "+subtraendo+" = "+(minuendo - subtraendo));
        if (++subtraendo <=10){
            imprimirTabuadaSubtracao(minuendo, subtraendo);
        }
    }

    static Integer numeroDigitado(Scanner scanner){
        imprimirTextoConsole("Digite o número que deseja calcular: ");
        return scanner.nextInt();
    }

    static Double numeroDigitadoDivisao(Scanner scanner){
        imprimirTextoConsole("Digite o número que deseja calcular: ");
        return scanner.nextDouble();
    }

    static void imprimirTextoConsole(String texto){
        System.out.print(texto);
    }

    static void imprimir(String texto){
        System.out.println(texto);
    }
    static void linha(){
        System.out.println("------------------------------------------");
    }
}
