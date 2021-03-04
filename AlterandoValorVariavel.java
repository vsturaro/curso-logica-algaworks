package cursoLogica;

import java.util.Scanner;
/*
Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto
que se deseja. Com essas informações encontre o subtotal que será o valor do produto multiplicado
pela quantidade.
Depois você vai precisar usar uma estrutura de decisão. Se a quantidade desejada do produto for
maior que 10 unidades, vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor
que 10, você NÃO aplica desconto algum.
Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da
quantidade) você multiplica o subtotal pelo próprio percentual e divide tudo por 100.
Tendo o valor referente ao percentual de desconto, você vai retirar esse valor do subtotal.
O que sobrar será o valor total final e deverá ser apresentado no console.
 */
public class AlterandoValorVariavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite o tipo do pagamento (1 = à vista / 2 = a prazo): ");
        Integer tipoPagamento = scanner.nextInt();

        Boolean pagamentoAVista = tipoPagamento.equals(1); //integer aceita equals, mesmo significado = a
        Double juros = 0.0;
        if(!pagamentoAVista){ //!neganco a condição
            juros = 10.0;
        }
       /* else {
            juros = 10.0;
        }*/
        Double acrescimo = valorProduto * juros / 100;
        Double valorTotal = acrescimo + valorProduto;

        System.out.println("Valor total: "+valorTotal);
        scanner.close();
    }
}
