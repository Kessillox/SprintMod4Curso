package entity;

public class Administrativo extends Usuario{
    private String area;
    private String experienciaPrevia;

    public Administrativo() {
    }

    public Administrativo(
            /*String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, int run, int tipoUsuario,*/
            String area, String experienciaPrevia) {
        /*super(nombre, apellido1, apellido2, fechaNacimiento, run, tipoUsuario);*/
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }

    /*
    @Override
    public void AnalizarUsuario() {
        super.AnalizarUsuario();
        System.out.println("Área: " + area);
        System.out.println("Experiencia Previa: " + experienciaPrevia);
    }*/

}
