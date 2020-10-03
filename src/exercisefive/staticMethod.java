package exercisefive;

public class staticMethod {

	static final double PI = 3.1415926535898;
	// Áreas 
public static Float circleArea (float radius) {
	return (float) (PI * radius *radius);
}

public static Float rectangleArea (float base, float height) {
	return base * height ;
}


public static Float triangleArea (float base, float height) {
	return (base * height)/2 ;
}

public static Float squareArea(float l) {
	return l * l ;
}

// Volumes
public static Double cubeVolume (double l) {
	return Math.pow(l, 3) ;
}

public static Double ParallelepipedVolume (double a, double b, double c) {
	return a*b*c;
}

public static Double sphereVolume(double raio) {
	  return (4.0/3.0) * PI *(raio*raio*raio);  
}

public static Double cylinderVolume(int radius, int height) {
	  return PI*(radius*radius)*height; 
}


}
