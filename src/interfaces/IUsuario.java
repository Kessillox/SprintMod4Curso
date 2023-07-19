package interfaces;

import java.time.LocalDate;

/**
 * Interfaz Usuario
 * Métodos a implementar por los Usuarios
 */
public interface IUsuario {
    String analizarUsuario();
    String getNombre();
    String getApellido1();
    String getApellido2();
    LocalDate getFechaNacimiento();
    int getRun();
    int getTipoUsuario();


}
