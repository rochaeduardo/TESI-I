package exercisefour;

public class Books {
	// ATTRIBUTES
	private String name;
	private String description;
	private Double value;
	private String isbn;

	// CONSTRUCTOR

	public Books(String name, String description, Double value, String isbn) {
		super();
		this.name = name;
		this.description = description;
		this.value = value;
		this.isbn = isbn;
	}

	public Books() {}
	
	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
	       if (value < 0) {
			System.out.println("Não é permitido o cadastro de valores negativos!");
		}
		this.value = value;

	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
//		return "Livro:  " + name + "\nDescrição: " + description + "\nValor: " + value + "\nISBN:  " + isbn;
		return String.format("Livro: %s\nDescricão: %s\nValor: R$ %.2f\nISBN: %s", name, description, value, isbn);
	}

}
