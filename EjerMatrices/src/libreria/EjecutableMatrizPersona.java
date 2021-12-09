package libreria;

public class EjecutableMatrizPersona {
	//suma
		public static int suma(Persona[][] m) {
			int resp=0;
			for (int i=0;i<m.length;i++) {
				for (int j=0;j<m[0].length;j++) {
				  if(m[i][j]!=null)	
					resp=resp+m[i][j].getEdad();
				}
			}
			return resp;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona[][] alumnos;
		alumnos=new Persona[3][2];
		alumnos[0][0]=new Persona("Fernando", 20);
		alumnos[0][1]=new Persona("Javier",18);
		//imprimir
		for (int i=0; i<alumnos.length;i++) {
			for (int j=0;j<alumnos[0].length;j++) {
				System.out.print(alumnos[i][j]+ " - ");
			}
			System.out.println();
		}
		//edad de un alumno
		System.out.println(alumnos[0][1].getEdad());
		//suma edades
		System.out.println("suma edades "+suma(alumnos));
	}

}
