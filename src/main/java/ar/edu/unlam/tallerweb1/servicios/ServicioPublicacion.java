package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Publicacion;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

import java.io.IOException;
import java.util.List;

public interface ServicioPublicacion {
    List<Publicacion> buscarPublicacion(String nombre) throws IOException;
    Publicacion buscarPublicacionPorId(Long id) throws IOException;
    List<Publicacion> listarPubliacion();
    List<Publicacion> listarPublicacionDeUsuario(Usuario usuario);
}
