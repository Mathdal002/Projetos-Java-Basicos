// Cria objeto GradeBook e passa uma String para seu método displayMessage
import java.util.Scanner; // programa utiliza Scanner
public class GradeBookTest {
	// Método main inicia a execução de programa
	public static void main(String[] args) {
		// Cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		// Cria um objeto GradeBook e o atribui a MyGradeBook
		GradeBookTest myGradeBook = new GradeBookTest();
		
		// promt para entrada do nome do curso
		System.out.println("Please enter the course name:");
		String nameOfcourse = input.nextLine(); // Lê uma linha de texto
		System.out.println(); // gera a saida de uma linha de texto
		
		/* Chama método displayMessage de myGradeBook
		 * e passa nameOfCourse como argumento
		 */
		myGradeBook.displayMessage(nameOfcourse);	
	}
	private void displayMessage(String nameOfcourse) {	
	}

}
