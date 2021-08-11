package socialnetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Red_Social {
	String name;
	int usuarioLogueado;
	ArrayList<Usuario> listaUsuarios;
	ArrayList<Publicacion> muro;
	public void printNombresUsuarios() {
		System.out.println("Lista de Usuarios:");
		for(int i = 0; i < listaUsuarios.size(); i++) {
			System.out.println("- " + listaUsuarios.get(i).getName());
		}
		return;
	}
	public void printNameUserLogueado() {
		if(usuarioLogueado == 0) {
			System.out.println("No hay ningun usuario logueado en este momento.\n");
			return;
		}
		for(int i = 0; i < listaUsuarios.size(); i++) {
			if(listaUsuarios.get(i).getId1() == usuarioLogueado) {
				System.out.println(listaUsuarios.get(i).getName() + ".\n");
				return;
			}
		}
	}
	public String getNameLogueado() {
		for(int i = 0; i < listaUsuarios.size(); i++) {
			if(listaUsuarios.get(i).getId1() == usuarioLogueado) {
				return listaUsuarios.get(i).getName();
			}
		}
		return "";
	}
	
	//Metodo para registrar un usuario en la red social.
	public void register(String nombre, String password) {
		Usuario aux = new Usuario();
		aux.setId1(listaUsuarios.size() + 1);
		aux.setName(nombre);
		aux.setPass(password);
		aux.setFecha(LocalDate.now());
		aux.setContactos(new ArrayList<String>());
		aux.setMuro(new ArrayList<Publicacion>());
		for(int i = 0; i < listaUsuarios.size(); i++) {
			if(listaUsuarios.get(i).getName().equals(nombre)) {						//Caso en que el nombre ya este registrado.
				System.out.println("El usuario ya se encuentra registrado\n");	
				return;
			}
		}
		
		listaUsuarios.add(aux);													//Sino se cumple el caso anterior entonces se agrega el usuario creado.
		System.out.println("El usuario se ha registrado correctamente\n");
		return;
	}
	
	//Metodo para loguear un usuario.
	public int login(String nombre, String password) {
		
		for(int i = 0; i < listaUsuarios.size(); i++) {
			if(listaUsuarios.get(i).getName().equals(nombre) && listaUsuarios.get(i).getPass().equals(password)) {	//Se busca si el nombre y contraseña coinciden con algun usuario registrado en la red social.
				usuarioLogueado = listaUsuarios.get(i).getId1();
				System.out.println("Usuario logueado correctamente");
				return 1;
			}		
		}
		System.out.println("El usuario o contraseña ingresados son incorrectos");							//De lo contrario se retorna este print;
		return 0;
	}
	
	//Metodo para desloguear un usuario de la red social.
	public void logout() {
		if(usuarioLogueado != 0) {	// Se cambia la id del usuario logueado por un 0.
			usuarioLogueado = 0;
			System.out.println("Logout completado");
			return;
		}
		System.out.println("No hay ningun usuario logueado en este momento");	// De lo contrario significa que no hay ningun usuario logueado.
	}
	
	//Metodo para que un usuario pueda seguir a otro.
	public void follow(String name1) {
		//primer ciclo para ver si existe un usuario con ese nombre.
		for(int i = 0; i < listaUsuarios.size(); i++) {
			if(listaUsuarios.get(i).getName().equals(name1)) {
				//Segundo ciclo para agregar el nombre a la lista de contactos del usuario logueado.
				for(int j = 0; j < listaUsuarios.size(); j++) {
					if(listaUsuarios.get(j).getId1() == usuarioLogueado) {
						// Condicion para verificar que el nombre ingresado no sea el mismo del usuario logueado.
						if(listaUsuarios.get(j).getName().equals(name1)) {
							System.out.println("No puedes seguirte a ti mismo.");
							return;
						}
						listaUsuarios.get(j).getContactos().add(name1);
						System.out.println("Usuario seguido correctamente.");
						return;
					}
				}
			}
		}
		System.out.println("El nombre que ingresaste es incorrecto.");
		return;
	}
	public void post(String type, String contenido, ArrayList<String>listaU) {
		
		//Se crea la publicacion.
		Publicacion aux = new Publicacion();
		aux.setId1(muro.size()+1);
		aux.setAutor(getNameLogueado());
		aux.setContenido(contenido);
		aux.setType(type);
		aux.setFecha(LocalDate.now());
		aux.setReacciones(new ArrayList<Reaccion>());
		
		muro.add(aux);
		//Primer ciclo para encontrar al usuario logueado y agregar el post creado en su muro personal.
		for(int i = 0; i < listaUsuarios.size();i++) {
			if(listaUsuarios.get(i).getId1() == usuarioLogueado) {
				listaUsuarios.get(i).getMuro().add(aux);
				//Segundo ciclo para recorrer la lista de usuarios a quienes se le quiere compartir el post
				for(int j = 0; j < listaU.size(); j++) {
					//Aqui se recorre la lista de contactos para agregar buscar 
					for(int k = 0; k < listaUsuarios.size(); k++) {
						if(listaUsuarios.get(k).getName().equals(listaU.get(j))) {
							listaUsuarios.get(k).getMuro().add(aux);
						}
					}	
				}
			}
		}
		System.out.println("Publicacion subida correctamente.");
		return;
	}
	
	public void share(int idPost, ArrayList<String>listaU) {
		Publicacion post = new Publicacion();
		for(int i = 0; i < muro.size();i++) {
			if(muro.get(i).getId1() == idPost) {
				post = muro.get(i);
			}
		}
		for(int i = 0; i < listaUsuarios.size();i++) {
			if(listaUsuarios.get(i).getId1() == usuarioLogueado) {
				for(int j = 0; j < listaU.size(); j++) {
					for(int k = 0; k < listaUsuarios.get(i).getContactos().size(); k++) {
						if(listaU.get(j).equals(listaUsuarios.get(i).getContactos().get(k))) {
							for(int l = 0; l < listaUsuarios.size();l++) {
								if(listaUsuarios.get(l).getName().equals(listaU.get(j))){
									listaUsuarios.get(l).getMuro().add(post);
								}
							}
						}
					}
				}
			}
		}
		
	}
	

	
}



