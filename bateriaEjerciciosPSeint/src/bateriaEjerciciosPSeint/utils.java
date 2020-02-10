package bateriaEjerciciosPSeint;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class utils {
	public static void ejercicio5(int numero){
		Scanner input5=new Scanner(System.in);
		int numeroAleatorio=(int)Math.floor(Math.random()*100);
		int contador=0;
		int contador2=0;
		while (contador<=6 && contador2!=1) {
			System.out.println("Introduce un numero");
			numero=input5.nextInt();
			if (numero==numeroAleatorio) {
				System.out.println("Muy bien has acertado!!");
				contador2++;
			}else {
				System.out.println("Has fallado");
				if (numero>numeroAleatorio) {
					System.out.println("es demasiado grande");
				}else {
					System.out.println("es demasiado pequeño");
				}
			if (contador==6) {
					System.out.println("has perdido");
				}
				contador++;
			}
		}
		input5.close();
	}
//	public static void ejercicio6(String cadenita, String cadenita2,int i,int j){
//		Scanner input6=new Scanner(System.in);
//			System.out.println("Introduce una frase");
//			cadenita=input6.nextLine();
//			System.out.println("introduce la segunda frase");
//			cadenita2=input6.nextLine();
//			boolean igual=cadenita.contains(cadenita2);
//		    if (cadenita.equals(cadenita2)) {
//		        System.out.println("Son iguales");
//		    }
//		    if (cadenita.contains(cadenita2)) {
//		    	for (i = 0,j=0; i < cadenita.length() && < cadenita2.length(); ++i) {
//		        if (cadenita.charAt(i) == cadenita2.charAt(j)) {
//		            System.out.print(cadenita2.charAt(i));
//		        }else {
//					j++;
//				}
//			    }
//		    	System.out.println(igual);
//			}
//		    
//		    input6.close();
//	}
	public static void ejercicio7(String cadenita,String cadenita2) {
		Scanner input7=new Scanner(System.in);
		System.out.println("Introduce una palabra");
		cadenita=input7.nextLine();
		for (int i = 0; i < cadenita.length(); i++) {
			System.out.print(cadenita.charAt(i));

		}
		for (int j = (cadenita.length())-2; j > -1; j--) {
			System.out.print(cadenita.charAt(j));
		}
		input7.close();
	}
	public static void ejercicio8(int i,double grados) {
			for (i = 0; i < 90; i=i+5) {
				
				double cos=Math.cos(i);
				grados=Math.toRadians(cos);
				System.out.println(cos);
			}
	}
	public static void ejercicio9() {
		Scanner input9=new Scanner(System.in);
		int x=input9.nextInt();
		int y=input9.nextInt();
		double operacion=Math.sqrt(x+4*Math.pow(y, 3));
		System.out.println(operacion);
		input9.close();
	}
	public static void ejercicio10() {
		Scanner input10=new Scanner(System.in);
		double x=input10.nextDouble();
		double y=input10.nextDouble();
		double div=(double)1/3;
		double resultado=(double)Math.pow(x*y, div);
		System.out.println(resultado);
		input10.close();
	}
	public static void ejercicio1_2() {
		Scanner input11=new Scanner(System.in);
		String cadenita=input11.nextLine();
		String cadenitasinespacios=cadenita.replace(" ","");
		System.out.println(cadenitasinespacios);
		input11.close();
	}
	public static void ejercicio2_2() {
		Scanner input2_2=new Scanner(System.in);
		double a=input2_2.nextDouble();
		double b=input2_2.nextDouble();
		double total=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println(total);
		input2_2.close();	
	}
	/*
	 * public static void ejercicio3_2() { Scanner input3_2=new Scanner(System.in);
	 * String cadenita=input3_2.nextLine(); String
	 * cadenita2=cadenita.replaceAll(" ", "8"); for (int i = 0; i<cadenita.length();
	 * i++) { if (cadenita.charAt(i)=="8") {
	 * 
	 * } System.out.print(cadenita.charAt(i)); } input3_2.close();
	 * 
	 * }
	 */
	}

