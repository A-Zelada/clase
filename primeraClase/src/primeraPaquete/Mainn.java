package primeraPaquete;

public class Mainn {

	public static void main(String[] args) {

		Mamifero m1 = new Mamifero(false, 0, 0, null, null, 0);

		m1.setFecha_nacimiento("01/01/2003");
//		m1.setEspecie("Homo sapiens sapiens");
//		m1.setSexo_masculino(true);
//		m1.setPeso(70);
//		m1.peso = 80;
//		m1.setAltura(1.90);
//		m1.setTiempo_gestacion_dias(270);

		// ----------------------Clase Persona-----------------
		persona m2 = new persona("sas", true, 50, 180, "1/1/1");
		m2.setAltura(1.8);
		m2.setPeso(90);
		m2.setDni("123456798Z");
		m2.setFecha_nacimiento("02/02/2004");
		m2.setSexo_masculino(true);
		m2.mostrarInfo();
		// ------------------------Clase avion-------------------
		avion m3 = new avion();
		m3.setMotor("superveloz3.1");
		m3.setNumero_Asientos(200);
		m3.setNumero_Chasis(200);
		m3.setVentanas(100);
		m3.mostrarInfo();
		// ------------------------Clase perro-------------------
		Perro m4 = new Perro();
		m4.setFecha_Nacimiento("01/01/1001");
		m4.setNacionalidad("francia");
		m4.setNum_Chip(100001200);
		m4.setTamaño("Grande");
		m4.mostrarInfo();
		// ------------------------Clase piso----------------------
		piso m5 = new piso();
		m5.setBaño(2);
		m5.setCocina(2);
		m5.setHabitaciones(5);
		m5.setOcupado(true);
		m5.mostrarInfo();
		// --------------------Clase Mesa----------------------
		mesa m6 = new mesa();
		m6.setColores("rojo");
		m6.setForma("redonda");
		m6.setMaterial("caoba");
		m6.setPatas(1);
		m6.mostrarInfo();
		// -------------------Clase Moto-----------------------
	}

	char c;
	byte k;
	int p = 400;
	double d = 34.6;
	{
		c = (char) d;
		k = (byte) p;
	}

}
