package primeraPaquete;

public class mesa {
	int patas;
	String forma;
	String material;
	String colores;
	//----------get and set-------
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColores() {
		return colores;
	}
	public void setColores(String colores) {
		this.colores = colores;
	}
	//----------info----------
	void mostrarInfo()
	{
		System.out.println("Mostramos la información de la mesa");
		System.out.println("Colores: "+getColores());
		System.out.println("Forma: "+getForma());
		System.out.println("Material: "+getMaterial());
		System.out.println("Patas:"+getPatas());

	}
}
