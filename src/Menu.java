import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	public static final String[] MESES= {"Enero","Febrero","Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre","Noviembre","Diciembre" };
 	public static Doctor doctorLogeado;
 	public static Paciente pacienteLogeado;
	
	public static void showMenu(){
		System.out.println("Bienvenido a mis Citas");
		System.out.println("Seleccione una opcion");
		int respuesta=0;
		do {
			System.out.println("1. Doctor");
			System.out.println("2. Paciente");
			System.out.println("0. Salir");
			
			Scanner sc= new Scanner(System.in);
			respuesta= Integer.valueOf(sc.nextLine());
			
			switch (respuesta) {
			case 1:
				respuesta=0;
				System.out.println("Seleccionaste Doctor, favor autenticarse");
				autenticar(1);
				break;
			case 2:
				respuesta=0;
				System.out.println("Seleccionaste Paciente, favor autenticarse");
				autenticar(2);
				break;
			case 0:
				System.out.println("Gracias por su visita");
				break;
			default:
				System.out.println("Ingrese un valor valido");
				break;
			}
			}while (respuesta!=0);
		}

	private static void autenticar(int respuesta) {
		
		ArrayList<Doctor> doctores=new ArrayList<>();
		doctores.add(new Doctor("Daniel", "Danielin@gmaik.com"));
		doctores.add(new Doctor("paola", "Paolina@gmaik.com"));
		doctores.add(new Doctor("Stellita", "Stellina@gmaik.com"));
		ArrayList<Paciente> pacientes=new ArrayList<>();
		pacientes.add(new Paciente("Joaqus", "joaquito@gmaik.com"));
		pacientes.add(new Paciente("kira", "Kirina@gmaik.com"));
		pacientes.add(new Paciente("Lucas", "eldelasLucas@gmaik.com"));
		boolean ingreso= false;
		
		do {
		
		System.out.println("Por favor ingrese su email");
		Scanner sc= new Scanner(System.in);
		String email=sc.nextLine();
		
		if (respuesta == 1) {
			for (Doctor d: doctores) {
				if (d.getEmail().equals(email)) {
					ingreso= true;
					System.out.println("Autenticacion exitosa");
					System.out.println();
					doctorLogeado=d;
					MenuDoctor.showMenuDoctor();
				}
			}
			System.out.println("email incorrecto");
		}
		if (respuesta == 2) {
			for (Paciente p: pacientes) {
				if (p.getEmail().equals(email)) {
					ingreso= true;
					System.out.println("Autenticacion exitosa");
					System.out.println();
					pacienteLogeado=p;
					MenuPaciente.mostrarMenuPaciente();
				}
			}
		}
		}while(ingreso==false);
	}
	
}
