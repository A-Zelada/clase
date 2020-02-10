package calculadoraHerencia;

public class Resta extends Operaciones {
	public double resta(double operador1,double operador2) {
	resultado=operador1-operador2;
	System.out.println("El resultado es :"+resultado);
	return resultado;
	}
}
