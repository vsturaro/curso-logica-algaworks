package cursoLogica;

import java.util.Scanner;
/*
O seu programa deve receber a nota do aluno pelo console e depois você vai fazer uma
operação lógica para saber se a nota do aluno é maior que 70. O resultado dessa operação
lógica deve ser atribuido a uma variável do tipo Boolean.
Por último, você deve utilizar a variável do tipo Boolean com a estrutura de decisão if
para imprimir, no console, uma mensagem que vai dizer se o aluno passou ou não passou.
 */
public class ex03NotaAluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Integer mediaFinal;
        System.out.print("Digite a nota do aluno: ");
        Integer notaAluno = scanner.nextInt();

        Boolean aprovado = notaAluno >=70;

        if(aprovado){
            System.out.println("Parabéns, o aluno está aprovado, com a média final de "+notaAluno);
        }
        else {
            System.out.println("Infelizmente o aluno não foi aprovado, pois sua "+notaAluno+" não atingiu a média mínima para aprovação");
        }
        scanner.close();

    }
}
