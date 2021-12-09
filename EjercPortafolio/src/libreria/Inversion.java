package libreria;
/** @author Juan Perez   
 * * 07/05/12 
 *   * Ejercicio para segundo examen parcial
 *      */
public class Inversion implements Comparable<Inversion> {
	private String nombre;
	private double monto;
	private int plazo;
	private double rendimiento;
	//constructores
	
	public Inversion() {
		
	}
	public Inversion(String nombre, double monto, int plazo, double rendimiento) {
		super();
		this.nombre = nombre;
		this.monto = monto;
		this.plazo = plazo;
		this.rendimiento = rendimiento;
	}
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public int getPlazo() {
		return plazo;
	}
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	public double getRendimiento() {
		return rendimiento;
	}
	public void setRendimiento(double rendimiento) {
		this.rendimiento = rendimiento;
	}
	@Override
	public String toString() {
		return "Inversion [nombre=" + nombre + ", monto=" + monto + ", plazo=" + plazo + ", rendimiento=" + rendimiento
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Inversion other = (Inversion) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	//sdfsfs
	/** Método para comparar una inversion con otra con el nombre
	 *  @author Administrador 
	 *   @return regresa 0 si son iguales positivo si es mayor negativo si es menor
	 */
	public int compareTo(Inversion otra) {
		return nombre.compareTo(otra.getNombre());
	}
}
