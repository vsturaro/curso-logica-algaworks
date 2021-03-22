package cursoLogica.vetores;

public class vetoresMaisDuasDimensoes {

        public static void main(String[] args) {
            Double[] faturamentoJaneiro = new Double[] { 1500.0, 2000.0, 1700.0 };
            Double[] faturamentoFeveriro = new Double[] { 1000.0, 2500.0, 1800.0 };

            Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFeveriro };

            Double[][][] faturamentoQuinquenal = new Double[][][] { faturamentoAnual };

            Double[][][][] faturamentoDecada = new Double[][][][] { faturamentoQuinquenal }; //o valor de um vetor de mais de uma dimensão
            // deve ser um vetor com uma dimensão a menos

 /*           for (int i = 0; i < faturamentoAnual.length; i++) {
                System.out.println("Mês: " + (i + 1));

                Double[] mes = faturamentoAnual[i];

                for(int y = 0; y < mes.length; y++) {
                    Double dia = mes[y]; // Double dia = faturamentoAnual[i][y];

                    System.out.println("Dia " + (y + 1) + ": " + dia);
                }
            }*/
        }
}
