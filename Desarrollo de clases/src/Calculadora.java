import java.util.Scanner;
public class Calculadora {
	Scanner numero= new Scanner(System.in);
	double []n= {};
	int contador=0;
	double resultado;
	double operando1;
	double operando2;
	public double suma(double operando1, double operando2) {
		System.out.println("introduce el primer operador");
		operando1=numero.nextDouble();
		for (int i = 0; i < 1; i++) {
			
		}
		return resultado;
	}
	public double resta() {
		System.out.println("introduce el primer operador");
		operando1=numero.nextDouble();
		System.out.println("introduce el segundo operador");
		operando2=numero.nextDouble();
		System.out.println("El resultado es :"+resultado);
		return resultado;
	}
	public double division() {
		System.out.println("introduce el primer operador");
		operando1=numero.nextDouble();
		System.out.println("introduce el segundo operador");
		operando2=numero.nextDouble();
		resultado=operando1/operando2;
		System.out.println("El resultado es :"+resultado);
		return resultado;
	}
	public double multiplicacion() {
		System.out.println("introduce el primer operador");
		operando1=numero.nextDouble();
		System.out.println("introduce el segundo operador");
		operando2=numero.nextDouble();
		resultado=operando1*operando2;
		System.out.println("El resultado es :"+resultado);
		return resultado;
	}
	public double resultado() {
		
		return resultado;
	}
}
