package clases;
public class Biblioteca {

  public static void main(String[] args) {
    LibrosBiblioteca libros = new LibrosBiblioteca();
    for (int i = 1; i < 100000000; i++){
      // Función para la creación de libro
      libros.create("1","2",i,"editorial","terro");
      // Función para mostrar un libro
      // libros.mostrarPorNombre("1");
      // Función para modificación del nombre del libro
      // libros.ModificarNombre("1","2");
      // Función para eliminar libro
      libros.eliminarLibro("1");
    }
  }
}
