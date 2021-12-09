package libreria;
import java.util.*;//jala Scanner
import java.io.*;//lectura archivos


public class Ejecutable {

	public static void main(String[] args) {
		Compania c1;
		c1=new Compania("Google", "Rio Hondo 1");
		//lectura de archivos
		File archivo;
		Scanner leeArch;
		archivo=new File("ventasGoogle.txt");
		
		try {
			leeArch=new Scanner(archivo);
			//leer y guardar las ventas
			double monto;
			for (int i=1;i<13;i++) {
				for (int j=1;j<5;j++) {
					monto=leeArch.nextDouble();
					c1.altaVenta(i, j, monto);
				}
			}
		
			leeArch.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		System.out.println(c1.toString());
	
		


	}

}
