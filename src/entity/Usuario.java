package entity;

import interfaces.IUsuario;

import java.time.LocalDate;

public class Usuario implements IUsuario {
    private int idUsuario;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;
    private int run;
    private int tipoUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, int run, int tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
        this.tipoUsuario = tipoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", run=" + run +
                ", tipoUsuario=" + tipoUsuario +
                '}';
    }

    public void mostrarEdad(){

    }

    @Override
    public String analizarUsuario() {

        return "Hola soy "
                +getNombre()+
                " "
                +getApellido1()
                +" "
                +getApellido2()
                +" Nací el "
                +getFechaNacimiento()
                +" mi run es "
                +getRun()+
                " ";
    }

}
