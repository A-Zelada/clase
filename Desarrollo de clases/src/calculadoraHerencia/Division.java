package calculadoraHerencia;

public class Division extends Operaciones{
	public double division(double operador1,double operador2,double resultado){
		resultado=operador1;
		double resultado2=0;
		double contador=0;
		double i;
		for (i = operador2; i <= resultado;) {
			resultado=resultado-operador2;
			contador++;	
		}
		if (i>=resultado) {
			for (int j = 0; j < 10; j++) {
				resultado2=resultado2+resultado;	
			}
			for (i = operador2; i <= resultado2;) {
				
				resultado2=resultado2-operador2;
				contador++;
			}
			double resultado3=0;
			for (int j = 0; j < 100; j++) {
				resultado3=resultado3-resultado2;
			}
		}
		System.out.println("El resultado de la division es :"+contador);
		return resultado;
	}

}
