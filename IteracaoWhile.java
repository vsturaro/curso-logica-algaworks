package cursoLogica;

public class IteracaoWhile {
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++){
            System.out.println("um texto qualquer");
        }*/

/*        int i = 0;
        while (i < 10){
            System.out.println("um texto qualquer");
            i++;
        }
        //		int i = 0;
//		while (i < 10) {
//			if (i == 5) {
//				System.out.println("Vai parar!");
//				break;
//			}
//			System.out.println(i + ": Um texto qualquer.");
//			i++;
//		}*/
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                System.out.println("Vai continuar...");
                i++; //incrementar para não dar loop infinito
                continue;
            }

            System.out.println(i + ": Um texto qualquer.");
            i++;
        }
    }
}
