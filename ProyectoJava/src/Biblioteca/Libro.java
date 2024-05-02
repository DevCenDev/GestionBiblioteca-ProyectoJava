package Biblioteca;

public class Libro {
    String Id;
    String Nombre, Genero, Autor, Editorial;
    public Libro()
    {
    }

    public Libro(String  ID,String nombre, String genero, String autor, String editorial) {
        this.Id = ID;
        this.Nombre = nombre;
        this.Genero = genero;
        this.Autor = autor;
        this.Editorial = editorial;
    }

    public  Libro[] crearLibros() {
        Libro[] libros = new Libro[6]; // Crear un array de tamaño 3 (puedes ajustar este tamaño según tus necesidades)


        libros[0] = new Libro("001","Libro1", "Ingeniería", "Autor1", "Editorial1");
        libros[1] = new Libro("002","Libro2", "Ingeniería", "Autor2", "Editorial2");
        libros[2] = new Libro("003","Libro3", "Ingeniería", "Autor3", "Editorial3");

      for(Libro a : libros)
      {
          System.out.println(a);
      }

        return libros; // Devolver el array de objetos Libro
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Id='" + Id + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Genero='" + Genero + '\'' +
                ", Autor='" + Autor + '\'' +
                ", Editorial='" + Editorial + '\'' +
                '}';
    }
}
