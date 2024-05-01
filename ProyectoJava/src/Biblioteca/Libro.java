package Biblioteca;

public class Libro {
    String Nombre, Genero, Autor, Editorial;

    public Libro(String nombre, String genero, String autor, String editorial) {
        this.Nombre = nombre;
        this.Genero = genero;
        this.Autor = autor;
        this.Editorial = editorial;
    }

    public static Libro[] crearLibros() {
        Libro[] libros = new Libro[3]; // Crear un array de tamaño 3 (puedes ajustar este tamaño según tus necesidades)

        // Crear objetos Libro y asignarlos al array
        libros[0] = new Libro("Libro1", "Ingeniería", "Autor1", "Editorial1");
        libros[1] = new Libro("Libro2", "Ingeniería", "Autor2", "Editorial2");
        libros[2] = new Libro("Libro3", "Ingeniería", "Autor3", "Editorial3");

        return libros; // Devolver el array de objetos Libro
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Nombre='" + Nombre + '\'' +
                ", Genero='" + Genero + '\'' +
                ", Autor='" + Autor + '\'' +
                ", Editorial='" + Editorial + '\'' +
                '}';
    }
}
