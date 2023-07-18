package entity;

import java.time.LocalDate;

public class Administrativo extends Usuario{
    private String area;
    private int experienciaPrevia;

    public Administrativo() {
    }

    public Administrativo(int idUsuario, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, int run, int tipoUsuario, String area, int experienciaPrevia) {
        super(idUsuario, nombre, apellido1, apellido2, fechaNacimiento, run, tipoUsuario);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(int experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }

    @Override
    public String analizarUsuario() {
        return super.analizarUsuario()
                +"Mi Área es: "+getArea()+"\n"
                +"Y tengo es: "+getExperienciaPrevia()+" años de Experiencia.";
    }
}
