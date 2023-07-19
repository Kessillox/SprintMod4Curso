package servicio;

import entity.*;
import interfaces.IUsuario;

import java.util.List;

/**
 * Clase que define Listas de usuarios (List<IUsuario>) y lista de capacitaciones (List<Capacitación>)
 * @author curso0057
 */
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

    /**
     * Agrega un Cliente al listado de Usuarios
     * @param cliente
     * Cliente que se va a ingresar
     */
    public void almacenarCliente(Cliente cliente){
        //se añade el cliente a la lista
        listaDeUsuarios.add(cliente);
        System.out.println("Cliente agregado");
    }

    /**
     * Agrega un Profesional al listado de Usuarios
     * @param profesional
     * Profesional que se va a ingresar
     */
    public void almacenarProfesional(Profesional profesional){
        listaDeUsuarios.add(profesional);
        System.out.println("Profesional agregado");
    }

    /**
     * Agrega un Administrativo al listado de Usuarios
     * @param administrativo
     * Administrativo que se va a ingresar
     */
    public void almacenarAdministrativo(Administrativo administrativo){
        listaDeUsuarios.add(administrativo);
        System.out.println("Administrativo agregado");
    }

    /**
     * Método Eliminar usuario
     * elimina un usuario dado el run
     * @param run
     * run del Usuario a eliminar
     */
    public void eliminarUsuario(int run){
        //Foreach para recorrer la lista
        for (IUsuario usuarioRecorridoDeLaLista:
                listaDeUsuarios) {
            //Comparación entre el run que viene ingresado y el getrun de los objetos IUsuario de la lista
            if (usuarioRecorridoDeLaLista.getRun() == run) {
                //elimina el usuario que corresponde al run ingresado
                listaDeUsuarios.remove(usuarioRecorridoDeLaLista);
                System.out.println("Usuario " + usuarioRecorridoDeLaLista + " eliminado correctamente.");
            }
        }
    }

    /**
     * Método que muestra por pantalla los usuarios de en la lista
     */
    public void listarUsuarios() {
        for (IUsuario usuario : this.listaDeUsuarios) {
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Apellidos: " + usuario.getApellido1() + " " + usuario.getApellido2());
            System.out.println("Fecha de nacimiento: " + usuario.getFechaNacimiento());
            System.out.println("Run: " + usuario.getRun());
            System.out.println(" ");
        }
    }

    /**
     *Método muestra los datos de usuario según su tipo
     * @param tipoUsuario
     * entero que clasifica el tipo de usuario
     */
    public void listarUsuariosPorTipo(int tipoUsuario) {
        for (IUsuario usuario : listaDeUsuarios) {

            if (usuario.getTipoUsuario() == tipoUsuario) {
                System.out.println("Nombre: " + usuario.getNombre());
                System.out.println("Apellidos: " + usuario.getApellido1() + " " + usuario.getApellido2());
                System.out.println("Run: " + usuario.getRun());
                System.out.println("Tipo de Usuario: " + usuario.getTipoUsuario());
                //instanceof evalúa si el objeto "usuario" pertenece a la clase que se indica a continuación "Cliente"
                // devuelve un booleano
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

    //Métodos Capacitación
    /**
     * Agrega una Capacitación al listado de Usuarios
     * @param capacitacion
     * Capacitación que se va a ingresar
     */
    public void almacenarCapacitacion(Capacitacion capacitacion){
        listaDeCapacitaciones.add(capacitacion);
        System.out.println("Capacitación agregada");
    }

    /**
     * Método que imprime por pantalla los datos de todas las capacitaciones en la lista
     */
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