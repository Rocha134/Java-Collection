package libreria;

public class Auto  implements Comparable<Auto>{
	private String modelo;
	private int anio;
	private int km;
	public Auto() {
		
	}
	public Auto(String modelo, int anio, int km) {
		super();
		this.modelo = modelo;
		this.anio = anio;
		this.km = km;
	}
	//get set
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	//to String
	@Override
	public String toString() {
		return "Auto [modelo=" + modelo + ", anio=" + anio + ", km=" + km + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anio;
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
		Auto other = (Auto) obj;
		if (anio != other.anio)
			return false;
		return true;
	}
	//compare to
	public int compareTo(Auto otro) {
		int resp;
		if (modelo==otro.getModelo()&& km==otro.getKm()&&anio==otro.getAnio()) {
			resp=0;
		}else {
			if (anio>otro.getAnio()) {
				resp=1;
			}else{
				resp=-1;
			}
		}
		return resp;
	}

}
