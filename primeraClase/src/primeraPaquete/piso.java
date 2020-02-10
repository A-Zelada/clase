package primeraPaquete;

public class piso {
	boolean ocupado;
	int baño;
	int cocina;
	int habitaciones;
	//------get and set
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	public int getBaño() {
		return baño;
	}
	public void setBaño(int baño) {
		this.baño = baño;
	}
	public int getCocina() {
		return cocina;
	}
	public void setCocina(int cocina) {
		this.cocina = cocina;
	}
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}
	//-----info----
	void mostrarInfo()
	{
		System.out.println("Mostramos la información del avion");
		System.out.println("Fecha de nacimiento: "+getBaño());
		System.out.println("Nacionalidad: "+getCocina());
		System.out.println("Numero de chip: "+getHabitaciones());
		if (isOcupado()) {
			System.out.println("El piso esta ocupado");
		}else {
			System.out.println("El piso esta disponible");
		}
	}
}
