package bateria2;

public class circulo {
	public circulo(double radio, double xCentro, double yCentro, double resultado,double resultado2) {
		super();
		this.radio = radio;
		this.xCentro = 0;
		this.yCentro = 0;
		this.resultado = resultado;
		this.resultado2=resultado2;
	}
	double radio;
	double xCentro;
	double yCentro;
	double resultado;
	double resultado2;
	public void area() {
		resultado=Math.PI*radio*radio;
	}
	public void longitud(){
		resultado2=2*radio*Math.PI;
	}
	public void resultados(){
		System.out.println("El resultado es :"+resultado);
		System.out.println("El resultado es :"+resultado2);
//		for (int i = 0; i < array.length; i++) {
			
//		}
	}
}
