package entity;

public class Cliente extends Usuario{
    private String razonSocial;
    private int rut;
    private long telefonoRepresenta;
    private String direccionEmpresa;
    private String comunaEmpresa;

    public Cliente() {
    }

    public Cliente(String razonSocial, int rut, long telefonoRepresenta, String direccionEmpresa, String comunaEmpresa) {
        this.razonSocial = razonSocial;
        this.rut = rut;
        this.telefonoRepresenta = telefonoRepresenta;
        this.direccionEmpresa = direccionEmpresa;
        this.comunaEmpresa = comunaEmpresa;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public long getTelefonoRepresenta() {
        return telefonoRepresenta;
    }

    public void setTelefonoRepresenta(long telefonoRepresenta) {
        this.telefonoRepresenta = telefonoRepresenta;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getComunaEmpresa() {
        return comunaEmpresa;
    }

    public void setComunaEmpresa(String comunaEmpresa) {
        this.comunaEmpresa = comunaEmpresa;
    }
    public void obtenerNombre(){
        System.out.println(" la razon social es "+getRazonSocial()+" el rut es "+getRut()+" la direccopn "+getDireccionEmpresa());
    }

}
