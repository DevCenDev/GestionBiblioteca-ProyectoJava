package Biblioteca;

import java.util.Scanner;

public class AppConsole {
    public static void main(String[] args) {
        int menu;
        Scanner sc = new Scanner(System.in);
        CompraPrestamoLibro venderLibros = new CompraPrestamoLibro();


        System.out.print("""
                BIENVENIDO A MI BIBLIOTECA:
                1. VENDER LIBROS
                2. PRESTAR LIBROS
                ----------------------------
                Elija una opcion:\t""");
        menu = sc.nextInt();
        sc.nextLine();


        switch (menu) {
            case 1:
                venderLibros.ventaLibro();
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
