package exercisetwo;

public class Application {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(10, 20, 20);
		// Caso deseje adicione um printf e limite a quantidade de casas decimais por exemplo: %.2f esse dois � a quantidade de casas decimais!
		System.out.println("Area �: " + rectangle.area());
		System.out.println("Perimetro �: " + rectangle.perimetro());
		System.out.println("Diagonal �: " + rectangle.diagonal());
		System.out.println("Volume �: " +  rectangle.volume());
		

	}

}
