package arrays;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	//---------Ejercicio1_A---------------
//		double[] A= new double[3];
//		double x=0;
//		for (int i=0; i<A.length; i++) {
//		A[i] = i*3;
//		x = A[0]+A[1]+A[2]; 
//		System.out.println("El valor de "+i+" es: "+A[i]);
//		}
//		System.out.println("El valor de la X es: "+x);
	//---------Ejercicio1_B--------------
//		int[] B = new int[5];
//		for (int i = 0; i < B.length; i++) {
//			B[4]=1;
//			B[B[4]]=2;
//			B[B[B[4]]]=0;
//			B[B[B[B[4]]]]=3;
//			B[B[B[B[B[4]]]]]=4;
//			System.out.println("en la posicion "+i+" el valor de B es "+B[i]);
//		}
		
	//--------Ejercicio1_C--------------	
//		int[] C= new int[4];
//		int y;
//		for (int i=C.length-1; i>=0; i--) {
//		 C[i] = i/2;
//		y = C[0]+C[1]+C[2]+C[3];
//		System.out.println("el valor de Y es: "+y+" el valor de C[i]= "+C[i]);
//		}
	//-------Ejercicio2-------------------
		/*
		 * int[] D=new int[100]; int a=1; for (int i = 0; i <D.length; i++) { D[i]=a+i;
		 * System.out.println(D[i]); }
		 */
	//---------Ejercicio3------------------
		
		  int[] D=new int[101]; 
		  int a=0; 
		  for (int i = D.length-1; i >= 0; i--) {
			  D[i]=a+i; 
			  System.out.println(D[i]); 
			  }
		 
	//-----------Ejercicio4--------------	
//		int[] D=new int[100];
//		for (int i = 0; i < D.length; i++) {
//			if (i%2==0) {
//				D[i]=i;
//				System.out.println(D[i]);
//			}
//		}
	//------------Ejercicio5---------------
//		int[] D=new int[100];
//		for (int i = D.length-1; i >0; i--) {
//			if (i%2==0) {
//				D[i]=i;
//				System.out.println(D[i]);
//			}
//		}
	//-------------Ejercicio6*--------------
//		int a=0;
//		int[] D=new int[a];
//		for (int i = 0; i < D.length; i++) {
//			int contador = 2;
//			  boolean primo=true;
//			  while ((primo) && (contador!=i)){
//			    if (i % contador == 0)
//			      primo = false;
//			    contador++;
//			  }
//		System.out.println(primo);
//		}
//-------------Ejercicio7*-----------------
//		int[] D=new int[200];
//		for (int i = 0; i < D.length; i++) {
//			D[i]=(int) (Math.random()*200);
//			for (int j = 0; j < D.length; j++) {
//			int resultado=Math.max(D[i], D[i]+1);			
//			}
//			
//		}
//------------------Ejercicio8------------------
//		int[] D=new int[5];
//		int suma=0;
//		for (int i = 0; i < D.length; i++) {
//			D[i]=(int) (Math.random()*10);
//			System.out.println(D[i]);
//		}
//		for (int i = 0; i < D.length; i++) {
//			suma=D[0]+D[1]+D[2]+D[3]+D[4];
//		}
//		System.out.println(suma);
	
