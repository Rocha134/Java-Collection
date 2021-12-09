package libreria;

public class EjecutableFMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FMN f1;
		f1=new FMN("Rio HOndo");
		f1.altaNadador("Carolina", 100);
		f1.altaNadador("Fernando", 150);
		System.out.println("Suma puntos "+f1.cuentaPuntos());
		System.out.println(f1.toString());
	}

}
