package Biblioteca;


import java.util.Scanner;

public class CompraPrestamoLibro{
    GeneradorTickets ticket = new GeneradorTickets();
    Scanner sc = new Scanner(System.in);
    static String Nombre, DNI, Apellidos;
    String nombreCliente, apellidosCliente, dni, ImpTicket, imprimirTicket;
    int OtraVenta;



    @Override
    public String toString() {
        return "CompraPrestamoLibro{" +
                "NombreCliente='" + Nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", ApellidosCliente='" + Apellidos;
    }

    public void ventaLibro()
    {
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
        OtraVenta = sc.nextInt();
    }

}
