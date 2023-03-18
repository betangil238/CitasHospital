import java.util.ArrayList;
import java.util.Scanner;

public class MenuDoctor {
	
	public static ArrayList<Doctor> horariosDoctor= new ArrayList<>();

	public static void showMenuDoctor(){
		
		int respuesta=0;
		
	
		do {
			System.out.println("Bienvenido Doctor "+ Menu.doctorLogeado.getNombre() );
			System.out.println("Que desea realizar?");
			System.out.println("1. Añadir disponibilidad de fechas");
			System.out.println("2. consultar calendario de citas");
			System.out.println("0. volver al menu principal");
			
			Scanner sc= new Scanner(System.in);
			respuesta= Integer.valueOf(sc.nextLine());
		switch (respuesta) {
		case 1: {
			System.out.println("porfavor ingrese la disponibilidad");
			ingresarDisponibilidad();
			break;
		}
		case 2: {
			
			break;
		}
		case 0: {
			Menu.showMenu();
		break;
		}
		}
		}while (respuesta!=0);
		
	}
	
	private static void ingresarDisponibilidad() {
		int mes=0;
		int dia=0;
		String fecha="";
		do {
		System.out.println();
		System.out.println("Ingrese el mes que desea mostrarse disponible o 0. para regresar");
		for (mes=0;mes<3;mes++) {
			System.out.println((mes+1)+". "+ Menu.MESES[mes]);
		}
		System.out.println("0. regresar");
		Scanner sc= new Scanner(System.in);
		mes= Integer.valueOf(sc.nextLine());
		if (mes>0 & mes<3) {
		System.out.println("Usted ingreso el mes de "+ Menu.MESES[mes-1]);
		System.out.println("Porfavor ingrese el dia de disponibilidad");
		
		dia = Integer.valueOf(sc.nextLine());
		
		System.out.println("Ingresaste disponibilidad para el "+ dia+ " de "+  Menu.MESES[mes-1]);
		System.out.println("1. Confirmar ");
		System.out.println("2. Cambiar fechas ");
		System.out.println();
		}else if (mes == 0) {
			showMenuDoctor();
		}
		
		int respuesta = Integer.valueOf(sc.nextLine());
		String hora="";
		if( respuesta ==1) {
			int horaRespuesta=0;
			do {
				System.out.println("Porfavor ingrese la hora de disponibilidad [16:00]");
				 hora= sc.nextLine();
				 System.out.println("Tu hora elegida es: "+ hora );
				 System.out.println("1. confirmar 2. Reasignar");
				 horaRespuesta = Integer.valueOf(sc.nextLine());
				 fecha= dia + " de "+  Menu.MESES[mes-1];
				 System.out.println(fecha);
				 if (horaRespuesta ==1) {
					 Menu.doctorLogeado.anadirCita(fecha, hora);
					 MenuCitasIngresadas( Menu.doctorLogeado);
				 }else {
					 System.out.println("Reasignar hora");
				 }
				 
			}while(horaRespuesta>=2 || horaRespuesta<1 );
		}
		else if (respuesta==2) {
			ingresarDisponibilidad();
		}
		}while (mes!=0);
	}
	private static void MenuCitasIngresadas(Doctor doctor){
		if(doctor.getCita().size()>0 && !horariosDoctor.contains(doctor) ) {
			horariosDoctor.add(doctor);
			System.out.println("Fecha guardada con exito");
			System.out.println("Volvera al menu para ingresar fechas disponibles");
		}
	}
}
