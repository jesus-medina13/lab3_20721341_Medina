package socialnetwork;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Red_Social sn1 = new Red_Social();	
		String snName;
		System.out.println("###BIENVENIDO###\n ELIJA UN NOMBRE PARA LA RED SOCIAL: ");
		//snName = input.nextLine();
		//sn1.name = snName;
		sn1.name = "Instagram";
		sn1.usuarioLogueado = 0;
		sn1.listaUsuarios = new ArrayList<Usuario>();
		sn1.muro = new ArrayList<Publicacion>();
		
		sn1.register("user1", "pass1");
		sn1.register("user2", "pass2");
		sn1.register("user3", "pass3");
		sn1.register("user4", "pass4");
		sn1.register("user5", "pass5");
		
		sn1.login("user1", "pass1");
		sn1.follow("user2");
		sn1.follow("user3");
		sn1.logout();
		
		System.out.println("#####INICIO#####\nRED SOCIAL: " + sn1.name + "\nUsuario Logueado: ");
		sn1.printNameUserLogueado();
		
		String opcion;
		String opcion2;
		while(true) {
			System.out.println("RED SOCIAL: " + sn1.name + "\nUsuario Logueado: ");
			sn1.printNameUserLogueado();
			System.out.println("Seleccione una opcion: ");
			System.out.println("1) Registrarse.\n");
			System.out.println("2) Loguearse.\n");
			System.out.println("3) Ver Red Social.\n");
			System.out.println("4) Cerrar Programa.\n");
			opcion = input.nextLine();
			if(opcion.equals("1")) {
				String nombre;
				String password;
				System.out.println("Porfavor ingrese su nombre de usuaruio: \n");
				nombre = input.nextLine();
				System.out.println("Porfavor ingrese su contraseña: \n");
				password = input.nextLine();
				sn1.register(nombre, password);
			}
			else if(opcion.equals("2")) {
				String nombre;
				String password;
				System.out.println("Porfavor ingrese su nombre de usuaruio: \n");
				nombre = input.nextLine();
				System.out.println("Porfavor ingrese su contraseña: \n");
				password = input.nextLine();
				if(sn1.login(nombre, password) == 1) {
					while(true) {
						System.out.println("RED SOCIAL: " + sn1.name + "\nUsuario Logueado: ");
						sn1.printNameUserLogueado();
						System.out.println("Seleccione una opcion: ");
						System.out.println("1) Seguir un usuario.\n");
						System.out.println("2) Subir una publicacion.\n");
						System.out.println("3) Compartir una publicacion.\n");
						System.out.println("4) Desloguearse.\n");
						opcion2 = input.nextLine();
						if(opcion2.equals("1")) {
							String nombre2;
							sn1.printNombresUsuarios();
							System.out.println("Nombre del usuario que desea seguir: ");
							nombre2 = input.nextLine();
							sn1.follow(nombre2);
						}
						else if(opcion2.equals("2")) {
							String type;
							String contenido;
							String nombre3;
							String opcion3;
							ArrayList<String>listaU = new ArrayList<String>();
							System.out.println("Que tipo de publicacion realizará: \n-Photo\n-Text");
							type = input.nextLine();
							System.out.println("Escriba el contenido de su publicacion: ");
							contenido = input.nextLine();
								
							while(true) {
								System.out.println("Desea dirigir a otro usuario la publicacion? \n1) Si.\n2)No.");
								opcion3 = input.nextLine();
								if(opcion3.equals("1")) {
									sn1.printNombresUsuarios();
									System.out.println("Ingrese el nombre: ");
									nombre3 = input.nextLine();
									listaU.add(nombre3);
								}
								else if(opcion3.equals("2")){
									sn1.post(type, contenido, listaU);
									break;
								}
							}
						}
						else if(opcion2.equals("3")) {
							
						}
						else if(opcion2.equals("4")) {
							sn1.logout();
							break;
						}
					}
				}
				
			}
			else if(opcion.equals("3")) {
				sn1.socialNetworkToString();
			}
			else if(opcion.equals("4")) {
				break;
			}
		}
		return;
	}
}
