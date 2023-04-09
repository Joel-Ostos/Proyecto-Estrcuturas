package Clases;
import java.util.LinkedList;

public class LibrosBiblioteca {
  LinkedList<Libro> libros = new LinkedList<>();
  public void create(String NombreLibro,String Autor, int CantidadLibros,String Editorial){
    Libro libro = new Libro();
    libro.setNombreLibro(NombreLibro);
    libro.setAutor(Autor);
    libro.setCantidadLibros(CantidadLibros);
    libro.setEditorial(Editorial);
    libros.add(libro);
  }

  public Libro MostrarPorNombre(String NombreLibro){
    for (Libro libro : libros) {
      if (libro.getNombreLibro() == NombreLibro)
	return libro;
    }
    return null;
  }
  public Libro MostrarPorAutor(String Autor){
    for (Libro libro : libros) {
      if (libro.getAutor() == Autor)
	return libro;
}
    return null;
  }
  public LinkedList<String> MostrarTodos(){
    // Creamos una nueva lista vacia, con el objetivo de que en esta lista metamos todos los elementos (libros) que se encuentran en "libros" que si recordamos, es la lista en la que vamos ingresando los libros  
    LinkedList<String> TodosLibros = new LinkedList<>();
    for (Libro libro : libros){
      String t = libro.getNombreLibro();
      TodosLibros.add(t);
    }    
    return TodosLibros;
  }

  //   public String ModificarNombre(String NuevoNombreLibro, String Autor){
  //     String Nombre = MostrarPorAutor(Autor).getAutor();
  //     MostrarPorAutor(Autor).setNombreLibro(NuevoNombreLibro);
  //     return Nombre;
  //   }
  //   public String ModificarAutor(String NombreLibro, String NuevoAutor){
  //     String Autor2 = MostrarPorNombre(NombreLibro).getNombreLibro();
  //     MostrarPorNombre(NombreLibro).setAutor(NuevoAutor);
  //     return Autor2;
  //   }

  // Se elimina el objeto libro, tomando su nombre
  public String EliminarLibro(String NombreLibro){
    int index=0;
    for (Libro l : libros) {
      if (l.getNombreLibro() == NombreLibro){
	libros.remove(index);
	return NombreLibro;
      }
      index++;
    }
    return null;
  }
}

