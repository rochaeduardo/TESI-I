package exercisethree;

/**Crie uma classe que represente um funcionário e realize os testes de funcionalidade. 
 * A classe deve conter os atributos nome, cargo, salário bruto e descontos. 
 * A classe deve prover os seguintes comportamentos: 
 * • Capacidade de realizar o aumento de salário com base em um percentual; • 
 * Calcular o salário líquido; •
 *  Exibir o nome e salário liquido do funcionário.
 *  
 *  @author Eduardo Rocha
*/
public class Employee {
	/**
	 * [NOTA]: Observe que o Java utiliza como  convenção(Sugestão) camelCase
	 * neste exemplo temos o atributo grossSalary utilizando a convenção, trata-se da primeira palavra ser escrita em 
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
	
	
    // obtem salário liquido
	double netSalary() {
			return 	grossSalary - discounts;
	}
	
	// aumento no salario 
	public Double increaseSalary(int percentage) {
		return grossSalary = grossSalary + ( grossSalary * (percentage/100.0));
	}
	
	// obtem dados funcionário.
	public String getDataEmployee() {
		return String.format("Funcionário:\n Nome: %s\nSalário: R$%.2f", name, grossSalary);
	}

	
	
	
	
}
