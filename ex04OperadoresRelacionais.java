package cursoLogica;

import java.util.Scanner;

public class ex04OperadoresRelacionais {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        Boolean freteGratis = valorProduto >= 100;
        Double valorCompra = valorProduto;

        if(freteGratis){
            System.out.println("O valor da compra, com frete grátis é de: R$ "+ valorCompra);
        }
        else {
            valorCompra += 15.0;
            System.out.println("O valor total da compra, acrescido de frete é de: R$ "+valorCompra);
        }
    scanner.close();
    }


}
