import java.util.Scanner;

public class AparatoElectrico {
	Scanner numero= new Scanner(System.in);
	boolean A[]={false,false,false,false,false,false};
	boolean dispositivos;
	int numerito;
	int contador;
	int suma;
	int B[]= {0,0,0,0,0,0};
	int pan;
	
	public int hacer() {
		System.out.println("Pulsa 1 para encender/apagar un dispositivo");
		System.out.println("Pulsa 2 para comprobar la potencia");
		System.out.println("Pulsa 3 para agregar un aparato");
		pan=numero.nextInt();
		switch (pan) {
		case 1:
			encenderApagar();
			break;
		case 2:
			potencias();
			break;
		case 3:
			dispositivo();
	break;
		default:
			break;
		}
		return contador;
	}
	public boolean encenderApagar() {
		
		System.out.println("introduce el numero del dispositivo que quieres usar");
		contador=numero.nextInt();
		System.out.println("introduce como quieres que este el dispositivo");
		A[contador]=numero.nextBoolean();
		return dispositivos;
		
	}
	public boolean dispositivo() {
		
		System.out.println("¿Cuantos dispositivos quieres conectar?");
		numerito=numero.nextInt();
		for (int i = 0; i < numerito; i++) {
			System.out.println("introduce el numero del dispositivo que quieres usar");
			contador=numero.nextInt();
			System.out.println("introduce como quieres que este el dispositivo");
			A[contador]=numero.nextBoolean();
			System.out.println("introduce su potencia");
			B[contador]=numero.nextInt();
		}
		numero.close();
		return dispositivos;
	}
	public int potencias() {
		for (int i = 0; i < A.length; i++) {
			if (A[i]==true) {
				suma=suma+B[i];
			}
		}
		System.out.println("la suma de las potencias es "+suma);
		return contador;
	}
	public boolean[] getA() {
		return A;
	}
	public void setA(boolean[] a) {
		A = a;
	}
	public boolean isDispositivos() {
		return dispositivos;
	}
	public void setDispositivos(boolean dispositivos) {
		this.dispositivos = dispositivos;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public int getSuma() {
		return suma;
	}
	public void setSuma(int suma) {
		this.suma = suma;
	}
	public int[] getB() {
		return B;
	}
	public void setB(int[] b) {
		B = b;
	}
}
