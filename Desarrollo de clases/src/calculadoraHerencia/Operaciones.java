package calculadoraHerencia;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import operaciones.Division;
import operaciones.Multiplicacion;
import operaciones.Resta;
import operaciones.Suma;
//Clase padre Operaciones
//Clases hijas, las que heredan, Division Suma resta....
//¡¡¡¡¡El padre está llamando a las clases hijas!!!!!
//Es decir, bucle de creación: Operacion > Resta > Operacion 

public class Operaciones {
	Scanner numero= new Scanner(System.in);
	double operador1;
	double operador2;	
	static double resultado;
	int operacion;
	public double info(){
		operador1=Double.parseDouble(JOptionPane.showInputDialog("Introduce el operador 1"));
		String[] options = {"Suma", "Resta", "Multiplicacion", "Division"};
		Icon icon = null;
		int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,icon, options, options[0]);
		operador2=Double.parseDouble(JOptionPane.showInputDialog("Introduce el operador 2"));
		switch (seleccion) 
		{
			case 0:
				Suma p1=new Suma();
				p1.suma(operador1, operador2);
				break;
			case 1:
				Resta p2=new Resta();
				p2.resta(operador1, operador2);
				break;
			case 2:
				Multiplicacion p3=new Multiplicacion();
				p3.multiplicacion(operador1, operador2);
				break;
			case 3:
				Division p4=new Division();
				p4.division(operador1, operador2,resultado);
				break;
			default:
				break;
		}
		
		return resultado;
	}
	public double info2() {
		String[] options = {"Otra operacion", "Salir"};
		Icon icon = null;
		int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,icon, options, options[0]);
		switch (seleccion) {
		case 0:
			operador1=getResultado();
			operador2=Double.parseDouble(JOptionPane.showInputDialog("Introduce el operador"));
			switch (seleccion) {
			case 0:
				Suma p1=new Suma();
				p1.suma(operador1, operador2);
				break;
			case 1:
				Resta p2=new Resta();
				p2.resta(operador1, operador2);
				break;
			case 2:
				Multiplicacion p3=new Multiplicacion();
				p3.multiplicacion(operador1, operador2);
				break;
			case 3:
				Division p4=new Division();
				p4.division(operador1, operador2,resultado);
				break;
			default:
				break;
			}
			info2();
		case 1:
			System.out.println("final");
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
