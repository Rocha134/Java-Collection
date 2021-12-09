package libreria;

import java.util.Arrays;

public class Compania {
	private String nombre, direccion;
	private double [][] ventas;
	
	public Compania() {
		ventas=new double[12][4];
	}
	public Compania(String n, String d) {
		this();
		nombre=n;
		direccion=d;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//consulta venta
	public double consultaVenta(int mes, int depto) {
		return ventas[mes-1][depto-1];
	}
	//alta venta
	public boolean altaVenta(int mes, int depto, double monto) {
		boolean resp=false;
		if (mes<=12 && depto<=4) {
			ventas[mes-1][depto-1]=monto;
			resp=true;
		}
		return resp;
	}
	//to String
	@Override
	public String toString() {
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Compañia "+nombre+"-"+ direccion+"\n");
		sb.append("Tiene las siguientes ventas \n");
		for (int i=0;i<12;i++) {
			for (int j=0;j<4;j++) {
				sb.append(ventas[i][j]+"-");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	

}
