import entity.Administrativo;
import entity.Cliente;
import entity.Profesional;
import servicio.Contenedor;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menu=0;
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


        do {
            System.out.println("**************************************************");
            System.out.println("*                                                *");
            System.out.println("*      ¡BIENVENIDOS A EMPRESA DE PREVENCION      *");
            System.out.println("*                  DE RIESGOS!                   *");
            System.out.println("*                                                *");
            System.out.println("*                   Curso0057®                    *");
            System.out.println("*                  byteMaster®                   *");
            System.out.println("*                                                *");
            System.out.println("**************************************************");

            System.out.println("*        Digite 1 para entrar al programa.       *");
            System.out.println("*                Digite 2 para salir.            *");
            System.out.println("**************************************************");
            System.out.print("Su opcion: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Opción inválida. Por favor, ingrese un número.");
                System.out.print("Su opcion: ");
                scanner.next();
            }
            menu = scanner.nextInt();
        }while (menu !=2);



    }

}