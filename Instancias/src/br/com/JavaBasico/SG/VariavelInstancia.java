package br.com.JavaBasico.SG;
/* Clase Gradebook que cont�m uma vari�vel de inst�ncia coursename
 * e m�todos para configurar e obter seu valor
 */
public class VariavelInstancia {
	private String courseName; // Nome do curso para esse GradeBook
	
	//M�todo para configurar o nome do curso
	public void setCourseName(String name) {
		courseName = name; //armazena o nome do curso
	}// Termina o m�todo setCourseName
	
	// M�todo para recuperar o nome do curso
	public String getCourseName() {
		return courseName;
	}// Termina o m�todo getCourseName
	
	//Exibe uma mensage de boas-vindas para o usu�rio GradeBook
	public void displayMessage() {
		/* Essa instru��o chama getCourseName para obter o
		 * nome do curso que esse GradeBook representa
		 */
		System.out.printf("Welcome to the grade book for\n%s!\n", getCourseName());
	}// Termina o m�todo displayMessage
	
} // fim da classe
