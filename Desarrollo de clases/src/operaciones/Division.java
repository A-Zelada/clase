package operaciones;
import javax.swing.JOptionPane;
import calculadoraHerencia.Operaciones;

public class Division extends Operaciones{
	public double division(double operador1,double operador2,double resultado){
		resultado=operador1;
		int contador=0;
		double i;
		if (operador1==0 && operador2==0) {
			JOptionPane.showMessageDialog(null, "SYNTAX ERROR", "problemas", JOptionPane.WARNING_MESSAGE);
		}else {
			for (i = operador2; i <= resultado;) {
				resultado-=operador2;
				contador++;	
			}
			JOptionPane.showMessageDialog(null, "El resultado de la division es :"+contador, "Respuesta", JOptionPane.WARNING_MESSAGE);
		}
		return resultado;
	}

}
