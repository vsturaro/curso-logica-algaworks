package cursoLogica;

import java.util.Scanner;

public class ex04Desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor para o produto: ");
        Double valorProd = scanner.nextDouble();

        System.out.print("Digite a quantidade de produto: ");
        Double qtdeProduto = scanner.nextDouble();

        Double subTotal = valorProd * qtdeProduto;
        Boolean condicaoDesconto = qtdeProduto >= 10;

        Double desconto = 0.0;
        if(condicaoDesconto){
            desconto = 10.0;
        }
        Double vlrDesconto = (subTotal * desconto) / 100;
        Double valorPagar = subTotal - vlrDesconto;
        System.out.println("O valor a ser pago é: "+valorPagar);

        scanner.close();
    }
}
