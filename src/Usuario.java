import java.util.Date;

public abstract class Usuario {
	private static int id=0;
	private String nombre;
	private String email;
	private String address;
	
	public Usuario(String nombre, String email) {
		super();
		id++;
//		System.out.println("Usuario "+  nombre + " creado con ID "+ id);
		this.nombre = nombre;
		this.email = email;
		
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Usuario.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return getId()+ ". nombre: "+ nombre+ " email: " + email + " address: "+ address;
	}
	
	public abstract void infoUsuario();

	
}
