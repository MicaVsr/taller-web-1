package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Publicacion;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ServicioPublicar {
    void subirArchivo(String nombre, Double precio, MultipartFile archivo) throws IOException;
    List<Publicacion> listarPubliacion();
}