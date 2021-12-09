package libreria;

public class Libro implements Comparable <Libro>{
	private static int folio=100;
	private int clave;
	private String nombre;
	//constr
	public Libro() {
		clave=folio;
		folio++;
	}
	public Libro(String unN) {
		this();
		nombre=unN;
	}
	public int getClave() {
		return clave;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//toString
	@Override
	public String toString() {
		return "Libro [clave=" + clave + ", nombre=" + nombre + "]";
	}
	//comparac
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + clave;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (clave != other.clave)
			return false;
		return true;
	}
	public int compareTo(Libro otro) {
		int resp=-1;
		if(clave==otro.getClave()) {
			resp=0;
		}else {
			if(clave>otro.getClave()) {
				resp=1;
			}
		}
		return resp;
	}

}
