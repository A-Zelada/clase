package primeraPaquete;

public class moto {
	String motor;
	String matricula;
	int numero_Chasis;
	//------get and set---------------
	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumero_Chasis() {
		return numero_Chasis;
	}

	public void setNumero_Chasis(int numero_Chasis) {
		this.numero_Chasis = numero_Chasis;
	}
	//-----info----
	void mostrarInfo()
	{
		System.out.println("Mostramos la información de la moto");
		System.out.println("Fecha de nacimiento: "+getMotor());
		System.out.println("Nacionalidad: "+getNumero_Chasis());
		System.out.println("Numero de chip: "+getMatricula());
	
	}
}
