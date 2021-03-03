package cursoLogica;
import java.util.Scanner; //ctrl+shift+o para importar blibliotecas

public class CalcularTroco {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //uma das maneiras de fazer leitura de dados informados pelo usuario
		
		System.out.print("Digite o valor do produto: "); //exibe texto na tela para entrar com o valor
		Double valorProduto = scanner.nextDouble();//valorProduto variavel que recebera o valor digitado
		
		System.out.print("Digite valor passado pelo cliente: "); //exibe texto na tela para entrar com o valor
		Double valorCliente = scanner.nextDouble(); //recebe o valor do cliente
		
		Double resultado = valorCliente - valorProduto;
		
		System.out.println("Valor do produto: " + valorProduto); //+ operador concatenacao
		System.out.println("Valor passado pelo cliente: " + valorCliente);
		System.out.println("Valor troco a ser dado ao cliente: " + resultado);

		scanner.close();
	}

}