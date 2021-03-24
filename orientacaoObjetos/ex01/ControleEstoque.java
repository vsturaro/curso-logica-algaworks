package cursoLogica.orientacaoObjetos.ex01;

public class ControleEstoque {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Arroz";
        produto.quantidadeEstoque = 20;

        System.out.println("É necessário repor o estoque do produto: "+produto.nome+"? "+reporEstoque(produto));

    }
    static Boolean reporEstoque(Produto produto){
        if (produto.quantidadeEstoque < Produto.QUANTIDADEMINIMAESTOQUE){ //compara estoque com a regra de negocio
           return true;
        }
       return false;
    }
}
