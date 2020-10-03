package exerciseone; // nomes de pacotes são escritos em minúsculo em Java.

/**
 * proposal: 1. Implemente uma classe chamada Aluno para deﬁnir os objetos que
 * representarão os alunos de uma escola. Essa classe deve declarar três
 * atributos: o primeiro para o nome, o segundo para o RG e o terceiro para a
 * data de nascimento dos alunos. Realize o teste desta classe criando
 * instancias da classe Aluno..
 * 
 * @author Eduardo Rocha
 * 
 */
public class Student { // Classe é escrita em maiúscula.

	/**
	 *  [NOTA]: Observe que o Java utiliza como convenção a utilização da convenção(Sugestão) camelCase
	 * neste exemplo temos o atributo dateOfBirth utilizando a convenção, trata-se da primeira palavra ser escrita em 
	 * caixa baixa e as palvras subsequentes por caixa alta, isso facilita a leitura.
	 */
	
	// attributes
	String name;
	String rg;
	String dateOfBirth;

	// Constructor
	public Student(String name, String rg, String dateOfBirth) {
		super();
		this.name = name;
		this.rg = rg;
		this.dateOfBirth = dateOfBirth;
	}

	/*
	 * Aqui estamos sobrescrevendo o método toString de forma a representar de forma
	 * textual nosso objeto. pois seu objeto retorna o nome da classe mais uma
	 * representação hexadecimal do código de hash do seu objeto
	 */
	@Override
	public String toString() {

		return "Nome: " + name + " possuí rg de número: " + rg + " e nasceu no dia: " + dateOfBirth;
	}

}
