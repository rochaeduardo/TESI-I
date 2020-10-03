package exercisefour;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Books book = new Books(); // criamos um construtor vazio na classe livro
		
			System.out.println("Informe o nome do livro: ");
			String name = sc.nextLine();
			book.setName(name);
		
			System.out.println("Informe a descrição do livro: ");
			String description = sc.nextLine();
			book.setDescription(description);
			
			Double value;
			do {
			System.out.println("Informe o valor: ");
		    value = sc.nextDouble();
			book.setValue(value);
			} while(value <0);
			
				System.out.println("Informe o ISBN: ");
				sc.nextLine();
				String isbn = sc.nextLine();
				book.setIsbn(isbn);
				
				System.out.println(book);
	}

	


}
