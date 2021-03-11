package cursoLogica;

import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class ex08EstruturasDecisao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a meta de faturamento do ano anterior: ");
        Double metaFaturamento = scanner.nextDouble();

        System.out.print("Digite o faturamento apurado do último ano: ");
        Double faturamentoReal = scanner.nextDouble();;

        System.out.print("Digite a média salarial do colaborador: ");
        Double mediaSalarial = scanner.nextDouble();

        Boolean bonusMaior = faturamentoReal >= metaFaturamento;
        Boolean bonusMenor = faturamentoReal <= metaFaturamento && ( faturamentoReal >= (metaFaturamento * 0.8));

        if(bonusMaior){
            System.out.println("A empresa bateu a meta! A bonificação do funcionáro será 100% no valor de R$: "+mediaSalarial);
        }
        else if (bonusMenor){
            Double CalculoBonusMenor = mediaSalarial * 0.8;
            System.out.println("A empresa atingiu 80% da meta! A bonificação do funcionário será 80% no valor de R$: "+CalculoBonusMenor);
        }
        else {
            System.out.println("A empresa não atingiu a meta de faturamento mínima, não haverá bonificação.");
        }
        scanner.close();
    }
}
