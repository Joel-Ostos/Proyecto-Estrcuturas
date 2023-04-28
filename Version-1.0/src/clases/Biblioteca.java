package clases;
public class Biblioteca {

  public static void main(String[] args) {
    LibrosBiblioteca libros = new LibrosBiblioteca();

    for (int i = 1; i < 10000000; i++){
      String a = Integer.toString(i);
      // Función para la creación de libro
      libros.create(a,"2",1,"editorial", "af");
      // Función para mostrar un libro
      // libros.mostrarPorNombre("1");
      // Función para modificación del nombre del libro
      // libros.ModificarNombre("1","2");
      // Función para eliminar libro
    }
  }
}
