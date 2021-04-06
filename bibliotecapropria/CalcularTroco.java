package bibliotecapropria;

import console.Interacao;

public class CalcularTroco {
	
	public static void main(String[] args) {
		Interacao interacao = new Interacao();
		
		Double valorProduto = interacao.lerDecimal("Digite o valor do produto: ");
		
		Double valorCliente = interacao.lerDecimal("Digite o valor passado pelo cliente: ");
		
		Double resultado = valorCliente - valorProduto;
		
		interacao.imprimir("Valor do troco a ser dado ao cliente: "+resultado);
		
		interacao.fechar();

	}

}