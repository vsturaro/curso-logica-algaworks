package cursoLogica.orientacaoObjetos.encapsulamento;

public class Encapsulamento {
    public static void main(String[] args) {

/*        Cliente cliente = new Cliente();

        cliente.nome = "Vander";
        cliente.telefone = "67991220489";

        System.out.println("Nome do cliente: "+cliente.nome);*/

        Cliente cliente = new Cliente();
        cliente.setNome("Vandercleison Sturaro");
        cliente.setTelefone("67991220489");

        System.out.println("Nome do cliente: "+cliente.getNome());
        System.out.println("Primeiro nome: "+cliente.getPrimeiroNome());
        System.out.println("Ultimo nome: "+cliente.getUltimoNome());
    }
}
