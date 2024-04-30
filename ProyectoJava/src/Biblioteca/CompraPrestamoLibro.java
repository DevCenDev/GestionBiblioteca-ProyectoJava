package Biblioteca;

public class CompraPrestamoLibro extends Libro{
    String NombreCliente, DNI, ApellidosCliente;
    double monto;

    public CompraPrestamoLibro()
    {
    }
    public CompraPrestamoLibro(String Nombre, String Apellidos, String DNI, double monto)
    {
        super();
        this.NombreCliente = Nombre;
        this.ApellidosCliente = Apellidos;
        this.DNI = DNI;
        this.monto = monto;

    }


}
