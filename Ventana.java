import controller.ListaTareas;
import java.util.Date;
import java.util.Scanner;

public class Ventana {
	public static void main(String[] args) {
		initicializar();
	}
	public  static void initicializar(){
		int opcion;
		ListaTareas listaTareas=new ListaTareas();
		Scanner intro=new Scanner(System.in);
		boolean seguir=true;
		do{
			menu();
			opcion=ingresarNumero();
			switch (opcion){
				case 1:
					System.out.println("Titulo de la tarea: ");
					String title=intro.nextLine();
					System.out.println("Descripcion: ");
					String descripcion=intro.nextLine();

					System.out.println("Ingrese fecha");
					System.out.println("DD: ");
					int day=ingresarNumero();
					System.out.println("MM: ");
					int month=ingresarNumero();
					System.out.println("YY");
					int year=ingresarNumero();
					Date fecha=new Date(year,month,day);

					listaTareas.agregarTarea(title,descripcion,fecha);
					break;

				case 2:
					listaTareas.mostrarTareas();
					System.out.println("Ingrese el indice de la tarea que quiere eliminar");
					int max=listaTareas.getTareas().size();
					int indice=0;
					do{
						indice=ingresarNumero();
					}while (indice>max);
					listaTareas.eliminarTarea(indice);

					break;
				case 3:
					listaTareas.mostrarTareas();
					break;
				case 4:
					System.out.println("Esta seguro que quiere salir? Si (1) No (2)");
					int salir=ingresarNumero();
					switch (salir){
						case 1:
							System.out.println("Hasta pronto!");
							seguir=false;
							break;
						case 2:
							initicializar();
							break;
						default:
							System.out.println("La opcion elegida no es valida");
							initicializar();
							break;
					}

					break;
				default:
					System.out.println("La opcion ingresada no es valida");
					break;
			}
		}while(seguir==true);
	}
	public static void  menu() {
		System.out.println("Bienvenido al administrador de tareas, aca podras agendar tus tareas, " +
							"eliminarlas tras haberlas terminado ^_^");
		System.out.println("(1) Crear una tarea");
		System.out.println("(2) Eliminar Tarea");
		System.out.println("(3) Mostrar Tareas");
		System.out.println("(4) Salir");
	}
	public static int ingresarNumero(){
		Scanner intro=new Scanner(System.in);
		int opcion = 0;
		try{
			opcion= intro.nextInt();
		}catch (Exception e){
			System.out.println("El tipo de variable es invalido, porfavor ingresar nuevamente el valor");
			ingresarNumero();
		}
		return opcion;
	}
}