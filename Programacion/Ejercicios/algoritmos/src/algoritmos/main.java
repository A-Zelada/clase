package algoritmos;

import java.util.Scanner;

public class main {
	public static void Main(String[] args) {
		//-----------ordenacion por seleccion----------
		int[] n=new int[9];
		Scanner numero= new Scanner(System.in);
		for (int i = 0; i < n.length; i++) {
			System.out.println("introduce un numero");
			n[i]=numero.nextInt();
		}
		for (int i = 0; i < n.length-1; i++) {
			for (int j = i+1; j < n.length; j++) {
				if (n[j]<n[i]) {
					int aux=n[j];
					n[j]=n[i];
					n[i]=aux;
				}
			}
		}
		numero.close();
		//-----------Ordenacion por insercion----------
		
	}
}
