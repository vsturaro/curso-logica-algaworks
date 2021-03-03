package cursoLogica;

public class tiposNumericos {

    public static void main(String[] args) {
        //inteiros
        Byte numeroByte = 1; // de -128 a 127

        Short numeroShort = 1; // -32768 a 32767

        Integer numeroInteger = 1; // - 2147483648 a 2147483647 usar preferencialmente, mais utilizado na grande maioria

        Long numeroLong = 1L; //tem sempre que acompanhar com L

        //decimais
        Float numeroFloat = 1.0f; //tem q por f para identificar q é float e não dar problema

        Double numeroDouble = 1.0; //

        System.out.println(numeroByte);
        System.out.println(numeroShort);
        System.out.println(numeroInteger);
        System.out.println(numeroLong);
        System.out.println(numeroFloat);
        System.out.println(numeroDouble);

    }
}
