package cursoLogica;

public class IterecaoFor {
    public static void main(String[] args) {
        /*for(int i = 0; i < 5; i++){ //estrutura básica for(;;)<- aq vai a condição { aq dentro o que será executado enquanto for atendido }
            System.out.println("Aprendendo laço for!!");
       }*/
/*        Double[] carrinhoDeCompras = new Double[]{50.0, 51.0, 52.0};
        Double total = 0.0;
        for(int i= 0; i < carrinhoDeCompras.length; i++){ //lenght guarda informação de numero de itens do array
            System.out.println("Iteração: "+i+", Total: " +total);
            total = total +carrinhoDeCompras[i];
        }
        System.out.println("Total: "+total);*/

       /* for(int i = 0; i < 10; i++){
            if(i == 5){
                System.out.println("Vai parar!");
                break;
            }
            System.out.println("Iteração: "+i);
        }*/

/*         for(int i = 0; i < 10; i++){
            if(i == 5){
                System.out.println("Vai continuar!");
                continue;
            }
            System.out.println("Iteração: "+i);
        }*/

        Integer[] produtos = new Integer[]{100, 225, 300};

        for(int i = 0; i < produtos.length; i++){
            Integer produto = produtos[i];
            System.out.println("Porduto de código: "+produto);
            if(produto.equals(225)){
                System.out.println("Produto encontrado");
                break;
            }
        }
    }
}
