package libreria;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto []arre;
		arre=new Auto[4];
		arre[0]=new Auto("Civic",2013,85650);
		arre[1]=new Auto("Fit",2018,5000);
		arre[2]=new Auto ("Polo",2018,60000);
		arre[3]=new Auto("Chevy",2010,45600);
		for (int i=0;i<arre.length;i++) {
			System.out.println(arre[i].toString());
		}
		//System.out.println("SWAP");
		//MAG llamo al metodo swap
		//MAG.swap(0, 3, arre);
		//posicion del minimo
		int donde=MAG.posMinimo(arre, arre.length, 0);
		System.out.println("el auto mas chico esta en "+donde);
		int dondemax=MAG.posMaximo(arre, arre.length, 0);
		System.out.println("el auto mas grande esta en "+dondemax);
		Auto x=new Auto("Fit",2018,5000);
		int posicion=MAG.busSecOrdenada(arre, arre.length, x);
		System.out.println(("el fit esta en "+posicion));
		//MAG.correIzq(arre, 0, 1);
		MAG.ordena(arre);
		for (int i=0;i<arre.length;i++) {
			if (arre[i]!=null)
				System.out.println(arre[i].toString());
		}
		
		System.out.println("ALUMNOS");
		//ALUMNO
		Alumno [] estudiantes;
		estudiantes=new Alumno[10];
		for (int i=0;i<estudiantes.length;i++) {
			estudiantes[i]=new Alumno("Rafa"+i, 20+i);
		}
		for (int i=0;i<estudiantes.length;i++) {
			System.out.println(estudiantes[i].toString());
		}
		MAG.swap(3, 5, estudiantes);
		System.out.println("SWAP ESTUDIANTES");
		for (int i=0;i<estudiantes.length;i++) {
			System.out.println(estudiantes[i].toString());
		}
		int chico=MAG.posMinimo(estudiantes, 10, 0);
		System.out.println("segun el nombre el mas chico esta "+chico);
		MAG.ordena(estudiantes);
		for (int i=0;i<estudiantes.length;i++) {
			System.out.println(estudiantes[i].toString());
		}
	}

}
