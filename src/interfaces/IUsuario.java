package interfaces;

import entity.Usuario;

import java.time.LocalDate;

public interface IUsuario {
    public String analizarUsuario();
    String getNombre();
    String getApellido1();
    String getApellido2();
    LocalDate getFechaNacimiento();
    int getRun();
    int getTipoUsuario();


}
