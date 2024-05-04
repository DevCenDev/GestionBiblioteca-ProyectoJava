package Biblioteca;

import java.util.Scanner;

public class AppConsole {
    public static void main(String[] args) {
        int menu, rOtraVenta;
        String nombreCliente, apellidosCliente, dni, imprimirTicket, ImpTicket;
        Libro libro01 = new Libro();
        GeneradorTickets ticket = new GeneradorTickets();

        // libro01.crearLibros();

        // MENU
        Scanner sc = new Scanner(System.in);

        System.out.println("BIENVENIDO A MI BIBLIOTECA");
        System.out.println("1. VENDER LIBROS");
        System.out.println("2. PRESTAR LIBROS");
        menu = sc.nextInt();
        sc.nextLine();

        switch (menu) {
            case 1:
                do {
                    System.out.print("Nombre del cliente: ");
                    nombreCliente = sc.nextLine();
                    System.out.print("Apellidos del cliente: ");
                    apellidosCliente = sc.nextLine();
                    System.out.print("DNI: ");
                    dni = sc.nextLine();

                    System.out.print("¿Deseas imprimir el ticket? (S/N) ");

                    ImpTicket = sc.nextLine();

                    if (ImpTicket.equalsIgnoreCase("S")) {
                        imprimirTicket = ticket.crearTicket("001", "MI BIBLIOTECA", nombreCliente, apellidosCliente,
                                dni);
                        System.out.println(imprimirTicket);
                    } else if (ImpTicket.equalsIgnoreCase("N")) {
                        System.out.println("Gracias por la preferencia.");
                    }
                    else {
                        System.out.println("Elija una opcion correcta.");
                    }


                    System.out.println("¿Desea realizar otra venta?");
                    System.out.println("1. SI");
                    System.out.println("2. NO");
                    System.out.println("3. Volver al menu principal");
                    rOtraVenta = sc.nextInt();
                    sc.nextLine();
                } while (rOtraVenta == 1);
                break;
            case 2:
                // Lógica para prestar libros
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        sc.close();
    }
}
