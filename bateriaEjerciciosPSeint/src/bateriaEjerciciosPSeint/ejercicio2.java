package bateriaEjerciciosPSeint;
import java.util.Scanner;
public class ejercicio2 {
//-------------Ejercicio1----------------
	public void ejercicio1(){
	Scanner input =new Scanner(System.in);
	double basePrimero=input.nextDouble();
	double baseSegundo=input.nextDouble();
	double alturaPrimero=input.nextDouble();
	double alturaSegundo=input.nextDouble();
	double areaPrimero=input.nextDouble();
	double areaSegundo=input.nextDouble();
	areaPrimero=(basePrimero*alturaPrimero)/2;
	areaSegundo=(baseSegundo*alturaSegundo)/2;
	if (areaPrimero>areaSegundo){
		System.out.println("El area de la primera figura es mayor");
	}else {
		System.out.println("El area de la segunda figura es mayor");
	}
	input.close();}
//-------------Ejercicio2----------------
	public void ejercicio_2() {
	Scanner input2 =new Scanner(System.in);{
	double pago;
	double horasTrabajadas=input2.nextDouble();
	double tarifa=10;
	if (horasTrabajadas<40) {
		pago=horasTrabajadas*tarifa;
		System.out.println(pago);}
	else {
		pago=horasTrabajadas*tarifa*1.5;
		System.out.println(pago);}
	input2.close();
	}}
//-------------Ejercicio3----------------
	public void ejercicio3() {
	double auxiliar;
	Scanner input3 =new Scanner(System.in);
	double A=input3.nextDouble();
	double B=input3.nextDouble();
	auxiliar=A;
	A=B;
	B=auxiliar;
	System.out.println(A);
	System.out.println(B);
	input3.close();}
//-------------Ejercicio4----------------
	public void ejercicio4(){
	Scanner input4 =new Scanner(System.in);
	double numero1=input4.nextDouble();
	double numero2=input4.nextDouble();
	double numero3=input4.nextDouble();
	if (numero1>numero2) {
		if (numero2>numero3) {
			System.out.println("El numero 1 es el mayor");
		}
	}else {
		if (numero2>numero3) {
			System.out.println("El numero 2 es el mayor");
		}else {
			System.out.println("El numero 3 es el mayor");
		}
	}
	input4.close();}
//-------------Ejercicio5----------------
	public void ejercicio5() {
	Scanner input5 =new Scanner(System.in);
	double numero1=input5.nextDouble();
	double numero2=input5.nextDouble();
	double numero3=input5.nextDouble();
	if (numero1<0) {
		System.out.println("El resultado es"+numero1*numero2*numero3);
	}else {
		System.out.println("El resultado es"+(numero1+numero2+numero3));
	}
	input5.close();}
//-------------Ejercicio6----------------
	public void ejercicio6() {
	Scanner input6 =new Scanner(System.in);
	double numeroDado=input6.nextDouble();
	if (numeroDado<=0) {
		System.out.println("ERROR");
	}else {
		System.out.println("Del numero"+numeroDado+" su potencia es "+(numeroDado*numeroDado)+Math.sqrt(numeroDado));
	}
	input6.close();}
//-------------Ejercicio7----------------
	public void ejercicio7() {
	Scanner input7 =new Scanner(System.in);
	System.out.println("Introduce el numero de niños");
	int niños=input7.nextInt();
	System.out.println("Introduce el numero de niñas");
	int niñas=input7.nextInt();
	System.out.println("El porcentaje de niños es: "+(niños*100)/(niños+niñas)+"%");
	System.out.println("El porcentaje de niñas es: "+(niñas*100)/(niños+niñas)+"%");
	input7.close();
	}
//-------------Ejercicio8----------------
	public void ejercicio8() {
	Scanner input8=new Scanner(System.in);
	System.out.println("Escribe un mes");	
	String mes=input8.next();
	System.out.println("Escribe el importe");	
	double importe=input8.nextDouble();
	if ((mes=="Octubre")||(mes=="octubre")||(mes=="OCTUBRE")) {
		System.out.println("El total de la compra del mes es: "+importe*0.85);
	}else {
		System.out.println("El total de la compra del mes es: "+importe);
	}
	input8.close();}
//-------------Ejercicio9----------------
	public void ejercicio9() {
	Scanner input9=new Scanner(System.in);
	double total;
	int numeros1;
	numeros1=1;
	while (numeros1<10) {
		total =numeros1*numeros1;
		System.out.println(total);
		numeros1=numeros1++;
	}
	input9.close();}
//-------------Ejercicio10---------------
	public void ejercicio10() {
	Scanner input10=new Scanner(System.in);
	System.out.println("Escribe tu primera nota");
	double nota1=input10.nextDouble();
	System.out.println("Escribe tu segunda nota");
	double nota2=input10.nextDouble();
	System.out.println("Escribe tu tercera nota");
	double nota3=input10.nextDouble();
	System.out.println("Escribe tu cuarta nota");
	double nota4=input10.nextDouble();
	System.out.println("Escribe tu quinta nota");
	double nota5=input10.nextDouble();
	System.out.println("Escribe tu sexta nota");
	double nota6=input10.nextDouble();
	double media=input10.nextDouble();
	double matricula=input10.nextDouble();
	double iva=input10.nextDouble();
	matricula=1000;
	iva=0.1;
	media=(nota1+nota2+nota3+nota4+nota5+nota6)/6;
	if (media>4){
		System.out.println("El precio de la matricula es: "+(matricula*0.7)*(1-iva));
	}else {
		System.out.println("El precio de la matricula es: "+matricula*(1+iva));
	}
	input10.close();
}
//-------------Ejercicio11---------------
	public void ejercicio11() {
		Scanner input11=new Scanner(System.in);
		System.out.println("Dime el dia");
		String dia=input11.next();
		System.out.println("Dime tu turno");
		String turno=input11.next();
		System.out.println("Dime cuantas horas has trabajado");
		double horas=input11.nextDouble();
		String festivo=input11.next();
		String festivo2=input11.next();
		double tarifadia=input11.nextDouble();
		double tarifanoche=input11.nextDouble();
		festivo="lunes";
		festivo2="jueves";
		tarifadia=10;
		tarifanoche=13.5;
		if ((dia!=festivo)||(dia!=festivo2)) {
			if (turno=="diurno"){
				System.out.println("Tu jornal es: "+(horas*tarifadia));
			}else{
				System.out.println("Tu jornal es: "+(horas*tarifanoche));
			}
		}else {
			if (turno=="diurno") {
				System.out.println("Tu jornal es: "+horas*tarifadia*1.1);
			}else {
				System.out.println("Tu jornal es: "+horas*tarifanoche*1.15);
			}
		}	
		input11.close();
	}
//-------------Ejercicio12---------------
	public void ejercicio12() {
	Scanner input12=new Scanner(System.in);
	int numeroEntero=input12.nextInt();
	if (numeroEntero!=0) {
		if (numeroEntero%2==0) {
			System.out.println("es par");
		}else {
			System.out.println("es impar");
		}
	}else {
		System.out.println("El numero no es par ni impar");
	}
	input12.close();
	}
//-------------Ejercicio13---------------
	public void ejercicio13() {
	Scanner input13=new Scanner(System.in);
	double primerNumero=input13.nextDouble();
	double segundoNumero=input13.nextDouble();
	if (segundoNumero!=0){
		System.out.println("El resultado de la division es "+primerNumero/segundoNumero);
	}else {
		System.out.println("aviso");
	}
	input13.close();
	}
//-------------Ejercicio14---------------
	public void ejercicio14() {
		Scanner input14=new Scanner(System.in);
		double primerNumero=input14.nextDouble();
		double segundoNumero=input14.nextDouble();
		if (primerNumero>0){
			if (segundoNumero>0){
				System.out.println("Los dos son numeros positivos");
			}else {
				System.out.println("Solo uno es un numero positivo");
			}
		}else {
			if (segundoNumero>0) {
				System.out.println("solo uno es negativo");
			}else {
				System.out.println("Ninguno es positivo");
			}
		}
		input14.close();
		}
//-------------Ejercicio15----------------
	public void ejercicio15() {
		Scanner input15=new Scanner(System.in);
		System.out.println("¿Tienes el bachillerato?");
		String bachillerato=input15.next();
		if (bachillerato=="si"){
			System.out.println("Puedes acceder al grado superior");
		}else {
			System.out.println("¿Has aprobado la prueba de acceso?");
			String pruebasAcceso=input15.next();
			if (pruebasAcceso=="si") {
				System.out.println("Puedes acceder al grado superior");
			}else {
				System.out.println("No puedes acceder al grado superior");
			}
		}
		input15.close();
	}
//-------------Ejercicio16----------------
	public void ejercicio16() {
		Scanner input16=new Scanner(System.in);
		System.out.println("dia");
		int dia=input16.nextInt();
		System.out.println("mes");
		int mes=input16.nextInt();
		System.out.println("año");
		int año=input16.nextInt();
		if ((dia>31)||(mes>12)||(año>2019)) {
			System.out.println("La fecha que has introducido no es valida");
		} else {
			switch (mes) {
			case 1:
				System.out.println(dia+" de Enero de "+año);
				break;
			case 2:
				System.out.println(dia+" de febrero de "+año);
				break;
			case 3:
				System.out.println(dia+" de marzo de "+año);
				break;
			case 4:
				System.out.println(dia+" de abril de "+año);
				break;
			case 5:
				System.out.println(dia+" de mayo de "+año);
				break;
			case 6:
				System.out.println(dia+" de junio de "+año);
				break;
			case 7:
				System.out.println(dia+" de julio de "+año);
				break;
			case 8:
				System.out.println(dia+" de agosto de "+año);
				break;
			case 9:
				System.out.println(dia+" de septiembre de "+año);
				break;
			case 10:
				System.out.println(dia+" de octubre de "+año);
				break;
			case 11:
				System.out.println(dia+" de noviembre de "+año);
				break;
			case 12:
				System.out.println(dia+" de diciembre de "+año);
				break;

			default:
				break;
			}
		}
		input16.close();
	}
//-------------Ejercicio17-----------------
	public void ejercicio17() {
		Scanner input17=new Scanner(System.in);
		System.out.println("introduce tu nombre");
		String nombreAlumno=input17.next();
		System.out.println("introduce tu nota de practica");
		int notaPractica=input17.nextInt();
		System.out.println("introduce tu nota de problemas");
		int notaProblemas=input17.nextInt();
		System.out.println("introduce tu nota de la parte teorica");
		int notaTeorica=input17.nextInt();
		if (((notaPractica<0)||(notaPractica>10))||((notaProblemas<0)||(notaProblemas<0))||((notaTeorica<0)||(notaTeorica>10))) {
			System.out.println("introduce tu nota de la parte teorica");
			System.out.println(nombreAlumno);
		}
		input17.close();
	}
//--------------Ejercicio18----------------
	public void ejercicio18() {
		Scanner input18=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero=input18.nextInt();
		int contador=0;
		int total;
		do {
			total=numero*numero;
			System.out.println(total);
			numero++;
			contador++;
		} while (contador<10);
		input18.close();
	}
//--------------Ejercicio19----------------
	public void ejercicio19() {
		Scanner input19=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero=input19.nextInt();
		int contador=0;
		int total;
			do {
				if (numero%2==0) {
					total=numero+(numero+contador);
					System.out.println(total);
					}
				contador++;
			} while (contador<10);
		
		input19.close();
	}
//---------------Ejercicio20------------------
	public void ejercicio20() {
		Scanner input20=new Scanner(System.in);
		int contador=1;
		int total;
		System.out.println("Escribe un numero del 1 al 10");
		int num=input20.nextInt();
		while (contador<11) {
			total=num*contador;
			System.out.println(total);
			contador=contador+1;
		}
		input20.close();
	}
//--------------Ejercicio21-----------------
	public void ejercicio21() {
		Scanner input21=new Scanner(System.in);
		double num=input21.nextDouble();
		double suma=0;
		int contador=1;
		while (num!=1) {
			suma=suma*num;
			contador=contador*1;
			num=input21.nextDouble();
		}
		System.out.println(" suma/(contador-1)");	
		input21.close();
	}
//------------Ejercicio22---------------------
	public void ejercicio22() {
		Scanner input22=new Scanner(System.in);
		String clave=input22.next();
		if (clave=="eureka") {
			System.out.println("has entrado");
		}else {
			clave=input22.next();
			if (clave=="eureka") {
				System.out.println("has entrado");
				}else {
					System.out.println("has fallado demasiadas veces");}
				}
		input22.close();
	}
//-----------Ejercicio23-----------------
	public void ejercicio23() {
		Scanner input23=new Scanner(System.in);
		System.out.println("escribe un numero");
		double max=0;
		double min=0;
		double contador=0;
		double suma=0;
		double num=input23.nextDouble();
		while (num!=0) {
			if (num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
			suma=suma+num;
			contador=contador+1;
			num=input23.nextDouble();
		}
		double media=suma/contador;
		System.out.println("el maximo es :"+max);
		System.out.println("el minimo es :"+min);
		System.out.println("la media es :"+media);
		input23.close();
	}
//-------------Ejercicio24-------------
	public void ejercicio24(){
		Scanner input24=new Scanner(System.in);
		System.out.println("escribe un numero");
		int num=input24.nextInt();
		int contador=1;
		if (num==2) {
			while (contador<100) {
				if (contador%2==0) {
					System.out.println(contador);
					contador=contador+1;
				}else {
					contador=contador+1;
				}
			}
		}else {
			while (contador<100) {
				if (contador%3==0) {
					System.out.println(contador);
					contador=contador+1;
				}else {
					contador=contador+1;
				}
			}
		}
		input24.close();
		
	}
	public void ejemplo() {
		Scanner input24=new Scanner(System.in);
		int num=input24.nextInt();
		while (num>10) {
			num++;
			System.out.println(num);
		}
		input24.close();
	}
//-------------Ejercicio30------------
	public void ejercicio30() {
		Scanner input30=new Scanner(System.in);
		System.out.println("escribe un numero");
		int numero=input30.nextInt();
		for (int i = 0; i < numero; i++) {
			if (i==0||i==numero-1) {
				for (int k = 0; k < numero; k++) {
					System.out.print("X");
				}
				System.out.println("\r");
			}else {
				for (int j = 0; j < numero; j++) {
					if (j==0||j==numero-1) {
						System.out.print("X");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println("\r");
			}
			input30.close();
		}
	}
//---------------Ejercicio31-----------
		public void ejercicio31() {
			Scanner input30=new Scanner(System.in);
			System.out.println("escribe un numero");
			int altura=input30.nextInt();
			
			for (int i = 0; i < altura; i++) {
				int contador=altura-1;
				
				int altCont=altura+contador;
				if (i==0) {
					for (int k = 0; k < altura+contador; k++) {
						System.out.print("X");
					}
					System.out.println("\r");
				}else {
					for (int j = 0; j < altura+contador; j++) {
						if (j<i||j>altCont-i-1) {
							System.out.print(" ");
						}else {
							System.out.print("X");
						}
					}
					System.out.println("\r");
				}
				input30.close();
			}
		}
//-------------Ejercicio32-------------
		public void ejercicio32y33() {
		Scanner input32=new Scanner(System.in);
		int num;
		int sumpares;
		int sumimpares;
		String pares="estos son los numeros pares que has introducido";
		String impares="estos son los numeros impares que has introducido";
		System.out.println("Dime un numero");
		num=input32.nextInt();
		sumpares=0;
		sumimpares=0;
		while (num>0) {
			if (num%2==0) {
				pares += num + " ";
				System.out.println("Es par");
				sumpares=sumpares+num;
			}else {
				impares += num + " ";
				System.out.println("Es impar");
				sumimpares=sumimpares+num;
			}
			System.out.println("Dime un numero(PAR O IMPAR)");
			num=input32.nextInt();
		}
		System.out.println(pares);
		System.out.println("La suma de los numeros pares es "+sumpares);
		System.out.println(impares);
		System.out.println("La suma de los numeros impares es "+sumimpares);
		input32.close();
		}

//------------------------Ejercicios Metodos------------------------
//	public static double suma(double _a,double _b) {
//		return _a+_b;
//	}
	//------Ejercicio2------------------
	public static double primo(int n1,int n2,double divisor,double divisores) {
		do {
			do {
				if (n1%divisor==0) {
					divisores=divisores+1;
				}
				divisor=divisor+1;
			} while (divisor>n1);
			if (divisores==2){
				System.out.println(n1);
			}
			n1=n1+1;
		} while (n1<n2);
		return n1;
	}
//-----------------Ejercicio3------------
	public static double factorial(int num) {
		
		Scanner numero = new Scanner(System.in);      
		long factorial=1;		        
		System.out.print("Introduce un número: ");
        num = numero.nextInt();
        for (int i = num; i > 0; i--) {
	            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
	    numero.close();
		return factorial;
	}
//-----------------Ejercicio4-----------------








}	