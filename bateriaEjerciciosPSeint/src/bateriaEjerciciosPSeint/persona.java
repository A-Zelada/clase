package bateriaEjerciciosPSeint;

public class persona {
	
	String nombre;
	String apellidos;
	int edad;
	boolean casado;
	String dni;
	
	public persona(String nombre, String apellidos, int edad, boolean casado, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.casado = casado;
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	persona nueva_persona=new persona("nombre","apellidos",1,true,"dni");
	int numerotelf;{
	if (numerotelf!=12132) {
		while(numerotelf>1) {
		System.out.println("numero correcto");
		numerotelf++;
	}}
	
	
	
}}
