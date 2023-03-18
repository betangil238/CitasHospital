import java.util.Date;

public class CitasDoctor implements IProgramable {
	
	private int id;
	private Paciente paciente;
	private Doctor doctor;
	private String fecha;
	private String tiempo;
	
	
	
	public CitasDoctor(Paciente paciente, Doctor doctor) {
		super();
		this.paciente = paciente;
		this.doctor = doctor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getTiempo() {
		return tiempo;
	}
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	@Override
	public void programar(String fecha, String tiempo) {
	
		this.fecha= fecha;
		this.tiempo=tiempo;
		
	}

}
