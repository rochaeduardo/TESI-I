package exercisethree;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Eduardo", "Programador", 3000.0, 10.0);
		
		System.out.println("Nome: " + emp.name);
		System.out.printf("Sal�rio bruto: R$ %.2f\n", emp.grossSalary);
		emp.increaseSalary(10);
		System.out.printf("Sal�rio bruto com reajuste: R$ %.2f\n ", emp.grossSalary);
		System.out.printf("Sal�rio Liqu�do:  R$ %.2f\n", emp.netSalary());
			}
}
