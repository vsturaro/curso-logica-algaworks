package cursoLogica.orientacaoObjetos.ex02;

public class ControleEstoque {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Arroz";
        produto.quantidadeEstoque = 9;

        System.out.println("É necessário repor o estoque do produto: "+produto.nome+"? "+produto.reporEstoque());

    }

}
