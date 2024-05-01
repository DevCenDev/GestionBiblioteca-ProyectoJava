package Biblioteca;


public class Libro {
    String Nombre, Genero, Autor, Editorial;

    public Libro(String nombre, String genero, String autor, String editorial)
    {
        this.Nombre = nombre;
        this.Genero = genero;
        this.Autor = autor;
        this.Editorial = editorial;
    }
    public Libro()
    {}

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
