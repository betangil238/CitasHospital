
public class Enfermera extends Usuario {
	
	private String especialidad;
	
	public Enfermera(String nombre, String email) {
		super(nombre, email);
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public void infoUsuario() {
		System.out.println("HOSPITAL: Pablo tobon Uribe");
		System.out.println("UNIDAD: Cancerologia, cuidados paliativos");
		
	}

	
	
}
