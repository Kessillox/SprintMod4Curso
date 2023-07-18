package entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Accidente {
    public int idAccidente;
    public int rutCliente;
    public LocalDate fechaAccidente;
    public LocalTime horaAccidente;
    public String lugar;
    public String causaAccidente;
    public String consecuenciaAccidente;

    public Accidente() {
    }

    public Accidente(int idAccidente, int rutCliente, LocalDate fechaAccidente, LocalTime horaAccidente, String lugar, String causaAccidente, String consecuenciaAccidente) {
        this.idAccidente = idAccidente;
        this.rutCliente = rutCliente;
        this.fechaAccidente = fechaAccidente;
        this.horaAccidente = horaAccidente;
        this.lugar = lugar;
        this.causaAccidente = causaAccidente;
        this.consecuenciaAccidente = consecuenciaAccidente;
    }

    public int getIdAccidente() {
        return idAccidente;
    }

    public void setIdAccidente(int idAccidente) {
        this.idAccidente = idAccidente;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getFechaAccidente() {
        return fechaAccidente.format(formato);
    }

    public void setFechaAccidente(LocalDate fechaAccidente) {
        this.fechaAccidente = fechaAccidente;
    }

    public LocalTime getHoraAccidente() {
        return horaAccidente;
    }

    public void setHoraAccidente(LocalTime horaAccidente) {
        this.horaAccidente = horaAccidente;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCausaAccidente() {
        return causaAccidente;
    }

    public void setCausaAccidente(String causaAccidente) {
        this.causaAccidente = causaAccidente;
    }

    public String getConsecuenciaAccidente() {
        return consecuenciaAccidente;
    }

    public void setConsecuenciaAccidente(String consecuenciaAccidente) {
        this.consecuenciaAccidente = consecuenciaAccidente;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "idAccidente=" + idAccidente +
                ", rutCliente='" + rutCliente + '\'' +
                ", dia=" + fechaAccidente +
                ", hora=" + horaAccidente +
                ", lugar='" + lugar + '\'' +
                ", origen='" + causaAccidente + '\'' +
                ", consecuencia='" + consecuenciaAccidente + '\'' +
                '}';
    }
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
}