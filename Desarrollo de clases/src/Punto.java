
public class Punto {
 private int abscisa;
 private int ordenada;
 public Punto() {
	 abscisa=0;
	 ordenada=0;
 }
 int getAbscisa() {return abscisa;}
 void setAbscisa(int x) {abscisa=x;}
 int getOrdenada() {return ordenada;}
 void setOrdenada(int x) {ordenada=x;}
 public String toString() {
	 String info="ejeX"+getAbscisa()+"ejeY"+getOrdenada();
	 System.out.println(info);
	 return info;
 }
}
