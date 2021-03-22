package cursoLogica.metodos;

import java.util.Scanner;

public class retornandoValores {
    static Boolean posicaoValida;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};

        imprimir("Escolha dentre os cursos abaixo: ");

        iterarExibirPosicoes(cursos);

        //imprimirOpcaoConsole("O curso que você deseja é o: ");
        Integer posicaoCursoEscolhido = recebeNumeroUsuario("O curso que você deseja é o: ", scanner);

        posicaoValida = posicaoEscolhidaUsuario(posicaoCursoEscolhido, cursos); //posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

        validarOpcao();
        imprimirTraco();

        String[] formasPagamento = new String[] {"Cartão", "Boleto"};

        imprimir("Escolha dentre as formas de pagamento abaixo: ");

        iterarExibirPosicoes(formasPagamento);

        //imprimirOpcaoConsole("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaPagamentoEscolhida = recebeNumeroUsuario("Sua forma de pagamento escolhida é: ", scanner);

        posicaoValida = posicaoEscolhidaUsuario(posicaoFormaPagamentoEscolhida, formasPagamento); //posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento.length;

        validarOpcao();

        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

        imprimirTraco();

        imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

        scanner.close();
    }
    static Integer recebeNumeroUsuario(String texto, Scanner scanner){
        imprimirOpcaoConsole(texto);
        Integer numeroEscolhido = scanner.nextInt();
        return numeroEscolhido;
    }

    static Boolean posicaoEscolhidaUsuario(Integer posicao, String[] vetor){
        Boolean valida = posicao >= 0 && posicao < vetor.length;
        return valida;

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
            System.err.println("Posição inválida!");
            System.exit(0);
        }
    }

    static void imprimirOpcaoConsole(String texto) {
        System.out.print(texto);
    }
}


/*      Integer numeroQualquer = numeroAleatorio();
        System.out.println("Numero: "+ numeroQualquer);
    }
    static Integer numeroAleatorio(){
        Integer numero = 1;
        return numero;
    }*/
/*        Double[] premissaInicial = new Double[] {1325.2, 100.0};
        Double proporcao = 20.0;

        Double resultadoFinal = regraTres(premissaInicial, proporcao);

        System.out.println("Resultado: "+resultadoFinal);

    }*/
    //esquema regra de tres
    // 50 --- 100%
    // x  --- 20%
    // 50 * 20 = 100 * x
    // x = (50 * 20) / 100

/*    static Double regraTres(Double[] premissa, Double proporcao){
        Double resultado = premissa[0] * proporcao / premissa[1];
        return resultado;*/


