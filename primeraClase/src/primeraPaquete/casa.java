package primeraPaquete;

public class casa {
	int capacidad;
	int pisos;
	boolean ocupada;
	//---------get and set------
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getPisos() {
		return pisos;
	}
	public void setPisos(int pisos) {
		this.pisos = pisos;
	}
	public boolean isOcupada() {
		return ocupada;
	}
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	//-----------info------------
	void mostrarInfo()
	{
		System.out.println("Mostramos la información del avion");
		System.out.println("Motor: "+getCapacidad());
		System.out.println("Numero de chasis: "+getPisos());
		if (isOcupada()) {
			System.out.println("Esta ocupada");
		}else {
			System.out.println("No esta ocupada");
		}
	}
}
