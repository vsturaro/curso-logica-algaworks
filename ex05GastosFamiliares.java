package cursoLogica;

import java.util.Scanner;

public class ex05GastosFamiliares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double totalGastosMes = 0.0;

        System.out.print("Informe o valor da conta de luz: ");
        totalGastosMes += scanner.nextDouble();

        System.out.print("Informe o valor da conta de água: ");
        totalGastosMes += scanner.nextDouble();

        System.out.print("Informe o valor da conta de telefone: ");
        totalGastosMes += scanner.nextDouble();

        System.out.print("Informe o valor da escola dos filhos: ");
        totalGastosMes += scanner.nextDouble();

        System.out.print("Informe o valor da fatura do cartão: ");
        totalGastosMes += scanner.nextDouble();

        System.out.print("Informe o valor dos gastos em supermercado: ");
        totalGastosMes += scanner.nextDouble();

        System.out.println("Os gastos mensais totais da família foram R$: "+totalGastosMes);

        scanner.close();
    }
}
