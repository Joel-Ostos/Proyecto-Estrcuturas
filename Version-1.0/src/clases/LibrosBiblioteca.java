package clases;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class LibrosBiblioteca {
    private TreeSet<Libro> libros;
    
    public LibrosBiblioteca() {
        libros = new TreeSet<>(Comparator.comparing(Libro::getNombre));
    }

    public void create(String nombre, String autor, int cantidad, String editorial) {
        Libro libro = new Libro(nombre, autor, cantidad, editorial);
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

    public LinkedList<Libro> mostrarPorAutor(String autor) {
        LinkedList<Libro> librosPorAutor = new LinkedList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                librosPorAutor.add(libro);
            }
        }
        return librosPorAutor;
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

    public LinkedList<Libro> mostrarPorAutorYLibro(String autor, String nombreLibro) {
        LinkedList<Libro> librosPorAutorYLibro = new LinkedList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor) && libro.getNombre().equals(nombreLibro)) {
                librosPorAutorYLibro.add(libro);
            }
        }
        return librosPorAutorYLibro;
    }
    public LinkedList<Libro> mostrarTodos(){
        LinkedList<Libro> librosTodo = new LinkedList<>();
        for(Libro libro : libros){
            librosTodo.add(libro);
        }
        return librosTodo;
    }

    // Otros métodos de la clase LibrosBiblioteca
}
