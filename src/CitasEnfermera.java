import java.util.Date;

public class CitasEnfermera implements IProgramable {

	private int id;
	private Paciente paciente;
	private Enfermera enfermera;
	private Date fecha;
	private String tiempo;
	
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
	public Enfermera getEnfermera() {
		return enfermera;
	}
	public void setEnfermera(Enfermera enfermera) {
		this.enfermera = enfermera;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
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

	}
	
}
