package servicio;

import entity.*;
import interfaces.IUsuario;

import java.util.List;

public class Contenedor {
    List<IUsuario> listaDeUsuarios;
    List<Capacitacion> listaDeCapacitaciones;

    public Contenedor() {
    }

    public List<IUsuario> getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public void setListaDeUsuarios(List<IUsuario> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    public List<Capacitacion> getListaDeCapacitaciones() {
        return listaDeCapacitaciones;
    }

    public void setListaDeCapacitaciones(List<Capacitacion> listaDeCapacitaciones) {
        this.listaDeCapacitaciones = listaDeCapacitaciones;
    }

    public void almacenarCliente(Cliente cliente){
        listaDeUsuarios.add(cliente);
        System.out.println("Cliente agregado");
    }

    public void almacenarProfesional(Profesional profesional){
        listaDeUsuarios.add(profesional);
        System.out.println("Profesional agregado");
    }

    public void almacenarAdministrativo(Administrativo administrativo){
        listaDeUsuarios.add(administrativo);
        System.out.println("Administrativo agregado");
    }

    public void eliminarUsuario(int run){

        for (IUsuario usuarioRecorridoDeLaLista:
                listaDeUsuarios) {
            usuarioRecorridoDeLaLista
            
        }
        /*for (IUsuario usuarioRecorridoDeLaLista:
                listaDeUsuarios) {
            if (usuarioRecorridoDeLaLista.getRun() == run) {
                listaDeUsuarios.remove(usuarioRecorridoDeLaLista);
                System.out.println("Usuario " + usuarioRecorridoDeLaLista + " eliminado correctamente.");
            }*/
    }
    //Métodos Capacitación
    public void almacenarCapacitacion(Capacitacion capacitacion){
        listaDeCapacitaciones.add(capacitacion);
        System.out.println("Capacitación agregada");
    }
    
    
}
