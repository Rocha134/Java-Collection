package libreria;

public class Ejecutable {
	
	public static void main(String[] args) {
		Persona [][] m;
		m=new Persona[3][3];
		m[1][1]=new Persona("Javier", 19);
		m[2][2]=new Persona("Christopher", 18);
		
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[0].length;j++) {
			if (m[i][j]!=null)	
				System.out.print("fila"+i+"col"+j+"-"+m[i][j]);
			}
			System.out.println();
		}
		//intercambio e imprimo
		MMG.swap(m, 1,1,2,2);

		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[0].length;j++) {
			if (m[i][j]!=null)	
				System.out.print("fila"+i+"col"+j+"-"+m[i][j]);
			}
			System.out.println();
		}
		
		//MINIMO
		int[] donde=new int[2];
		donde=MMG.posMinimo(m);
		System.out.println("MINIMO"+ donde[0]+ "-"+donde[1]);
		//busca persona
		Persona p1=new Persona("Javier", 19);
		System.out.println(MMG.busqueda(m, p1));
	}

}
