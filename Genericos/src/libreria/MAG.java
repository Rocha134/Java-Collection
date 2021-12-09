package libreria;

public class MAG {
	
	public static <T> void swap(int posX, int posY, T [] a){
		T aux;
		aux=a[posX];
		a[posX]=a[posY];
		a[posY]=aux;
	}   
	public static <T extends Comparable>  int posMinimo(T [] arreglo, int n, int inicio){
		int min=inicio;     
		for(int i=inicio+1; i<n; i++)     //compara al elemento determinado como mínimo vs el elemento i   
			if(arreglo[min].compareTo(arreglo[i])>0 ) //si encuentra uno menor se obtiene su índice dentro del arreglo 
				min=i;
		return min;
	} 
	public static <T extends Comparable>  int posMaximo(T [] arreglo, int n, int inicio){
		int max=inicio;     
		for(int i=inicio+1; i<n; i++)     //compara al elemento determinado como mínimo vs el elemento i   
			if(arreglo[max].compareTo(arreglo[i])<0 ) //si encuentra uno menor se obtiene su índice dentro del arreglo 
				max=i;
		return max;
	} 
		 
	//busqueda sec con arreglos  ordenados
	public static  <T extends Comparable>  int busSecOrdenada(T[] arre, int n, T x) {
		int i=0;
		while(i<n && (arre[i].compareTo(x)<0)){
			i++;
		}
		//checo si si lo encontro para regresar el valor negativo
		if (i>=n || !arre[i].equals(x)) {
			i=-i-1;
		}
		return i;
	}
	//busqueda sec con arreglos  DESordenados
		public static  <T extends Comparable>  int busSecDesordenada(T[] arre, int n, T x) {
			int resp=-1;
			for (int i=0;i<arre.length;i++) {
				if (arre[i].equals(x)) {
					resp=i;
				}
			}
			return resp;
		}
		//correr a la derecha
		public static <T extends Comparable> void correDcha(T[] arre, int inicio, int lugares) {
			for (int i=0;i<lugares;i++) {
				for (int j=arre.length-1; j>inicio;j--) {
					arre[j]=arre[j-1];
				}
				arre[i]=null;
			}
		}
		//correr a la izquierdaa
		public static <T extends Comparable> void correIzq(T[] arre, int inicio, int lugares) {
			for (int i=0;i<lugares;i++) {
				for (int j=inicio;j<arre.length-1;j++) {
					arre[j]=arre[j+1];
				}
				arre[arre.length-1]=null;
			}
		}
		//ordena
		public static <T extends Comparable> void ordena(T[] arre) {
			int min;
			for (int i=0;i<arre.length-1;i++) {
				min=posMinimo(arre, arre.length, i);
				swap(min, i, arre);
			}
		}
			
}
