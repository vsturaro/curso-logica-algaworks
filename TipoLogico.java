package cursoLogica;

public class TipoLogico {
    public static void main(String[] args) {

        Boolean variavelVerdadeiro = true;
        System.out.println("Variavel Verdadeira " + variavelVerdadeiro);

        Boolean variavalFalso = false;
        System.out.println("Variavel falsa " + variavalFalso);

        System.out.println("-------------------------------------------");

        Integer idade = 15;
        Integer idadeCnh = 18;

        //regra da condição
        Boolean podeTirarCnh = idade >= 18;

        if(podeTirarCnh){
            System.out.println("Sim, já possui idade para retirar CNH, pois tem " + idade+" anos");
        }
        else {
            System.out.println("Infelizmente ainda não possui idade suficiente, pois tem apenas "+idade+" anos");
        }
        //System.out.println("Pode retirar CNH? " + podeTirarCnh);

    }
}
