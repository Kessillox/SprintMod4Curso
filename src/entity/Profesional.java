package entity;

import java.time.LocalDate;

/**
 * Clase Profesional hereda Usuario
 * Método Analizar Usuario
 * @author felipekessibustos
 */
public class Profesional extends Usuario{
    private String titulo;
    private LocalDate fechaIngreso;

    public Profesional() {
    }

    public Profesional(int idUsuario, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, int run, int tipoUsuario, String titulo, LocalDate fechaIngreso) {
        super(idUsuario, nombre, apellido1, apellido2, fechaNacimiento, run, tipoUsuario);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                "} " + super.toString();
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String analizarUsuario() {

        String impresion = super.analizarUsuario()
                + "mi título es "
                + getTitulo()
                +" e ingresé a la empresa el "
                + getFechaIngreso();
        return impresion;
    }
}
