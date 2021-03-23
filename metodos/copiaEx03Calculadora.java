package cursoLogica.metodos;

import java.util.Scanner;

public class copiaEx03Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double primeiroNumero = numeroInformado(scanner); //busca o método para requisitar o primeiro número

        Double segundoNumero = numeroInformado(scanner); //busca o método para requisitar o segundo número

        Integer operacao = informaOperacao(scanner); //busca o método para listar as operações disponíveis

        Double resultado = fazerCalculo(operacao, primeiroNumero, segundoNumero);

        String nomeOperacao= nomeOperador(operacao);

        imprimir("O resultado da "+nomeOperacao+" de "+primeiroNumero+" por "+segundoNumero+" é: "+resultado);

        scanner.close();
    }
    static String nomeOperador(Integer codigoOperacao){
        String nomeOperacao = null;
        if(codigoOperacao ==0 ){
            nomeOperacao = "Adição";
        }
        else if(codigoOperacao == 1){
            nomeOperacao = "Subtracao";
        }
        else if(codigoOperacao == 2){
            nomeOperacao = "Divisão";
        }
        else if(codigoOperacao == 3){
            nomeOperacao = "Multiplicação";
        }
        else if(codigoOperacao == 4){
            nomeOperacao = "Exponenciação";
        }
        return nomeOperacao;
    }

    static Double fazerCalculo(Integer operacao, Double primeiroNumero, Double segundoNumero){
        Double resultado = null;
      switch (operacao){
          case 0: resultado = adicao(primeiroNumero, segundoNumero);
          break;
          case 1: resultado = subtracao(primeiroNumero, segundoNumero);
          break;
          case 2: resultado = divisao(primeiroNumero, segundoNumero);
          break;
          case 3: resultado = multiplicacao(primeiroNumero, segundoNumero);
          break;
          case 4: resultado = exponenciacao(primeiroNumero, segundoNumero);
          break;
          default:
          System.err.println("Digite uma das opções válidas!");
          System.exit(0);
      }
      return resultado;

       /* if(operacao == 0){
            resultado = adicao(primeiroNumero, segundoNumero);
        }
        else if(operacao == 1){
            resultado = subtracao(primeiroNumero, segundoNumero);
        }
        else if (operacao == 2){
            resultado = divisao(primeiroNumero, segundoNumero);
        }
        else if (operacao == 3){
            resultado = multiplicacao(primeiroNumero, segundoNumero);
        }
        else {
            System.err.println("Digite uma das opções válidas!");
            System.exit(0);
        }
        return resultado;

        */
    }

    static Double adicao(Double primeiroNumero, Double segundoNumero){ //cria o método para somar
        return primeiroNumero + segundoNumero; //retorna a soma
    }
    static Double subtracao(Double primeiroNumero, Double segundoNumero){ //cria o método para subtrair
        return primeiroNumero - segundoNumero; //retorna a subtração
    }
    static Double divisao(Double primeiroNumero, Double segundoNumero){ //cria o método para dividir
        return primeiroNumero / segundoNumero; //retorna a divisão
    }
    static Double multiplicacao(Double primeiroNumero, Double segundoNumero){ //cria o método para multiplicar
        return primeiroNumero * segundoNumero; //retorna o produto
    }
    static Double exponenciacao(Double primeiroNumero, Double segundoNumero){ //cria o método para exponencial
        return StrictMath.pow(primeiroNumero, segundoNumero);// primeiroNumero sqrt segundoNumero; //retorna o produto
    }

    static Integer informaOperacao(Scanner scanner){
        imprimirTextoConsole("Digite a operação desejada: \n");

        String[] operacoesDisponiveis = new String[]{"Soma","Subtração","Divisão","Multiplicação", "Exponenciação"}; //cria o array com as opções disponíveis
        for(int i =0; i < operacoesDisponiveis.length; i++){ //percorre o array ate a ultima posição
            imprimir("( "+i+" )"+operacoesDisponiveis[i]);
        }
        imprimirTextoConsole("Escolha a operação desejada: ");
        return scanner.nextInt();
    }

    static Double numeroInformado(Scanner scanner){ //cria método para ler a informação digitada no console
        imprimirTextoConsole("Digite o valor desejado: ");
        return scanner.nextDouble(); //retorna a saída da função scanner habitual
    }

    static void imprimir(String texto){ //cria método para imprimir saída sistema
        System.out.println(texto);
    }

    static void imprimirTextoConsole(String texto){ //cria método para imprirmir no console a requisição ao usuario
        System.out.print(texto);
    }
}
