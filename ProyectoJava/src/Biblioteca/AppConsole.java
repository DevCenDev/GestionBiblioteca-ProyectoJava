package Biblioteca;

import java.util.Scanner;

public class AppConsole {
    public static void main(String[] args) {
        int menu, rImpTicket, rOtraVenta;
        String nombreCliente = "", apellidosCliente = "", dni = "", imprimirTicket;
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
                    System.out.println("Nombre del cliente: ");
                    nombreCliente = sc.nextLine();
                    System.out.println("Apellidos del cliente: ");
                    apellidosCliente = sc.nextLine();
                    System.out.println("DNI: ");
                    dni = sc.nextLine();

                    System.out.println("¿Desea imprimir el ticket?");
                    System.out.println("1. SI");
                    System.out.println("2. NO");
                    rImpTicket = sc.nextInt();
                    sc.nextLine();

                    if (rImpTicket == 1) {
                        imprimirTicket = ticket.crearTicket("001", "MI BIBLIOTECA", nombreCliente, apellidosCliente,
                                dni);
                        System.out.println(imprimirTicket);
                    } else {
                        System.out.println("Gracias por su preferencia");
                        break;
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
