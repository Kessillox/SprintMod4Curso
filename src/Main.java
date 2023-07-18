import entity.Profesional;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Profesional prof1 = new Profesional(1,
                            "Marcos",
                            "Hanson",
                            "Comas",
                            LocalDate.of(1989, 8, 27),
                            12123123,
                            2,
                            "Adviser de los dioses",
                            LocalDate.of(2011, 4,12));

        System.out.println(
                prof1.analizarUsuario()
        );

    }

}