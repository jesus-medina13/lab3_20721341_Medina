package socialnetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reaccion {
	
	private int id1;		// IDENTIFICADOR unico de la reaccion.
	LocalDate fecha;		// Fecha de la reaccion.
	private String autor;	// Autor de la publicacion.
	private String type;	// Tipo de reaccion.
	private String contenido;	// Contenido de la reaccion.
	
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
}
