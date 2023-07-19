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
            if (menu == 1){
                int opcion;
                do {
                    System.out.println("\u001B[37;40;1m"+"========= MENÚ PRINCIPAL ========="+"\u001B[0m");
                    System.out.println("\u001B[32m"+"1. Nuevo Cliente"+"\u001B[0m");
                    System.out.println("\u001B[33m"+"2. Nuevo Profesional"+"\u001B[0m");
                    System.out.println("\u001B[34m"+"3. Nuevo Administrativo"+"\u001B[0m");
                    System.out.println("\u001B[32m"+"4. Eliminar Usuario"+"\u001B[0m");
                    System.out.println("\u001B[33m"+"5. Listar Usuario"+"\u001B[0m");
                    System.out.println("\u001B[34m"+"6. Listar Usuarios por tipo"+"\u001B[0m");
                    System.out.println("\u001B[32m"+"7. Nueva Capacitación"+"\u001B[0m");
                    System.out.println("\u001B[33m"+"8. Listar Capacitación"+"\u001B[0m");
                    System.out.println("\u001B[31m"+"9. Menu de bienvenida"+"\u001B[0m");
                    System.out.print("\u001B[37;40;1m"+"Elige una opción: "+"\u001B[0m");
                    opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("===== " + "\u001B[36m" + "CREAR CLIENTE" + "\u001B[0m" + " ====="); // Agrega color cyan al texto "CREAR CLIENTE"
                            System.out.print("Ingrese la razón social: ");
                            // Resto del código para leer los datos del cliente y agregarlos al contenedor
                            break;
                        case 2:
                            System.out.println("Seleccionaste la opción 2");
                            // Resto del código para la opción 2
                            break;
                        case 3:
                            System.out.println("Seleccionaste la opción 3");
                            // Resto del código para la opción 3
                            break;
                        case 4:
                            System.out.println("Seleccionaste la opción 4");
                            // Resto del código para la opción 4
                            break;
                        case 5:
                            System.out.println("Seleccionaste la opción 5");
                            // Resto del código para la opción 5
                            break;
                        case 6:
                            System.out.println("Seleccionaste la opción 6");
                            // Resto del código para la opción 6
                            break;
                        case 7:
                            System.out.println("Seleccionaste la opción 7");
                            // Resto del código para la opción 7
                            break;
                        case 8:
                            System.out.println("Seleccionaste la opción 8");
                            // Resto del código para la opción 8
                            break;
                        case 9:
                            System.out.println("\u001B[31m" + "Saliendo del programa..." + "\u001B[0m"); // Agrega color rojo al texto "Saliendo del programa..."
                            break;
                        default:
                            System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                            break;
                    }
                } while (opcion != 9);



            };



        }while (menu !=2);
        scanner.close();



    }

}