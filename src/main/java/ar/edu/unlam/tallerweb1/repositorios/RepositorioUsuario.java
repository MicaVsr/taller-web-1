package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

// Interface que define los metodos del Repositorio de Usuarios.
public interface RepositorioUsuario {
	void cargarUsuario(Usuario usuario);
	Usuario consultarUsuario (Usuario usuario);
}