package bibliotecaEmails;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaEmail {
	public static void main(String[] args) throws EmailException {

		carteiro.enviar("user@gmail.com", 
				"TestMail - Aula Biblioteca terceiros", 
				"Se ver esse email é porque funcionou :-)");
		
		System.out.println("Fim...");
	}

}
