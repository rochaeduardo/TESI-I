package exercisefive;

public class Program {

	public static void main(String[] args) {
		
		/**
		 * Aten��o pode haver varia��o no resultado pelo valor do PI passado, a diferen�a pode ocorrer ap�i
		 * as casas decimais.
		 */
          System.out.printf("�rea do circulo � : %.2f\n", staticMethod.circleArea(2));
          System.out.printf("�rea do Retangulo � : %.2f\n", staticMethod.rectangleArea(12, 25));
          System.out.printf("�rea do Triangulo � : %.2f\n", staticMethod.triangleArea(12, 25));
          System.out.printf("�rea do Quadrado � : %.0f\n", staticMethod.squareArea(12));
          System.out.printf("Volume do cubo � : %.2f\n", staticMethod.cubeVolume(12));
          System.out.printf("Volume do  Paralelep�pedo  � : %.2f\n", staticMethod.ParallelepipedVolume(4.0,4.4,4.0));
          System.out.printf("Volume da esfera  � : %.2f\n", staticMethod.sphereVolume(20));
          System.out.printf("Volume do cilindro  � : %.2f\n", staticMethod.cylinderVolume(20, 20));   
	}

}
