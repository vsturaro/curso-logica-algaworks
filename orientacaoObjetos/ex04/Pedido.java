package cursoLogica.orientacaoObjetos.ex04;

public class Pedido {

    Integer codigo;
    Double subtotal;
    Double descontoPercentual;
    //Double total;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getDescontoPercentual() {
        return descontoPercentual;
    }

    public void setDescontoPercentual(Double descontoPercentual) {
        this.descontoPercentual = descontoPercentual;
    }

    public Double getTotal() {
        return subtotal - (subtotal * (descontoPercentual / 100));
    }

    public void setTotal() {

    }

/*    public void setTotal(Double total) {
        total ;
    }*/

}
