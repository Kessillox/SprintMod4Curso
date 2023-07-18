import entity.Administrativo;
import entity.Cliente;
import entity.Profesional;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        String div= "*************************************************";
        Profesional prof1 = new Profesional(1,
                            "Marcos",
                            "Hanson",
                            "Comas",
                            LocalDate.of(1989, 8, 27),
                            12123123,
                            2,
                            "Adviser de los dioses",
                            LocalDate.of(2011, 4,12));
        Cliente cliente1 = new Cliente(2,
                "Leonardo",
                "López",
                "Castro",
                LocalDate.of(1999,11,25),
                12345634,
                1,
                "Leonar y cia ltda.",
                77123456,
                56966676423l,
                "su casita de papel",
                "Santiago");
        Administrativo admin1 = new Administrativo(3,
                "Oscar",
                "Aguilera",
                "Rojas", LocalDate.of(1995,9,22),
                17762667,
                3,
                "Desarrollo Digital",
                2);

        System.out.println(prof1.analizarUsuario());
        System.out.println(div);
        System.out.println(cliente1.analizarUsuario());
        System.out.println(div);
        System.out.println(admin1.analizarUsuario());

    }

}