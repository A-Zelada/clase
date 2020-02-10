package bateriaEjerciciosPSeint;

public class metodosJava {
	
		double A;
		double B;
		public double getA() {
			return A;
		}
		public void setA(double a) {
			A = a;
		}
		public double getB() {
			return B;
		}
		public void setB(double b) {
			B = b;
		}
	
void info() {
	System.out.println("Este es el resultado de la suma es:"+(A+B) );
}
public metodosJava(double a, double b) {
	super();
	A = a;
	B = b;
};
public static double suma(double a,double b) {
	return a+b;
}
}
