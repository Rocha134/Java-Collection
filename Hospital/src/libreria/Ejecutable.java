package libreria;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dato;
		dato="Xochimilco";
		System.out.println("primera letra "+dato.charAt(0));
		System.out.println("ultima "+dato.charAt(dato.length()-1));
		String [] arre= {"Juan", "Isabel", "Ana", "Beto"};
		char [] salida=new char[arre.length];
		for (int i=0;i<arre.length;i++) {
			salida[i]=arre[i].charAt(0);
		}
		for (int i=0;i<salida.length;i++)
		{
			System.out.print(salida[i]+ "-");
		}
		System.out.println();
		System.out.println("Raquel".equalsIgnoreCase(arre[3]));
		System.out.println(arre[2].compareTo("Ramiro"));
		String curp="xxxx590120";
		String anio=curp.substring(4, 6);
		System.out.println(anio);
		int anio2=Integer.valueOf(anio);
		System.out.println(anio2+10);

	}

}
