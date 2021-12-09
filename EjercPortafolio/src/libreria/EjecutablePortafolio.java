package libreria;

public class EjecutablePortafolio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Portafolio p1;
		p1=new Portafolio("BB1");
		p1.altaInversion("CEMEX", 150000, 3, .02);
		p1.altaInversion("BIMBO", 50000, 6, .025);
		p1.altaInversion("AXA", 500000, 4, .15);
		System.out.println(p1.toString());
		System.out.println("Inversiones mayores a 100000 "+p1.cuantosMayores(100000.0));

	}

}