//-----------------Ejercicio9*para acabar---------------------
//		int[] D=new int[5];
//		int i;
//		int j=0;
//		for (i = 0; i < D.length; i++) {
//			D[i]=(int) (Math.random()*10);
//		}
//		while (j<D.length) {
//			System.out.println(D[j]);
//			if (j>D.length) {
//				j=0;
//			}
//		}
//-------------Ejercicio10-----------------------
//		int[] D=new int[200];
//		int i;
//		for (i = 0; i < D.length; i++) {
//			D[i]=(int)(Math.random()*100);
//			if (D[i]%2==0) {
//				System.out.println("Estos son los pares "+D[i]);
//				break;
//			}
//		}
//---------------Ejercicio11---------------------
//		Scanner numero= new Scanner(System.in);
//		int[] D=new int[10];
//		int suma=0;
//		int resta=0;
//		int multi=1;
//		double division=0;
//		for (int i = 0; i < D.length; i++) {
//			System.out.println("Introduce un numero");
//			D[i]=
;
//		}
//		for (int j = 0; j < D.length; j++) {
//			suma=suma+D[j];
//			resta=resta-D[j];
//			multi=multi*D[j];
//			division=division/D[j];
//		}
//		System.out.println("La suma es: "+suma+",la resta es: "+resta+",la multiplicacion es: "+multi+",la division es: "+division);
//		numero.close();
//---------------Ejercicio12---------------------
//		Scanner numero= new Scanner(System.in);
//		int[] D=new int[10];
//		int contador=1;
//		int aux;
//		for (int i = 0; i < D.length; i++) {
//			System.out.println("Introduce un numero");
//			D[i]=numero.nextInt();
//		}
//		for (int j = 0; j < D.length; j++) {
//			if (D[j]>D[contador]) {
//				aux=D[j];
//				D[j]=D[contador];
//				D[j+1]=aux;
//			}
//			if (j==9) {
//				j=0;
//				contador++;
//			}
//		}
//		for (int k = 0; k < D.length; k++) {
//			System.out.println(D[k]);
//		}
//		numero.close();
//------------------asignaciones-----------------
		int comparaciones=0;
		int asignaciones=0;
		int aux=0;
		int[] n= {4,3,2,1,9,8,7,6,5,10};
//		Scanner numero= new Scanner(System.in);
//		for (int i = 0; i < n.length; i++) {
//			comparaciones++;
//			for (int j = i+1; j < n.length; j++) {
//				if (n[j]<n[i]) {
//					asignaciones++;
//					int aux=n[j];
//					n[j]=n[i];
//					n[i]=aux;
//				}
//			}
//		System.out.println(n[i]);
//		}
//		numero.close();
//---------------Asignaciones---------------------
		double tiempoini=System.currentTimeMillis();
//		for (int i = 0; i < n.length; i++) {
//			comparaciones++;
//			asignaciones+=2;
//			aux=n[i];
//			int j=i-1;
//			while ((j>=0)&&(aux>n[j])) {
//				n[j+1]=n[j];
//				j--;
//			}
//			System.out.println(n[i]);
//			n[j+1]=aux;
//		}		
//-----------------ordenacion burbuja---------------
//		for (int i = 1; i < n.length; i++) {
//			comparaciones++;
//			asignaciones+=2;
//			for (int j = 0; j < n.length-i-1; j++) {
//				comparaciones++;
//				asignaciones+=2;
//				if (n[j]>n[j+1]) {
//					comparaciones++;
//					aux=n[j];
//					n[j]=n[j+1];
//					n[j+1]=aux;
//					asignaciones+=3;
//				}
//			}	
//			System.out.println(n[i]);
//		}
//--------------ordenacion rapida----------------
		while (n[1]<n[2]&&n[3]<n[4]&&n[5]<n[6]&&n[7]<n[8]&&n[8]<n[9]) {
			int i=n[n.length];
			int j=n[n.length-(n.length-1)];
			int x=Math.round(n[(i+j)/2]);
			while (i<=j) {
				while (n[i]<x) {
					i=i+1;
				}
				while (n[j]>x) {
					j=j-1;
				}
				if (i<=j) {
					int tam=n[i];
					n[i]=n[j];
					n[j]=tam;
					i=i+1;
					j=j-1;
				}
			}
			System.out.println(n[1]);
			System.out.println(n[2]);
			System.out.println(n[3]);
			System.out.println(n[4]);
			System.out.println(n[5]);
			System.out.println(n[6]);
			System.out.println(n[7]);
			System.out.println(n[8]);
			System.out.println(n[9]);
			System.out.println(n[10]);
			
		}
		
		}
		
		
		
		double tiempofin=System.currentTimeMillis();
//		System.out.println("Tiempo: "+(tiempofin-tiempoini));
//		System.out.println("comparaciones: "+comparaciones);
//		System.out.println("asignaciones: "+asignaciones);
		
	}

