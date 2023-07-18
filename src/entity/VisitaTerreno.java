package entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class VisitaTerreno {

    private int idVisita, rutCliente;
    private LocalDate fechaVisita;
    private LocalTime horaVisita;

    private String lugar, comentarios;

    public VisitaTerreno(int idVisita, int rutCliente, LocalDate fechaVisita, LocalTime horaVisita, String lugar, String comentarios) {
        this.idVisita = idVisita;
        this.rutCliente = rutCliente;
        this.fechaVisita = fechaVisita;
        this.horaVisita = horaVisita;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    public VisitaTerreno() {
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public LocalTime getHoraVisita() {
        return horaVisita;
    }

    public void setHoraVisita(LocalTime horaVisita) {
        this.horaVisita = horaVisita;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "idVisita=" + idVisita +
                ", rutCliente=" + rutCliente +
                ", fechaVisita=" + fechaVisita +
                ", horaVisita=" + horaVisita +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
