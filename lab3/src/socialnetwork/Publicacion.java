package socialnetwork;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Una clase para representar las publicaciones de la red social
 * @author jesus
 *
 */
public class Publicacion {

	private int id1;		// IDENTIFICADOR unico de la publicacion.
	LocalDate fecha;		// Fecha de publicacion.
	private String autor;	// Autor de la publicacion.
	private String type;	// Tipo de publicacion
	private String contenido;	// Contenido de la publicacion.
	private ArrayList<Reaccion> reacciones; // Lista de Reacciones de la publicacion.
	
	
	//SELECTORES Y MODIFICADORES.
	public int getId1() {
		return id1;
	}
	public void setId1(int id1) {
		this.id1 = id1;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public ArrayList<Reaccion> getReacciones() {
		return reacciones;
	}
	public void setReacciones(ArrayList<Reaccion> reacciones) {
		this.reacciones = reacciones;
	}
	public void visualizePublicacion() {
		System.out.println("ID: " + this.id1 + "\nFECHA: " + this.fecha + "AUTOR: " + this.autor +"\nTIPO: " + this.type + "\nCONTENIDO: " + this.contenido + "\n");
		return;
	}
	
}
