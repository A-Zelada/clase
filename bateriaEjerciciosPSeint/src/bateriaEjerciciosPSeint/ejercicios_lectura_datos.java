package bateriaEjerciciosPSeint;
import java.util.Scanner;
public class ejercicios_lectura_datos {
//--------------Ejercicio1---------------
	public static void ejercicio1(String args[]) {
		Scanner input1=new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String palabra=input1.next();
		System.out.println("Introduce una letra");
		float letra=input1.nextFloat();
		int contador=0;
		for (int i = 0; i < palabra.length(); i++) {
			char test=palabra.charAt(i);
			if (test==letra) {
				contador=contador+1;
			}		
		}
		input1.close();
		}
//	public void ejercicio2() {
//		Scanner input2=new Scanner(System.in);	
//	}
	public static String ejercicio3(String arg[]) {
		Scanner input3=new Scanner(System.in);
		
		
		input3.close();
		return ejercicio3(arg);
		
	}
	public static double ejercicio4(double x,double y) {
		Scanner input4=new Scanner(System.in);
		System.out.println("introduce la base");
		x=input4.nextDouble();
		System.out.println("introduce la altura");
		y=input4.nextDouble();
		double area=((x*1/2)*y)/3;
		System.out.println("El area es : "+area);
		input4.close();
		return area;
		
		
	}

}
