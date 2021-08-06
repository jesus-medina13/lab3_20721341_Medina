package socialnetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Red_Social {
	int usuarioLogueado;
	ArrayList<Usuario> listaUsuarios;
	ArrayList<Publicacion> muro;
	
	//Metodo para registrar un usuario en la red social.
	
	public void register(String nombre, String password) {
		Usuario aux = new Usuario();
		aux.setId1(listaUsuarios.size() + 1);
		aux.setName(nombre);
		aux.setPass(password);
		for(int i = 0; i < listaUsuarios.size(); i++) {
			if(listaUsuarios.get(i).getName() == nombre) {						//Caso en que el nombre ya este registrado.
				System.out.println("El usuario ya se encuentra registrado\n");	
				return;
			}
		}
		
		listaUsuarios.add(aux);													//Sino se cumple el caso anterior entonces se agrega el usuario creado.
		System.out.println("El usuario se ha registrado correctamente\n");
		return;
	}
	
	//Metodo para loguear un usuario.
	public void login(String nombre, String password) {
		
		for(int i = 0; i < listaUsuarios.size(); i++) {
			if(listaUsuarios.get(i).getName() == nombre && listaUsuarios.get(i).getPass() == password) {	//Se busca si el nombre y contraseña coinciden con algun usuario registrado en la red social.
				usuarioLogueado = listaUsuarios.get(i).getId1();
				System.out.println("Usuario logueado correctamente");
				return;
			}		
		}
		System.out.println("El usuario o contraseña ingresados son incorrectos");							//De lo contrario se retorna este print;
		return;
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
	
}

