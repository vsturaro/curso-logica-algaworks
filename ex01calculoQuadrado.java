package cursoLogica;

import java.math.BigInteger;
import java.util.Scanner;
/*
Leia um número no console e depois faça o cálculo do quadrado desse número e exiba o resultado
no console. Lembrando que o quadrado de um número é calculado multiplicando-se o número por ele
mesmo. Por exemplo, para encontrar o quadrado de 2 é preciso multiplicar o 2 por 2, tendo como
resultado o número 4.
 */
public class ex01calculoQuadrado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA PARA CÁLCULO DE QUADRADO DE UM NÚMERO");
        System.out.print("Digite o número que deseja saber o seu quadrado: ");

        Integer numero = scanner.nextInt();

        Integer quadrado = numero * numero;

        System.out.println("O quadrado de: "+ numero+" é: "+quadrado);

        scanner.close();


    }
}
