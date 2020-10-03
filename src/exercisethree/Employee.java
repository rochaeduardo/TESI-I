package exercisethree;

/**Crie uma classe que represente um funcion�rio e realize os testes de funcionalidade. 
 * A classe deve conter os atributos nome, cargo, sal�rio bruto e descontos. 
 * A classe deve prover os seguintes comportamentos: 
 * � Capacidade de realizar o aumento de sal�rio com base em um percentual; � 
 * Calcular o sal�rio l�quido; �
 *  Exibir o nome e sal�rio liquido do funcion�rio.
 *  
 *  @author Eduardo Rocha
*/
public class Employee {
	/**
	 * [NOTA]: Observe que o Java utiliza como  conven��o(Sugest�o) camelCase
	 * neste exemplo temos o atributo grossSalary utilizando a conven��o, trata-se da primeira palavra ser escrita em 
	 * caixa baixa e as palvras subsequentes por caixa alta, isso facilita a leitura.
	 */
	
	// atributtes
	String name;
	String office;
	Double grossSalary,  discounts;

	// constructor
	public Employee(String name, String office, Double grossSalary, Double discounts) {
		super();
		this.name = name;
		this.office = office;
		this.grossSalary = grossSalary;
		this.discounts = discounts;
	}
	
	
    // obtem sal�rio liquido
	double netSalary() {
			return 	grossSalary - discounts;
	}
	
	// aumento no salario 
	public Double increaseSalary(int percentage) {
		return grossSalary = grossSalary + ( grossSalary * (percentage/100.0));
	}
	
	// obtem dados funcion�rio.
	public String getDataEmployee() {
		return String.format("Funcion�rio:\n Nome: %s\nSal�rio: R$%.2f", name, grossSalary);
	}

	
	
	
	
}
