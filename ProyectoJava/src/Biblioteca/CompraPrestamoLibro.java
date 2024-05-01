package Biblioteca;

import java.util.ArrayList;

public class CompraPrestamoLibro{
    String NombreCliente, DNI, ApellidosCliente;
    double monto;
    ArrayList<Libro> listaLibros;

    public CompraPrestamoLibro()
    {
        listaLibros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "CompraPrestamoLibro{" +
                "NombreCliente='" + NombreCliente + '\'' +
                ", DNI='" + DNI + '\'' +
                ", ApellidosCliente='" + ApellidosCliente + '\'' +
                ", monto=" + monto +
                ", listaLibros=" + listaLibros +
                '}';
    }

}
