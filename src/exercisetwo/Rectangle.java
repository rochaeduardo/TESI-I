package exercisetwo;

/**
 * Crie as classe Retângulo e implemente os comportamentos área, perímetro,
 * diagonal e volume todos com retorno de dados.
 * 
 * @author Eduardo Rocha
 */
public class Rectangle {
	// attributes
	double width, length, height;

	// Constructor
	public Rectangle(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double area() {
		return width * length;
	}

	public double perimetro() {
		return (width * 2) * (length * 2);
	}

	public double diagonal() {
		return width * width + length * length;
	}

	public double volume() {
		return width * length * height;
	}

}
