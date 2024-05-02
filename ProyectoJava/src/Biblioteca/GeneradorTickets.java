package Biblioteca;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GeneradorTickets {
    String razonSocial;
    Date fecha = new Date();

    public GeneradorTickets() {
    }

    public String crearTicket(String ID, String razonSocial, String NombreCliente, String Apellidos, String DNI) {
        // Formatear la fecha y la hora en un formato específico
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        String FECHA = formatoFecha.format(fecha);
        String HORA = formatoHora.format(fecha);
        String cliente = NombreCliente + " " + Apellidos;
        String FORMATO = "%-6s%-30s%-12s%n";

        // Construir el ticket formateado
        StringBuilder ticket = new StringBuilder();
        ticket.append("=============================================\n");
        ticket.append("ID: " + ID + "\n");
        ticket.append("Razon Social: " + razonSocial + "\n");
        ticket.append("FECHA: " + FECHA + "\n");
        ticket.append("HORA: " + HORA + "\n");
        ticket.append("\n");

        ticket.append(String.format("Cliente: %S %n", cliente));
        ticket.append("DNI: " + DNI + "\n");

        ticket.append("\n");
        ticket.append("Productos: \n");

        // bucle for para los productos
        ticket.append(String.format(FORMATO, "CANT.", "DESCRIPCION", "IMPORTE"));
        ticket.append(String.format(FORMATO, "1", limitarLongitud("Los 3 cerditos"), "$25.90"));
        ticket.append(String.format(FORMATO, "2", limitarLongitud("Los gallinazos sin plumas"), "$100.00"));
        //
        ticket.append("\n");
        ticket.append(String.format("%43s", "TOTAL $225.90"));
        ticket.append("\n");

        ticket.append("Gracias por su compra!\n");
        ticket.append("Vuelva pronto\n");
        ticket.append("=============================================\n");

        return ticket.toString();
    }

    // Método para limitar la longitud de la descripción y agregar "..." si es
    // necesario
    private String limitarLongitud(String texto) {
        int longitudMaxima = 25;

        if (texto.length() > longitudMaxima) {
            return texto.substring(0, longitudMaxima - 3) + "...";
        } else {
            return texto;
        }
    }
}