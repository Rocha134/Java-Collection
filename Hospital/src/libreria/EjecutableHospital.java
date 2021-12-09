package libreria;

public class EjecutableHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Medico m1;
		m1=new Medico("Carolina");
		m1.setEspecialidad("pediatria");
		m1.setEspecialidad("otorrino");
		System.out.println(m1.toString());
		*/
		Hospital h1;
		h1=new Hospital ("ABC", "observatorio");
		h1.altaMedico("Karen");
		h1.altaMedico("Fernando");
		h1.getDoctor(0).setEspecialidad("Cardiologia");
		h1.setEspecialidadDoctorX(0, "pediatria");
		System.out.println(h1.toString());
	}

}
