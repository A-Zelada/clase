package primerProyecto;

import java.util.Scanner;

public class main 
{
	public static void Main(String[] args) 
	{
	System.out.println("vamos a depurar nuestro codigo por primera vez");
	System.out.println("Para poder depurar vamos a necesitar unos puntos de ruptura");
	System.out.println("como los añadimos?");
	System.out.println("Nos vamos al numero de linea en el que queremos añadir ");
	System.out.println("Hacemos click en el boton derecho");
	int a;
	a = 0;
	if (a>0)
		System.out.println("Numero positivo igual a bonito =)");
	else 
		System.out.println("Numero negativo igual feo =(");
	for(int i=0;i<10;i++) {
		System.out.println(a*i);
	do {
		a++;
		System.out.println(a);
	}
	while(a>0);
	}
	int f,b;
	Scanner input =new Scanner(System.in);
	f=input.nextInt();
	b=input.nextInt();
	if(f>b)
		System.out.println(f);
	else
		System.out.println(b);
	input.close();
	}
	
	}

