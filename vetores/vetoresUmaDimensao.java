package cursoLogica.vetores;

import java.util.Scanner;

public class vetoresUmaDimensao {
    public static void main(String[] args) {
/*        String [] cardapio = new String[] {"Calabresa", "Atum", "Queijo", "Lombo ao creme" }; //maneira de se declarar um array

        System.out.println("Escolha o sabor: ");

        for(int i = 0; i < cardapio.length; i++) { //length propriedade q retorna a quantidade de ítens do vetor
            System.out.println("[" + i+ "]" + cardapio[i]);
        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número correspondente ao sabor: ");
        Integer saborEscolhido = scanner.nextInt();

        System.out.println("O sabor escolhido foi: " + cardapio[saborEscolhido]);

        scanner.close();*/

/*        String [] cardapio = new String[] {"Calabresa", "Atum", "Queijo", "Lombo ao creme" };
        cardapio[3] = "Frango com catupiry";
        for(int i = 0; i < cardapio.length; i++) {
            System.out.println(cardapio[i]);
        }*/

        String [] cardapio = new String[4]; // outra forma de declarar valores do vetor
        cardapio[0] = "Calabresa";
        cardapio[1] = "Atum";
        cardapio[2] = "Bahiana";
        cardapio[3] = "5 queijos";

        for(int i = 0; i < cardapio.length; i++) {
            System.out.println(cardapio[i]);
        }
    }
}
