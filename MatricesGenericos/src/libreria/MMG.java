package libreria;

import java.util.ArrayList;

public class MMG {
	//intercambia elementos de la matriz
	public static <T> void swap(T[][] matriz, int r1, int c1, int r2, int c2) {
		T aux;
		aux=matriz[r1][c1];
		matriz [r1][c1]=matriz [r2][c2];
		matriz[r2][c2]=aux;
	}
	//busca el primer ocupado en la matriz
	public static <T extends Comparable> int[] buscaPrimero(T[][]m) {
		int[] resp;
		resp=new int[2];
		boolean flag=false;
		int i=0;
		int j=0;
		while(i<m.length && flag==false) {
			while(j<m[0].length&& flag==false) {
				if (m[i][j]== null) {
					j++;
				}else {
					resp[0]=i;
					resp[1]=j;
					flag=true;
				}
			}
			i++;
			j=0;
		}
		return resp;
	}
	
	
	//pos del minimo  CON EL CRITERIO QUE MANEJE EL COMPARE TO
	//EN LAS PERSONA ERA EL NOMBRE
	//EN LOS LIBROS TOMANDO LA CLAVE
	public static <T extends Comparable> int[] posMinimo(T[][]m) {
		int[] resp;
		resp=new int[2];
		//T minimo=m[0][0]; no estoy segura que en 0,0 hay objeto
		int[] coord=new int[2];
		coord=buscaPrimero(m);
		T minimo= m[coord[0]][coord[1]];
		int fila=0;
		int col=0;
		for (int i=coord[0];i<m.length;i++) {
			for (int j=coord[1];j<m[0].length;j++) {
			  if(m[i][j]!=null) {	
				if(m[i][j].compareTo(minimo)<0) {
					minimo=m[i][j];
					fila=i;
					col=j;
				}
			  }
			}
		}
		resp[0]=fila;
		resp[1]=col;
		return resp;
	}
	
	//pos minimo Fila
	public static <T extends Comparable> int posMinFila(T[][] m, int fila) {
		T min=m[fila-1][0];
		int resp=0;
		for (int j=0;j<m[0].length;j++) {
				if (min.compareTo(m[fila-1][j])>0) {
					min=m[fila-1][j];
					resp=j;
				}
			}
		return resp;
	}
	//pos minimo columna
	//pos minimo Fila
	public static <T extends Comparable> int posMinCol(T[][] m, int col) {
		T min=m[0][col-1];
		int resp=0;
		for (int i=0;i<m.length;i++) {
				if (min.compareTo(m[i][col-1])>0) {
					min=m[i][col-1];
					resp=i;
				}
			}
		return resp;
	}
	//busqueda
	public static <T extends Comparable> ArrayList<Integer> busqueda(T[][] m, T cual) {
		ArrayList<Integer> resp=new ArrayList<Integer>();
		
		resp.add(-1);
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[0].length;j++) {
			  if (m[i][j]!=null) {	
				if (m[i][j].equals(cual)) {
					resp.clear();
					resp.add(i);
					resp.add(j);
				}
			  }		
					}
				}
		return resp;
	}
}
