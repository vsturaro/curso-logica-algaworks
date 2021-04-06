package bibliotecapropria;

import console.Interacao;

public class BibliotecaPropria {

	public static void main(String[] args) {

		Interacao interacao = new Interacao();
		
		Integer numero = interacao.lerNumero("Digite um numero: ");
		interacao.imprimir("Numero: "+numero);
		
		Double numeroDecimal = interacao.lerDecimal("Digite um número decimal: ");
		interacao.imprimir("Numero decimal: "+numeroDecimal);
		
		interacao.erro("Essa é uma mensagem de erro");
		
		interacao.fechar();

	}

}
