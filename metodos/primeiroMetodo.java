package cursoLogica.metodos;

import java.util.Scanner;

public class primeiroMetodo {

    static Boolean posicaoValida;

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            imprimirTraco();

            String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};

            imprimir("Escolha dentre os cursos abaixo: ");

            /* for(int i = 0; i < cursos.length; i++) {
                System.out.println("[" + i + "] " + cursos[i]);
            }*/

            iterarExibirPosicoes(cursos);

            imprimir("O curso que você deseja é o: ");
            Integer posicaoCursoEscolhido = scanner.nextInt();

            posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

            /* if (!posicaoValida) { //substituido pelo método validarOpcao
                System.err.println("Posição inválida!");
                System.exit(1);

            }*/
            validarOpcao();
            imprimirTraco();

            String[] formasPagamento = new String[] {"Cartão", "Boleto"};

            imprimir("Escolha dentre as formas de pagamento abaixo: ");

            /* for(int i = 0; i < formasPagamento.length; i++) {
                System.out.println("[" + i + "] " + formasPagamento[i]);
            }*/

            iterarExibirPosicoes(formasPagamento);

            imprimirOpcaoConsole("Sua forma de pagamento escolhida é: ");
            Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

            posicaoValida = posicaoFormaPagamentoEscolhida >= 0
                    && posicaoFormaPagamentoEscolhida < formasPagamento.length;

            /*if (!posicaoValida) {
                System.err.println("Posição inválida!");
                System.exit(1);
                }
            */
                validarOpcao();

            String cursoEscolhido = cursos[posicaoCursoEscolhido];
            String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

            imprimirTraco();

            imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

            scanner.close();
        }
        static void imprimir(String texto){ //cria o método imprimir string, q sera inovacado onde necessário
            System.out.println(texto);
        }

        static void iterarExibirPosicoes(String[] array){ //cria metodo para verificar as posições
            for(int i = 0; i < array.length; i++) {
                imprimir("[" + i + "] " + array[i]);
            }
        }

        static void imprimirTraco() {
            imprimir("----------------------------------------------");
        }

        static void validarOpcao(){ //cria o metodo para validar a opção digitada
            if(!posicaoValida) {
                imprimir("Posição inválida!");
                System.exit(0);
            }
        }

        static void imprimirOpcaoConsole(String texto){
            System.out.print(texto);
        }
}
