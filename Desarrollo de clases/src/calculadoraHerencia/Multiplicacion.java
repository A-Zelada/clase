package calculadoraHerencia;

public class Multiplicacion extends Operaciones{
	public double multiplicacion(double operador1,double operador2){
		for (int i = 0; i < operador1; i++) {
			resultado=resultado+operador2;
		}
		System.out.println("El resultado es :"+resultado);
		return resultado;
	}
}
