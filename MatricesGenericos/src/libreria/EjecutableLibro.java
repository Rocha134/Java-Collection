package libreria;

public class EjecutableLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro [][] anaquel;
		anaquel=new Libro[5][10];

		for (int i=0;i<anaquel.length;i++) {
			for (int j=0;j<anaquel[0].length;j++) {
				anaquel[i][j]=new Libro("ideas"+i+j);
			}
		}
		//intercambio libros 
		MMG.swap(anaquel,0,0,4,9);
		//imprimo
		for (int i=0;i<anaquel.length;i++) {
			for (int j=0;j<anaquel[0].length;j++) {
				System.out.println(anaquel[i][j].toString());
			}
		}
		//busca el mas pequeño
		int[] donde=new int[2];
		donde=MMG.posMinimo(anaquel);
		System.out.println("MINIMO"+ donde[0]+ "-"+donde[1]);
		//busco libro
		Libro l1;
		l1=new Libro("ideas00");
		System.out.println(l1.toString());
		System.out.println(MMG.busqueda(anaquel, l1));
	}

}
