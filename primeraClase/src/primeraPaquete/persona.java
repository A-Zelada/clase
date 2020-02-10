package primeraPaquete;

//Queremos crear una clase Mamifero
public class persona 
{public persona(String dni, boolean sexo_masculino, int peso, double altura, String fecha_nacimiento) {
		super();
		this.dni = dni;
		this.sexo_masculino = sexo_masculino;
		this.peso = peso;
		this.altura = altura;
		this.fecha_nacimiento = fecha_nacimiento;
	}

//Con las llaves decimos que aquí empieza mi clase
	

	//Estos son nuestro atributos
	//Se ponen SIEMPRE al principio de la clase ¿verdad?
	String dni;
	boolean sexo_masculino;//Lógico
	int  peso;//Entero
	double altura;//Real
	String fecha_nacimiento;//Cadena
	//Aquí empezamos a tener todos nuestros métodos
	public String getDni() {
		return dni;
	}

	public void setDni(String _dni) {
		this.dni = _dni;
	}

	public boolean isSexo_masculino() {
		return sexo_masculino;
	}

	public void setSexo_masculino(boolean sexo_masculino) 
	{
		this.sexo_masculino = sexo_masculino;
	}

	public int getPeso() {
		return peso;//Aquí devolvemos el valor, es peso <- getPeso() del PSeInt
	}

	public void setPeso(int peso) 
	{
		this.peso = peso;
	}

	public double getAltura() 
	{
		return altura;
	}

	public void setAltura(double altura) 
	{
		this.altura = altura;
	}


	public String getFecha_nacimiento() 
	{
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	void mostrarInfo()
	{
		System.out.println("Mostramos la información de la persona");
		System.out.println("dni: "+getDni());
		System.out.println("Altura: "+getAltura());
		System.out.println("Peso: "+getPeso());
		System.out.println("Fecha nacimiento:"+getFecha_nacimiento());
		if (isSexo_masculino())//Si (condición) entonces
			System.out.println("su género masculino");//entonces hacemos esto
		else//sino
			System.out.println("su género femenino");//Pues hacemos esto :)
	}
}//Aquí termina nuestra clase
