package bateriaEjerciciosPSeint;

import java.util.Scanner;

public class ejercicio3 {
//----------------Segunda Bateria----------
//----------------Ejercicio1---------------
public static void ejercicio1(int num) {
	Scanner input1=new Scanner(System.in);
	System.out.println("Introduce un numero");
	num=input1.nextInt();
	for (int i = 0; i < 9; i++) {
		int num2=input1.nextInt();
		num=num+num2;
	}
	input1.close();
	System.out.println("La suma es :"+num);
	return;
	}
//-----------------Ejercicio2---------------
public static void ejercicio2(int n,int num) {
	Scanner input2=new Scanner(System.in);
	System.out.println("Introduce la cantidad de numeros que quieres que se sumen como maximo");
	n=input2.nextInt();
	System.out.println("Introduce un numero");
	num=input2.nextInt();
	for (int i = 0; i < n-1; i++) {
		int num2=input2.nextInt();
		num=num+num2;
		}
	System.out.println("La suma es :"+num);
	input2.close();
	}
//-----------------Ejercicio3----------------
public static void ejercicio_3(int año) {
	Scanner input3=new Scanner(System.in);
	System.out.println("Escribe un año");
	año=input3.nextInt();
	if (año%4==0) {
		System.out.println("Es bisiesto");
	}else {
		System.out.println("no es bisiesto");
	}
	input3.close();
	}
public static void ejercicio4(int dia,int mes,int año) {
	Scanner input3=new Scanner(System.in);
	System.out.println("Introduce el dia");
	dia=input3.nextInt();
	System.out.println("Introduce el mes");
	mes=input3.nextInt();
	System.out.println("Introduce el año");
	año=input3.nextInt();
	switch (mes) {
	case 1:
		if (dia>0||dia<=31) {
			dia++;
			if (dia==32) {
				dia=1;
				mes++;
			}
		}
		System.out.println("La fecha es "+dia+"/"+mes+"/"+año);
		break;
	case 2:
		if (año%4==0) {
			if (dia>0||dia<=29) {
				dia++;
				if (dia==30) {
					dia=1;
					mes++;
				}
			}
			System.out.println("La fecha es "+dia+"/"+mes+"/"+año);
			break;
		}else {
			if (dia>0||dia<=28) {
				dia++;
				if (dia==29) {
					dia=1;
					mes++;
				}
			}
			System.out.println("La fecha es "+dia+"/"+mes+"/"+año);
			break;
		}
	case 3:
		if (dia>0||dia<=31) {
			dia++;
			if (dia==32) {
				dia=1;
				mes++;
			}
		}
		System.out.println("La fecha es "+dia+"/"+mes+"/"+año);
		break;
	case 4:
		if (dia>0||dia<=30) {
			dia++;
			if (dia==31) {
				dia=1;
				mes++;
			}
		}
		System.out.println("La fecha es "+dia+"/"+mes+"/"+año);
		break;
	case 5:
		if (dia>0||dia<=31) {
			dia++;
			if (dia==32) {
				dia=1;
				mes++;
			}
		}
		System.out.println("La fecha es "+dia+"/"+mes+"/"+año);
		break;
	case 6:
		if (dia>0||dia<=30) {
			dia++;
			if (dia==31) {
				dia=1;
				mes++;
			}
		}
		System.out.println("La fecha es "+dia+"/"+mes+"/"+año);
		break;
	case 7:
		if (dia>0||dia<=31) {
			dia++;
			if (dia==32) {
				dia=1;
				mes++;
			}
		}
		System.out.println("La fecha es "+dia+"/"+mes+"/"+año);
		break;
	case 8:
		if (dia>0||dia<=31) {
			dia++;
			if (dia==32) {
				dia=1;
				mes++;
			}
		}
		System.out.println("La fecha es "+dia+"/"+mes+"/"+año);
		break;
	case 9:
		if (dia>0||dia<=30) {
			dia++;
			if (dia==31) {
				dia=1;
				mes++;
			}
		}
		System.out.println("La fecha es "+dia+"/"+mes+"/"+año);
		break;
	case 10:
		if (dia>0||dia<=31) {
			dia++;
			if (dia==32) {
				dia=1;
				mes++;
			}
		}
		System.out.println("La fecha es "+dia+"/"+mes+"/"+año);
		break;
	case 11:
		if (dia>0||dia<=30) {
			dia++;
			if (dia==31) {
				dia=1;
				mes++;
			}
		}
		System.out.println("La fecha es "+dia+"/"+mes+"/"+año);
		break;
	case 12:
		if (dia>0||dia<=31) {
			dia++;
			if (dia==32) {
				dia=1;
				mes++;
			}
		}
		System.out.println("La fecha es "+dia+"/"+mes+"/"+año);
		break;
	default:
		System.out.println("sadas");
		break;
	}
	input3.close();
}
//-----------Ejercicio5-----------------
public static void ejercicio5(String palabra,int palabra2,double pies){
		Scanner input5=new Scanner(System.in);
		System.out.println("Indica el tipo de datos que vas a introducir:");
		System.out.println("Puedes elegir a galeones o pies");
		palabra=input5.next();
		if (palabra.contentEquals("galeones")) 
		{
			System.out.println("introduce los galeones");
			double galeones=input5.nextDouble();
			double litros=galeones*3.7854;
			System.out.println(galeones+" galeones son "+litros+" litros.");
		}
		else if (palabra.contentEquals("pies")) 
		{	
			System.out.println("introduce las unidades a la que quieres convertir los pies");
			System.out.println("1=pulgadas,2=yardas,3=centimetros,4=metros");
			palabra2=input5.nextInt();
			switch (palabra2) {
			case 1:
				System.out.println("Indica la cantidad");
				pies=input5.nextDouble();
				double pulgadas=pies*12;
				System.out.println(pies+" pies son "+pulgadas+" pulgadas");
				break;
			case 2:
				System.out.println("Indica la cantidad");
				pies=input5.nextDouble();
				double yardas=pies/3;
				System.out.println(pies+" pies son "+yardas+" yardas");
				break;
			case 3:
				System.out.println("Indica la cantidad");
				pies=input5.nextDouble();
				double cm=((pies*12)*2.54);
				System.out.println(pies+" pies son "+cm+" centimetros");
				break;
			case 4:
				System.out.println("Indica la cantidad");
				pies=input5.nextDouble();
				double metros=((pies*12)*2.54)/0.94;
				System.out.println(pies+" pies son "+metros+" metros");
				break;
			
			default:
				System.out.println("esto esta mal");
				break;
			}
		}
		input5.close();
}
//---------------Ejercicio6-------------
public static void ejercicio6(){
	Scanner input6=new Scanner(System.in);
	System.out.println("todas las conversiones de 1 al 100");
	for (int i = 1; i < 101; i++) {
		if (i%10==0) {
			System.out.println(" ");
		}else {
			double litros=i*3.7854;
			System.out.println(i+" galeones son "+litros+" litros.");
		}
	}
	input6.close();
}
//---------------Ejercicio7---------------********
public static void ejercicio7(double numero,int valor,int ca) {
		
		  Scanner input7=new Scanner(System.in); 
		  System.out.println("Introduce un numero");
		  numero=input7.nextDouble();
		  for (int i = 0; i < numero; i++) {
			int a=1;
			int b=1;
			ca=a+b;
			a=ca;
			b=a;
		  }
		System.out.println("este es el resultado "+ca);  
		  input7.close();
		 }

//---------------Ejercicio8-----------------
	public static void ejercicio8() {
		for (int i = 1; i < 100; i++) {
			if (i%2==0) {
				System.out.println(i);
			}	
		}
	}
//-------------ejercicio9---------------------
	public static void ejercicio9() {
		for (int i = 1; i < 100; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}	
		}
	}
