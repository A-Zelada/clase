package calculadoraHerencia;

public class Division extends Operaciones{
	public double division(double operador1,double operador2,double resultado){
		resultado=operador1;
		double contador=0;
		for (double i = operador2; i < resultado; i++) {
			resultado=resultado-operador2;
			contador++;
		}
		System.out.println("El resultado de la division es :"+contador);
		return resultado;
	}

}
