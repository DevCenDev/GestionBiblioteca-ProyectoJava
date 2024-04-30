package Biblioteca;

public class CompraPrestamoLibro extends Libro{
    String Nombre, DNI, Apellidos;
    double monto;

    public CompraPrestamoLibro()
    {
    }
    public CompraPrestamoLibro(String Nombre, String Apellidos, String DNI, double monto)
    {
        super();
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.DNI = DNI;
        this.monto = monto;

    }


}
