//Criar e manipular um objeto GradeBook
import java.util.Scanner; // programa utiliza Scanner
public class GradeBookTest {
	//M�todo main inicia a execu��o de programa
	public static void main(String[] args) {
		//Cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		//Cria um objeto GradeBook e o atribui a myGradeBook
		GradeBookTest myGradeBook = new GradeBookTest();
		
		//Exibe valor inicial de courseName
		System.out.printf("Initial course name is: %s\n\n", myGradeBook.getCourseName());
		
		//solicita e l� o nome do curso
		System.out.println("Please enter the course name: ");
		String theName = input.nextLine();// L� uma linha de texto
		myGradeBook.setCourseName(theName); // Configura o nome do curso
		System.out.println();// Gera sa�da de uma linha em branco
		
		//Exibe mensagem de boas-vindas depois de especificar nome do curso
		myGradeBook.displayMesage();
	}//fim do main

	private void displayMesage() {
		
	}

	private void setCourseName(String theName) {
		
	}

	private Object getCourseName() {
		return null;
	}

}// fim da classe
