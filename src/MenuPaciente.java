import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MenuPaciente {
	
	public static void mostrarMenuPaciente() {
		int respuesta=0;
		
		do {
			System.out.println("Bienvenido "+ Menu.pacienteLogeado.getNombre() );
			System.out.println("Que desea realizar?");
			System.out.println("1. Agendar una Cita ");
			System.out.println("2. consultar mis citas");
			System.out.println("0. volver al menu principal");
			
			Scanner sc= new Scanner(System.in);
			respuesta= Integer.valueOf(sc.nextLine());
			
			switch (respuesta) {
			case 1:
				agendarCita();
				break;
			case 2:
				System.out.println("::Consultar cita");
				mostrarCitasPaciente();
				break;
			case 0:
				Menu.showMenu();
				break;
			default:
				System.out.println("Ingrese un valor valido");
				break;
			}
		}while (respuesta!=0);

	
	}
	
	private static void agendarCita() {
		int respuesta=0;
	do {
		System.out.println("::Agendar una cita");
		System.out.println("Porfavor seleccione una fecha");
		Map<Integer,Map<Integer,Doctor>> doctores = new TreeMap<>();
		int k=0;
			for(int i=0;i<MenuDoctor.horariosDoctor.size();i++) {
				ArrayList<Doctor.citasDisponibles> citasDisponibles= MenuDoctor.horariosDoctor.get(i).getCita();
				Map<Integer,Doctor> doctorCita= new TreeMap<>();
				for (int j=0; j<citasDisponibles.size();j++) {
					k++;
					System.out.println(k+". "+ citasDisponibles.get(j).getDate());
					doctorCita.put(Integer.valueOf(j), MenuDoctor.horariosDoctor.get(i));
					doctores.put(Integer.valueOf(k), doctorCita);
				}
			}
			Scanner sc= new Scanner(System.in);
			int respuestaFechaSeleccionada= Integer.valueOf(sc.nextLine());
			
			Map<Integer,Doctor> doctorDisponibleSeleccionado=doctores.get(respuestaFechaSeleccionada) ;
			Integer indiceFecha=0;
			Doctor doctorSeleccionado= new Doctor("","");
			
			for(Map.Entry<Integer, Doctor> doc :doctorDisponibleSeleccionado.entrySet()) {
				indiceFecha=doc.getKey();
				doctorSeleccionado= doc.getValue();
			}
			System.out.println(doctorSeleccionado.getNombre()+" . Fecha " +doctorSeleccionado.getCita().get(indiceFecha).getDate() + " . Hora "+ doctorSeleccionado.getCita().get(indiceFecha).getHora());
			System.out.println(" Confirmar tu cita: \n 1.SI \n 2.Cambiar datos " );
			respuesta= Integer.valueOf(sc.nextLine());
			
			if (respuesta==1) {
				Menu.pacienteLogeado.addCitasDoctores(doctorSeleccionado, doctorSeleccionado.getCita().get(indiceFecha).getDate(),  doctorSeleccionado.getCita().get(indiceFecha).getHora());
				mostrarMenuPaciente();
			}
			
	}while(respuesta!=0);
	}

	private static void mostrarCitasPaciente() {
		int respuesta=0;
		do {
			System.out.println(":: MIS CITAS");
			if(Menu.pacienteLogeado.getCitasDoctores().size()==0) {
				System.out.println("NO hay CITAS disponibles");
				break;
			}
			for(int i=0; i< Menu.pacienteLogeado.getCitasDoctores().size();i++) {
				int j=i+1;
				System.out.println(j+ ". "+ " FECHA " +Menu.pacienteLogeado.getCitasDoctores().get(i).getFecha()+ " TIEMPO "+
						Menu.pacienteLogeado.getCitasDoctores().get(i).getTiempo()+ " DOCTOR "+ Menu.pacienteLogeado.getCitasDoctores().get(i).getDoctor());
			}
			System.out.println("0. Regresar");
		}while(respuesta!=0);
	}
}
