package libreria;

public class Nadador {
	private static int folio=100;
	private int clave;
	private String nombre;
	private int puntos;
	//constructor
	public Nadador() {
		clave=folio;
		folio++;
	}
	public Nadador(String unN, int unosP) {
		this();
		nombre=unN;
		puntos=unosP;
	}
	public String toString() {
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Nadador "+ clave+"-"+nombre+"-puntos \n");
		return sb.toString();
	}
	public int getPuntos() {
		return puntos;
	}

}
