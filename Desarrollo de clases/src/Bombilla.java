import java.util.Scanner;

public class Bombilla {	
	boolean luz_individual;
	boolean luz_general;
	int bombilla;
	boolean[] A= {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
	public boolean interruptorIndividual(boolean luz_individual) {
		Scanner numero= new Scanner(System.in);
		System.out.println("introduce el numero de la bombilla que quieres usar");
		bombilla=numero.nextInt();
		System.out.println("introduce como quieres que este la bombilla");
		A[bombilla]=numero.nextBoolean();
		numero.close();
		return luz_individual;
	}
	public boolean interruptorGeneral(boolean luz_general) {	
		return luz_general;
	}
//	public int comprobacion2(int bombilla) {
//		bombilla p1=new bombilla();
//		boolean hola = false;
//		A[bombilla]=hola;
//		hola=luz_individual;
//		p1.comprobacion(luz_general, luz_individual);
//		return bombilla;
//	};
	public int comprobacion(boolean luz_general,boolean luz_individual) {
			if (((luz_general==false)&&(luz_individual==true))||((luz_general==true)&&(luz_individual==false))) {
				for (int j = 0; j < A.length; j++) {
					System.out.println("La bombilla "+j+" esta "+A[j]);
				}
			}else{
				for (int j = 0; j < A.length; j++) {
					System.out.println("La bombilla "+j+" esta "+A[j]);
				}
			}
			return bombilla;
	}
	public boolean isLuz_individual() {
		return luz_individual;
	}
	public void setLuz_individual(boolean luz_individual) {
		this.luz_individual = luz_individual;
	}
	public boolean isLuz_general() {
		return luz_general;
	}
	public void setLuz_general(boolean luz_general) {
		this.luz_general = luz_general;
	}
	public int getBombilla() {
		return bombilla;
	}
	public void setBombilla(int bombilla) {
		this.bombilla = bombilla;
	}
	public boolean[] getA() {
		return A;
	}
	public void setA(boolean[] a) {
		A = a;
	}

}

