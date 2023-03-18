import java.util.ArrayList;
import java.util.Date;

public class Doctor extends Usuario  {
	
	private String especialidad;

	public Doctor(String nombre, String email) {
		super (nombre, email);
	}

public String getEspecialidad() {
	return especialidad;
}
public void setEspecialidad(String especialidad) {

	this.especialidad = especialidad;
}

private ArrayList<citasDisponibles> cita= new ArrayList<>();
public void anadirCita(String fecha, String tiempo) {
	 cita.add(new Doctor.citasDisponibles(fecha,tiempo) );
}

public ArrayList<citasDisponibles> getCita() {
	return cita;
}

public static class citasDisponibles {
	
	private int id;
	private String date;
	private String hora;
	public citasDisponibles(String date, String hora) {
		super();
		this.date = date;
		this.hora = hora;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	@Override
	public String toString() {
		return " Fecha: "+ date + " Hora: "+ hora;
	}
}
@Override
public String toString() {
	return super.toString()+ " Especialidad: "+especialidad + " citas \n  " + cita.toString()  ;
}

@Override
public void infoUsuario() {
	System.out.println("HOSPITAL: Pablo tobon Uribe");
	System.out.println("UNIDAD: Cirugia");
	
}
}
