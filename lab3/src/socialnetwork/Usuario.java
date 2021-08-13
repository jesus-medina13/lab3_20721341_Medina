package socialnetwork;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Una clase para representar los usuarios de la red social
 * @author jesus
 *
 */

public class Usuario {
	private int id1;		// IDENTIFICADOR unico del usuario.
	private String name;	// Nombre de usuario.
	private String pass;	// Contraseña del usuario.
	LocalDate fecha;	// Fecha de registro del usuario.
	private ArrayList<Publicacion> muro;	// Arreglo con las publicaciones del usuario.
	private ArrayList<String> contactos;	// Personas que el usuario sigue.
	
	
	public int getId1() {
		return id1;
	}
	public void setId1(int id1) {
		this.id1 = id1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public ArrayList<Publicacion> getMuro() {
		return muro;
	}
	public void setMuro(ArrayList<Publicacion> muro) {
		this.muro = muro;
	}
	public ArrayList<String> getContactos() {
		return contactos;
	}
	public void setContactos(ArrayList<String> contactos) {
		this.contactos = contactos;
	}
	
	public void visualizePerfil() {
		System.out.println("ID: " + this.id1 + "\nFECHA DE CREACION: " + this.fecha + "\nUSERNAME: " + this.name);
		System.out.println("ESTE USUARIO SIGUE A: ");
		for(int i = 0; i < contactos.size(); i++) {
			System.out.println("-" + contactos.get(i));
		}
		System.out.println("\n");
		System.out.println("Muro: ");
		for(int i = 0; i < muro.size(); i++) {
			muro.get(i).visualizePublicacion();
			
		}
	}
}

