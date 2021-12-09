package libreria;

public class Portafolio {
	private String nombre;
	private int noInv;
	private Inversion[] port;
	private final int MAX=20;
	//constructores
	public Portafolio() {
		port=new Inversion[MAX];
		noInv=0;
	}
	public Portafolio(String nom) {
		this();
		nombre=nom;
	}
	//get y set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNoInv() {
		return noInv;
	}
	//to String
	public String toString() {
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Portafolio "+nombre+"\n");
		sb.append("Inversiones: \n");
		for (int i=0;i<noInv;i++) {
			sb.append(port[i].toString()+"\n");
		}
		return sb.toString();
	}
	//busqueda
	public int buscaInv(Inversion cual) {
		return MAG.busSecDesordenada(port, noInv, cual);
	}
	//alta inversion
	public boolean altaInversion(String nomb, double m, int p, double r) {
		boolean resp=false;
		Inversion x=new Inversion(nomb,m,p,r);
		if (noInv<MAX) {//checo si hay espacio
			if (buscaInv(x)==-1) {//no esta esa inversion en port
				port[noInv]=x;
				noInv++;
				MAG.ordena(port,noInv);
				resp=true;
			}
		}
		return resp;
	}
	//cuantos mayores a x monto
	public int cuantosMayores(double cant) {
		int resp=0;
		for (int i=0; i<noInv;i++) {
			if (port[i].getMonto()>cant) {
				resp++;
			}
		}
		return resp;
	}
}
