package socialnetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
	private static int id;	// CONTADOR de usuarios.
	private int id1;		// IDENTIFICADOR unico del usuario.
	private String name;	// Nombre de usuario.
	private String pass;	// Contraseña del usuario.
	LocalDate fecha;	// Fecha de registro del usuario.
	private ArrayList<Publicacion> muro;
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Usuario.id = id;
	}
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
}

