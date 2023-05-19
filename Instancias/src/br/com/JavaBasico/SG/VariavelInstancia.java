package br.com.JavaBasico.SG;
/* Clase Gradebook que contém uma variável de instância coursename
 * e métodos para configurar e obter seu valor
 */
public class VariavelInstancia {
	private String courseName; // Nome do curso para esse GradeBook
	
	//Método para configurar o nome do curso
	public void setCourseName(String name) {
		courseName = name; //armazena o nome do curso
	}// Termina o método setCourseName
	
	// Método para recuperar o nome do curso
	public String getCourseName() {
		return courseName;
	}// Termina o método getCourseName
	
	//Exibe uma mensage de boas-vindas para o usuário GradeBook
	public void displayMessage() {
		/* Essa instrução chama getCourseName para obter o
		 * nome do curso que esse GradeBook representa
		 */
		System.out.printf("Welcome to the grade book for\n%s!\n", getCourseName());
	}// Termina o método displayMessage
	
} // fim da classe
