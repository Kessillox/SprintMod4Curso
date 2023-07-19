package entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase Capacitación
 * Método mostrarDetalles
 * @author Rocket Team (Diego)
 */
public class Capacitacion {
    private int id;
    private int rutCliente;
    private LocalDate dia;
    private LocalTime hora;
    private String lugar;
    private int minutos;
    private int cantAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(int id, int rutCliente, LocalDate dia, LocalTime hora, String lugar,
                        int minutos, int cantAsistentes) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.minutos = minutos;
        this.cantAsistentes = cantAsistentes;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getRutCliente() { return rutCliente; }

    public void setRutCliente(int rutCliente) { this.rutCliente = rutCliente; }

    public LocalDate getDia() { return dia; }

    public void setDia(LocalDate dia) { this.dia = dia; }

    public LocalTime getHora() { return hora; }

    public void setHora(LocalTime hora) { this.hora = hora; }

    public String getLugar() { return lugar; }

    public void setLugar(String lugar) {

        this.lugar = lugar;
    }


    public int getMinutos() { return minutos; }

    public void setMinutos(int minutos) { this.minutos = minutos; }

    public int getCantAsistentes() { return cantAsistentes; }

    public void setCantAsistentes(int cantAsistentes) {

        this.cantAsistentes = cantAsistentes;
    }



    @Override
    public String toString() {
        return  "id=" + id +
                ", Rut Cliente: " + rutCliente +
                ", Día: " + dia +
                ", Hora: " + hora +
                ", Lugar: " + lugar + '\'' +
                ", Duración: " + minutos +
                ", Cantidad de asistentes: " + cantAsistentes ;
    }

    /**
     * Método que formatea la fecha de la capacitación y muestra los detalles por pantalla
     */
    public void mostrarDetalles(){
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("La capacitación será en " + this.getLugar() + " a las " +
                this.getHora().format(formatoHora) + " del día " + this.getDia().format(formatoFecha) +
                ", y durará " + this.getMinutos() + " minutos");
    }
}
