package operaciones;
import javax.swing.JOptionPane;
import calculadoraHerencia.Operaciones;

public class Multiplicacion extends Operaciones{
	public double multiplicacion(double operador1,double operador2){
		if (operador1>operador2) {
			for (double i = 0; i < operador1; i++) {
				setResultado(getResultado() + operador2);
			}
		}else {
			for (double i = 0; i < operador2; i++) {
				setResultado(getResultado() + operador1);
			}
		}
		JOptionPane.showMessageDialog(null, "El resultado es :"+getResultado(), "Resultado", JOptionPane.WARNING_MESSAGE);
		return getResultado();
	}
}
