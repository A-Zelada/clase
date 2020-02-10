
public class Rectangulo {
	
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private static int numRectangulos;
	public final String nombreFigura="Rectángulo";
	public static final double PI= 3.1416;
	private String nombre;



	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}

	public static int getNumRectangulos() {
		return numRectangulos;
	}

	public static void setNumRectangulos(int numRectangulos) {
		Rectangulo.numRectangulos = numRectangulos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreFigura() {
		return nombreFigura;
	}

	public static double getPi() {
		return PI;
	}
	public String toString() {
		 String info="X1"+getX1()+"X2"+getX2()+"Y1"+getY1()+"Y2"+getY2();
		 System.out.println(info);
		 return info;
	}
	public String obtenerNombre () { return nombre;}
	public void establecerNombre (String nom) {nombre= nom;}
	public double calcularSuperficie () {
	double area, base, altura;
	base= x2-x1;
	altura= y2-y1;
	area= base * altura;
	return area;
	}
	
}
