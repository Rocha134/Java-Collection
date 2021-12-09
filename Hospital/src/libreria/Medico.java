package libreria;
import java.util.*;

public class Medico {
	private static int folio=1000;
	private int clave;
	private String nombre;
	private ArrayList<String> especialidad;
	//constructores
	public Medico() {
		clave=folio;
		folio++;
		especialidad=new ArrayList<String>();
	}
	public Medico(String unN) {
		this();
		nombre=unN;
	}
	//set Especialidad
	public void setEspecialidad(String unaE) {
		especialidad.add(unaE);
	}
	//toString
	public String toString() {
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Medico: "+clave+"-"+nombre+"\n");
		sb.append("Tiene las siguientes especialidades \n");
		sb.append(especialidad.toString());
		return sb.toString();
	}

}
