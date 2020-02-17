package operaciones;
import javax.swing.JOptionPane;
import calculadoraHerencia.Operaciones;

public class Resta extends Operaciones {
	public double resta(double operador1,double operador2) {
	setResultado(operador1-operador2);
	JOptionPane.showMessageDialog(null, "El resultado es :"+getResultado(), "Resultado", JOptionPane.WARNING_MESSAGE);
	return getResultado();
	}
}
