package libreria;

public class EjecutableBinario {
	public static int busquedaBinaria(int[] a, int n, int x) {		
		//busqueda binaria
		int pos;
		int inicio = 0;   
		int fin = n-1;
		int mitad = (inicio+fin)/2;   		 
		  while ( inicio <= fin && a[mitad]!=x ) {
			  if ( x < a[mitad] )
				  fin = mitad-1; 
			  else      
				  inicio = mitad+1;
			  mitad = (inicio+fin)/2;			   
		  }
		  if ( inicio > fin ) 
			  // elemento no encontrado
			  pos = -inicio-1;    
		  else          
			  pos = mitad;   
		return pos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arre= {5,7,9,11,23,50,89,100};
		int resp=busquedaBinaria(arre,arre.length,20);
		System.out.println("indice del 20 "+resp);
	}

}
