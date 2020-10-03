package exercisefive;

public class Program {

	public static void main(String[] args) {
		
		/**
		 * Atenção pode haver variação no resultado pelo valor do PI passado, a diferença pode ocorrer apói
		 * as casas decimais.
		 */
          System.out.printf("Área do circulo é : %.2f\n", staticMethod.circleArea(2));
          System.out.printf("Área do Retangulo é : %.2f\n", staticMethod.rectangleArea(12, 25));
          System.out.printf("Área do Triangulo é : %.2f\n", staticMethod.triangleArea(12, 25));
          System.out.printf("Área do Quadrado é : %.0f\n", staticMethod.squareArea(12));
          System.out.printf("Volume do cubo é : %.2f\n", staticMethod.cubeVolume(12));
          System.out.printf("Volume do  Paralelepípedo  é : %.2f\n", staticMethod.ParallelepipedVolume(4.0,4.4,4.0));
          System.out.printf("Volume da esfera  é : %.2f\n", staticMethod.sphereVolume(20));
          System.out.printf("Volume do cilindro  é : %.2f\n", staticMethod.cylinderVolume(20, 20));   
	}

}