//--------------Ejercicio10--------------------
	public static void ejercicio10() {
		int suma=0;
		for (int i = 10; i < 51; i++) {
			if (i%2==0) {
				suma=i+suma;
			}
		}
		System.out.println(suma);
	}
//------------Ejercicio11---------------------
	public static void ejercicio11(int primNumero,int segNumero,int contador) {
		Scanner input11=new Scanner(System.in); 
		System.out.println("Introduce un numero");
		primNumero=input11.nextInt();
		System.out.println("Introduce otro numero");
		segNumero=input11.nextInt();
		for (int i = 0; i < primNumero; i++) {
			if (primNumero%2==0) {
				int valor=primNumero/2;
				primNumero=valor;
				contador++;
				if (primNumero%2==0) {
					valor=primNumero/2;
					primNumero=valor;
					contador++;
					System.out.println(contador);
				}else {
					System.out.println(valor);	
				}
				
			}
			if (primNumero%3==0) {
				int valor=primNumero/3;
				primNumero=valor;
				System.out.println(valor);
			}
			if (primNumero%5==0) {
				int valor=primNumero/5;
				primNumero=valor;
				System.out.println(valor);
			}
			if (primNumero%7==0) {
				int valor=primNumero/7;
				primNumero=valor;
				System.out.println(valor);
			}
			if (primNumero%13==0) {
				int valor=primNumero/13;
				primNumero=valor;
				System.out.println(valor);
			}
		}
		input11.close();
	}
	public static int mcm(int num1,int num2) {
		Scanner input12=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1 = input12.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = input12.nextInt();
        System.out.println("El M.C.M. entre "+num1+" y "+num2+" es: "+mcm( num1,num2));
		int mcm = 0;
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        mcm = (a/mcm(a, b))*b;
        return mcm;
	}
	public static void ejercicio12(int i, int j) {
		// TODO Auto-generated method stub
		class calc
		{
		    private double x;
		    private double y;
		    public calc(double x,double y)
		    {
		        this.x=x;
		        this.y=y;
		    }
		    public void print(double theta)
		    {
		        if( ((Math.toDegrees(theta) / 90) % 2) == 1)
		        {
		            x = x*0;
		            y = y*Math.sin(theta);
		        }
		        else if( ((Math.toDegrees(theta) / 90) % 2) == 0)
		        {
		            x = x*Math.cos(theta);
		            y = y*0; 
		        }
		        else
		        {
		           x = x*Math.cos(theta);
		           y = y*Math.sin(theta); 
		        }
		        System.out.println("cos 90 : "+x);
		        System.out.println("sin 90 : "+y);
		    }
		    public void main(String[]args)
		    {
		        calc p = new calc(3,4);
		        p.print(Math.toRadians(90));
		    }
		}
		
	}
}
//--------------------EJERCICIO12----------------

	



//Scanner input12=new Scanner(System.in); 
//System.out.println("Introduce un numero");
//num1=input12.nextInt();
//System.out.println("Introduce otro numero");
//num2=input12.nextInt();
//do {
//	int divisores=0;
//	int divisor=1;
//	do {
//		if (num1%divisor==0) {
//			divisores=divisores+1;
//		}
//		divisor=divisor+1;	
//	} while (divisor>num1);
//	if (divisores==2) {
//		System.out.println(num1);
//	}
//	num1=num1+1;
//} while (num1>num2);
//input12.close();
//}