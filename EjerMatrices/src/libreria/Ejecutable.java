package libreria;

public class Ejecutable {
	//suma
	public static double suma(double[][] m) {
		double resp=0;
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[0].length;j++) {
				resp=resp+m[i][j];
			}
		}
		return resp;
	}
	//suma cierto renglon
	public static double sumaRenglon(double [][]m, int r) {
		double resp=0;
		//renglon 1 es indice 0 se le resta 1 a r
		for (int j=0; j<m[r-1].length;j++) {
			resp=resp+m[r-1][j];
		}
		return resp;
	}
	//suma cierto columna
	public static double sumaColumna(double [][]m, int c) {
		double resp=0;
		//columna 1 es indice 0 se le resta 1 a c
		for (int i=0; i<m.length;i++) {
			resp=resp+m[i][c-1];
		}
		return resp;
	}
	//suma diagonal principal
	public static double sumaDiagonal(double [][]m) {
		double resp=0;
		for (int i=0;i<m.length;i++) {
			resp=resp+m[i][i];
		}
		return resp;
	}
	//columna donde esta el valor mas pequeño de un renglon
	public static int posMinimoRenglon(double [][]m, int r) {
		int col=0;
		double min=m[r-1][0];//establezo un minimo a comparar
		for (int j=1;j<m[r-1].length;j++) {
			if (min>m[r-1][j]) {
				col=j;
				min=m[r-1][j];
			}
		}
		return col;
	}
	//promedio por columna
	public static double promedio(double [][]m, int col) {
		double resp=0;
		for (int i=0;i<m.length;i++) {
			resp=resp+m[i][col-1];
		}
		resp=resp/m.length; //suma entre renglones
		return resp;
	}
	//promedio usando la suma
	public static double promedio2(double [][]m, int col) {
		double prom=0;
		double suma=0;
		suma=sumaColumna(m,col);
		prom=suma/m.length;
		return prom;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] matriz;
		matriz=new double[3][7];
		System.out.println("Renglones o filas " +matriz.length);
		System.out.println("Columnas " +matriz[0].length);
		matriz[0][0]=2;
		matriz[0][1]=-3;
		matriz[0][4]=8;
		matriz[1][1]=25;
		
		//imprimir
		for (int i=0; i<matriz.length;i++) {
			for (int j=0;j<matriz[0].length;j++) {
				System.out.print(matriz[i][j]+ " - ");
			}
			System.out.println();
		}
		//suma
		System.out.println("Suma es "+suma(matriz));
		//suma renglon 1
		System.out.println("suma renglon 1 es "+ sumaRenglon(matriz,3));
		//suma columnna 1
		System.out.println("suma columna 1 es "+ sumaColumna(matriz,1));
		//suma diagonal principal
		System.out.println("Diagonal suma "+sumaDiagonal(matriz));
		//columna del minimo de cierto renglon
		int columna=posMinimoRenglon(matriz,1);
		System.out.println(columna);
		System.out.println("El valor minimo del renglon 1 es "+matriz[0][columna]);
		//promediode la columna 1
		System.out.println("Prom col 1 es "+promedio(matriz,1));
		System.out.println("Prom col 1 es "+promedio2(matriz,1));
	}

}
