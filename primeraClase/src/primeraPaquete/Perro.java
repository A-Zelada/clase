package primeraPaquete;

public class Perro {
	String tamaño;
	int num_Chip;
	String nacionalidad;
	String fecha_Nacimiento;
	//--------get and set---
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public int getNum_Chip() {
		return num_Chip;
	}
	public void setNum_Chip(int num_Chip) {
		this.num_Chip = num_Chip;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getFecha_Nacimiento() {
		return fecha_Nacimiento;
	}
	public void setFecha_Nacimiento(String fecha_Nacimiento) {
		this.fecha_Nacimiento = fecha_Nacimiento;
	}
	//--------------------
	void mostrarInfo()
	{
		System.out.println("Mostramos la información del avion");
		System.out.println("Fecha de nacimiento: "+getFecha_Nacimiento());
		System.out.println("Nacionalidad: "+getNacionalidad());
		System.out.println("Numero de chip: "+getNum_Chip());
		System.out.println("Tamaño: "+getTamaño());
	}
}
