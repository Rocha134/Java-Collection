package libreria;

public class FMN {
	private String direccion;
	private final int  MAX=50;
	private Nadador[] competidores;
	private int ocupados;
	//constructores
	public FMN() {
		competidores=new Nadador[MAX];
		ocupados=0;
	}
	public FMN(String unaD) {
		this();
		direccion=unaD;
	}
	//alta nadador
	public boolean altaNadador(String unN, int unosP) {
		boolean resp;
		if (ocupados<MAX) {
			competidores[ocupados]=new Nadador(unN,unosP);
			ocupados++;
			resp=true;
		}else {
			resp=false;
		}
		return resp;
	}
	//cuenta puntos
	public int cuentaPuntos() {
		int resp=0;
		for (int i=0;i<ocupados;i++) {
			resp=resp+competidores[i].getPuntos();
		}
		return resp;
	}
	//to String
	public String toString() {
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("FMN "+direccion+"lista nadadores \n");
		for (int i=0;i<ocupados;i++) {
			sb.append(competidores[i].toString());
			
		}
		return sb.toString();
	}
}
