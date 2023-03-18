import java.util.ArrayList;

public class Paciente  extends Usuario {
	

	private String phoneNumber;
	private String birthday;
	private double weight; 
	private double height;
	private String blood;
	
	private ArrayList<CitasDoctor> citasDoctores= new ArrayList<>();
	private ArrayList<CitasEnfermera> citasEnfermera= new ArrayList<>();
	
	
	
	public ArrayList<CitasDoctor> getCitasDoctores() {
		return citasDoctores;
		
	}

	public void addCitasDoctores(Doctor doctor,String date, String time) {
		CitasDoctor citaDoctor = new CitasDoctor(this,doctor);
		citaDoctor.programar(date, time);
		citasDoctores.add(citaDoctor);
		
	}

	public ArrayList<CitasEnfermera> getCitasEnfermera() {
		return citasEnfermera;
	}

	public void setCitasEnfermera(ArrayList<CitasEnfermera> citasEnfermera) {
		this.citasEnfermera = citasEnfermera;
	}

	public Paciente(String nombre, String email) {
		super (nombre, email);
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	
	@Override
	public String toString() {
		return super.toString()+ " Telefono "+ getPhoneNumber()+ " Sangre "+ blood+ " Peso "+ getWeight()+ " Altura "+ getHeight();
	}

	@Override
	public void infoUsuario() {
		System.out.println("HOSPITAL: Pablo tobon Uribe");
		System.out.println("HISTORIAL MEDICO: Completo");
		
	}
	
}
