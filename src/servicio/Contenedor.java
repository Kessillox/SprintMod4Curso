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
        /*for (IUsuario usuarioRecorridoDeLaLista:
                listaDeUsuarios) {
            usuarioRecorridoDeLaLista
            
        }*/
        for (IUsuario usuarioRecorridoDeLaLista:
                listaDeUsuarios) {
            if (usuarioRecorridoDeLaLista.getRun() == run) {
                listaDeUsuarios.remove(usuarioRecorridoDeLaLista);
                System.out.println("Usuario " + usuarioRecorridoDeLaLista + " eliminado correctamente.");
            }
        }
    }
    //Métodos Capacitación
    public void almacenarCapacitacion(Capacitacion capacitacion){
        listaDeCapacitaciones.add(capacitacion);
        System.out.println("Capacitación agregada");
    }

    public void listarUsuarios() {
        for (IUsuario usuario : this.listaDeUsuarios) {
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Apellidos: " + usuario.getApellido1() + " " + usuario.getApellido2());
            System.out.println("Fecha de nacimiento: " + usuario.getFechaNacimiento());
            System.out.println("Run: " + usuario.getRun());
            System.out.println(" ");
        }
    }

    public void listarUsuariosPorTipo(int tipoUsuario) {

        for (IUsuario usuario : listaDeUsuarios) {

            if (usuario.getTipoUsuario() == tipoUsuario) {
                System.out.println("Nombre: " + usuario.getNombre());
                System.out.println("Apellidos: " + usuario.getApellido1() + " " + usuario.getApellido2());
                System.out.println("Run: " + usuario.getRun());
                System.out.println("Tipo de Usuario: " + usuario.getTipoUsuario());
                if (usuario instanceof Cliente cliente){
                    System.out.println("Razon Social: " + cliente.getRazonSocial()) ;
                    System.out.println("Rut: " + cliente.getRut()) ;
                    System.out.println("Teléfono Representante: " + cliente.getTelefonoRepresenta()) ;
                    System.out.println("Dirección Empresa: " + cliente.getDireccionEmpresa()) ;
                    System.out.println("Comuna Empresa: " + cliente.getComunaEmpresa()) ;
                } else if (usuario instanceof Profesional profesional){
                    System.out.println("Título: " + profesional.getTitulo()) ;
                    System.out.println("Fecha de Ingreso: " + profesional.getFechaIngreso()) ;
                } else if (usuario instanceof Administrativo administrativo){
                    System.out.println("Área: " + administrativo.getArea()) ;
                    System.out.println("Experiencia Previa: " + administrativo.getExperienciaPrevia()) ;
                }
                System.out.println("---------------------------------------------------------");
            }
        }
    }

    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : listaDeCapacitaciones) {
            System.out.println("ID de la capacitación: " + capacitacion.getId());
            System.out.println("RUT cliente: " + capacitacion.getRutCliente());
            System.out.println("Lugar de la capacitación: " + capacitacion.getLugar());
            System.out.println("La capacitación tiene una duración de: " + capacitacion.getMinutos() + " minutos");
            System.out.println(" ");
        }
    }

}