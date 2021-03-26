package cursoLogica.orientacaoObjetos.ex04;

public class ExibirPedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.setCodigo(10);
        pedido.setDescontoPercentual(5.0);
        pedido.setSubtotal(300.0);
        pedido.setTotal();

        imprimir("Pedido nº: "+pedido.getCodigo()+" Subtotal R$ "+pedido.getSubtotal()+" Desconto à vista "+pedido.getDescontoPercentual()+"% (R$ "+(pedido.getSubtotal() * pedido.getDescontoPercentual())/100+"), Total R$ "+pedido.getTotal());
    }
    static void imprimir(String texto){
        System.out.println(texto);
    }
}
