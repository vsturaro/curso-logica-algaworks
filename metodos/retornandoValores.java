package cursoLogica.metodos;

public class retornandoValores {
    public static void main(String[] args) {

/*      Integer numeroQualquer = numeroAleatorio();
        System.out.println("Numero: "+ numeroQualquer);
    }
    static Integer numeroAleatorio(){
        Integer numero = 1;
        return numero;
    }*/
        Double[] premissaInicial = new Double[] {1325.2, 100.0};
        Double proporcao = 20.0;

        Double resultadoFinal = regraTres(premissaInicial, proporcao);

        System.out.println("Resultado: "+resultadoFinal);

    }
    //esquema regra de tres
    // 50 --- 100%
    // x  --- 20%
    // 50 * 20 = 100 * x
    // x = (50 * 20) / 100

    static Double regraTres(Double[] premissa, Double proporcao){
        Double resultado = premissa[0] * proporcao / premissa[1];
        return resultado;
    }
}
