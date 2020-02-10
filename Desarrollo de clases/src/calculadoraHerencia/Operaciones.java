package calculadoraHerencia;

import java.util.Scanner;

public class Operaciones {
	Scanner numero= new Scanner(System.in);
	double operador1;
	double operador2;
	double resultado;
	int operacion;
	public double info(){
		System.out.println("Introduce el operador 1");
		operador1=numero.nextDouble();
		System.out.println("Introduce el operador 2");
		operador2=numero.nextDouble();
		System.out.println("Operacion 1(suma),2(resta),3(multiplicacion),4(division)");
		operacion=numero.nextInt();
		switch (operacion) {
		case 1:
			Suma p1=new Suma();
			p1.suma(operador1, operador2);
			break;
		case 2:
			Resta p2=new Resta();
			p2.resta(operador1, operador2);
			break;
		case 3:
			Multiplicacion p3=new Multiplicacion();
			p3.multiplicacion(operador1, operador2);
			break;
		case 4:
			Division p4=new Division();
			p4.division(operador1, operador2,resultado);
			break;
		default:
			break;
		}
		
		return resultado;
	}

	public double getOperador1() {
		return operador1;
	}
	public void setOperador1(double operador1) {
		this.operador1 = operador1;
	}
	public double getOperador2() {
		return operador2;
	}
	public void setOperador2(double operador2) {
		this.operador2 = operador2;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
}
