package libreria;

public class Hospital {
	private String nombre, direccion;
	private Medico [] doctores;
	private final int MAX=50;
	private int ocupados;
	//constructores
	public Hospital() {
		ocupados=0;
		doctores=new Medico[MAX];
	}
	public Hospital(String unN, String unaD) {
		ocupados=0;
		doctores=new Medico[MAX];
		nombre=unN;
		direccion=unaD;
	}
	//meto a un medico
	public boolean altaMedico(String unN) {
		boolean resp;
		if (ocupados<50) {
			doctores[ocupados]=new Medico(unN);
			ocupados++;
			resp=true;
		}else {
			resp=false;
		}
		return resp;
	}
	//get doctor
	public Medico getDoctor(int pos) {
		return doctores[pos];
	}
	//agregue especialidad a cierto doctor
	public void setEspecialidadDoctorX(int pos, String esp) {
		doctores[pos].setEspecialidad(esp);
	}
	//toString
	public String toString() {
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Hospital "+nombre+"  "+direccion+"\n");
		sb.append("Tiene a los sigueintes medicos \n");
		for(int i=0;i<ocupados;i++) {
			sb.append(doctores[i].toString()+"\n");
		}
		return sb.toString();
	}
}
