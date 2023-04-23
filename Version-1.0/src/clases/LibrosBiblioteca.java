package clases;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

import com.sun.source.tree.Tree;

public class LibrosBiblioteca {
  private TreeSet<Libro> libros;

  public LibrosBiblioteca() {
    libros = new TreeSet<>(Comparator.comparing(Libro::getNombre));
  }

  public void create(String nombre, String autor, int cantidad, String editorial, String categoria ) {
    Libro libro = new Libro(nombre, autor, cantidad, editorial, categoria);
    libros.add(libro);
  }

  public Libro mostrarPorNombre(String nombre) {
    for (Libro libro : libros) {
      if (libro.getNombre().equals(nombre)) {
	return libro;
      }
    }
    return null;
  }

  public TreeSet<Libro> mostrarPorAutor(String autor) {
    TreeSet<Libro> librosPorAutor = new LinkedList<>();
    for (Libro libro : libros) {
      if (libro.getAutor().equals(autor)) {
	librosPorAutor.add(libro);
      }
    }
    return librosPorAutor;
  }
  public TreeSet<Libro> mostrarPorAutorYEditorial(String autor, String nombreLibro) {
    TreeSet<Libro> librosPorAutorYEditorial = new LinkedList<>();
    for (Libro libro : libros) {
      if (libro.getAutor().equals(autor) && libro.getEditorial().equals(nombreLibro)) {
	librosPorAutorYEditorial.add(libro);
      }
    }
    return librosPorAutorYLibro;
  }

  public TreeSet<Libro> mostrarPorAutorYCategoria(String autor, String categoria){
    TreeSet<Libro> librosPorAutorYCategoria = new LinkedList<>();
    for (Libro l : libros){
      if ( l.getAutor().equals(autor) && l.getCategoria().equals(categoria)){
	librosPorAutorYCategoria.add(l);
      }
    }
    return librosPorAutorYCategoria;
  }
  public TreeSet<Libro> mostrarTodos(){
    TreeSet<Libro> librosTodo = new LinkedList<>();
    for(Libro libro : libros){
      librosTodo.add(libro);
    }
    return librosTodo;
  }

  public boolean actualizarLibro(String nombre, String nuevoNombre, String nuevoAutor, String nuevaEditorial, String nuevaCategoria) {
    Libro libro = mostrarPorNombre(nombre);
    if (libro == null) {
      return false;
    }

    libro.setNombre(nuevoNombre);
    libro.setAutor(nuevoAutor);
    libro.setEditorial(nuevaEditorial);
    return true;
  }

  public Libro eliminarLibro(String nombre) {
    Libro libro = mostrarPorNombre(nombre);
    if (libro != null) {
      libros.remove(libro);
      return libro;
    }
    return null;
  }


  int nLibros = 0;
  public int CantidadLibros(String NombreLibro){
    for (Libro l : libros){
      if (l.getNombreLibro().equals(NombreLibro)){
	nLibros += 1;
      }
    }
    return nLibros;
  }

}
