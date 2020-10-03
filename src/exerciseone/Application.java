package exerciseone;

public class Application {

	public static void main(String[] args) {
		/*
		 * Na classe Student declaramos um construtor com os campos name, rg e dateOfBirth com isso
		 * eu estou dizendo ao meu programa que minha classe deve ter estes 3 parametros.
		 */
		Student student = new Student("Eduardo Rocha", "50.033.510-2", "25/10/1991" );
		
		// Outra Forma seria setar atributos por atributos passando os valores o resultado é o mesmo.
//		student.name = "Ryube";
//		student.rg = "16.428.041-8";
//		student.dateOfBirth = "20/08/2000";
		
		System.out.println(student);

	}

}
