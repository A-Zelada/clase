package calculadoraHerencia;

public class Suma extends Operaciones {
	public double suma(double operador1,double operador2){
		resultado=operador1+operador2;
		System.out.println("El resultado es :"+resultado);
		return resultado;
	}
}
