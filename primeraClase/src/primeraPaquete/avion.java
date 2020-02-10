package primeraPaquete;
public class avion 
{
	int numero_Asientos;
	int numero_Chasis;
	int ventanas;
	String motor;
	//------Getter and setters
	public int getNumero_Asientos() {
		return numero_Asientos;
	}

	public void setNumero_Asientos(int numero_Asientos) {
		this.numero_Asientos = numero_Asientos;
	}

	public int getNumero_Chasis() {
		return numero_Chasis;
	}

	public void setNumero_Chasis(int numero_Chasis) {
		this.numero_Chasis = numero_Chasis;
	}

	public int getVentanas() {
		return ventanas;
	}

	public void setVentanas(int ventanas) {
		this.ventanas = ventanas;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
	//-----------MOSTRAR
	void mostrarInfo()
	{
		System.out.println("Mostramos la información del avion");
		System.out.println("Motor: "+getMotor());
		System.out.println("Numero de chasis: "+getNumero_Chasis());
		System.out.println("Numero de ventanas: "+getVentanas());
		System.out.println("Numero de asientos: "+getNumero_Asientos());
	}

	
}//Aquí termina nuestra clase
