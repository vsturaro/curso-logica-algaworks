package cursoLogica.orientacaoObjetos.ex02;

public class Produto {
static final Integer QUANTIDADEMINIMAESTOQUE = 10;
    String nome;
    Integer quantidadeEstoque;

    Boolean reporEstoque(){
        if (quantidadeEstoque < Produto.QUANTIDADEMINIMAESTOQUE){ //compara estoque com a regra de negocio
            return true;
        }
        return false;
    }
}
