package socialnetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Publicacion {
	private static int id;	// CONTADOR de publicaciones.
	private int id1;		// IDENTIFICADOR unico de la publicacion.
	LocalDate fecha;		// Fecha de publicacion.
	private String autor;	// Autor de la publicacion.
	private String type;	// Tipo de publicacion
	private String contenido;	// Contenido de la publicacion.
	private ArrayList<Reaccion> reacciones; // Lista de Reacciones de la publicacion.
}
