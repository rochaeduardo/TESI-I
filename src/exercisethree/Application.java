package exercisethree;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Eduardo", "Programador", 3000.0, 10.0);
		
		System.out.println("Nome: " + emp.name);
		System.out.printf("Salário bruto: R$ %.2f\n", emp.grossSalary);
		emp.increaseSalary(10);
		System.out.printf("Salário bruto com reajuste: R$ %.2f\n ", emp.grossSalary);
		System.out.printf("Salário Liquído:  R$ %.2f\n", emp.netSalary());
			}
}
