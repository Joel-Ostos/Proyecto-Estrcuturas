package clases;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class LibrosBiblioteca {

    private TreeSet<Libro> libros;
    private Queue<Reserva> reservas;

    public LibrosBiblioteca() {
        libros = new TreeSet<>(Comparator.comparing(Libro::getNombre));
        reservas = new LinkedList<>();
    }

    public void create(String nombre, String autor, int cantidad, String editorial, String categoria) {
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
        TreeSet<Libro> librosPorAutor = new TreeSet<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                librosPorAutor.add(libro);
            }else {
                System.out.println("El libro no está en la biblioteca");
            }
        }
        return librosPorAutor;
    }

    public TreeSet<Libro> mostrarPorAutorYEditorial(String autor, String nombreLibro) {
        TreeSet<Libro> librosPorAutorYEditorial = new TreeSet<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor) && libro.getEditorial().equals(nombreLibro)) {
                librosPorAutorYEditorial.add(libro);
            }else {
                System.out.println("El libro no está en la biblioteca");
            }
        }
        return librosPorAutorYEditorial;
    }

    public TreeSet<Libro> mostrarPorAutorYCategoria(String autor, String categoria) {
        TreeSet<Libro> librosPorAutorYCategoria = new TreeSet<>();
        for (Libro l : libros) {
            if (l.getAutor().equals(autor) && l.getCategoria().equals(categoria)) {
                librosPorAutorYCategoria.add(l);
            }else {
                System.out.println("El libro no está en la biblioteca");
            }
        }
        return librosPorAutorYCategoria;
    }

    public TreeSet<Libro> mostrarTodos() {
       TreeSet<Libro> librosTodos = new TreeSet<>();
        for (Libro libro : libros) {
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

    public int CantidadLibros(String NombreLibro) {
        for (Libro l : libros) {
            if (l.getNombre().equals(NombreLibro)) {
                nLibros += 1;
            }
        }
        return nLibros;
    }

    public boolean reservarLibro(String cliente, String libro) {
        Libro libroEncontrado = mostrarPorNombre(libro);
        if (libroEncontrado == null) {
            return false;
        }
        reservas.add(new Reserva(cliente, libro));
        return true;
    }

    public boolean cancelarReserva(String cliente, String libro) {
        for (Reserva reserva : reservas) {
            if (reserva.getCliente().equals(cliente) && reserva.getLibro().equals(libro)) {
                reservas.remove(reserva);
                return true;
            }
        }
        return false;
    }

    public String notificarCliente() {
        if (reservas.isEmpty()) {
            return null;
        }

        Reserva reserva = reservas.peek();
        Libro libro = mostrarPorNombre(reserva.getLibro());

        if (libro != null) {
            reservas.poll();
            return reserva.getCliente();
        } else {
            return null;
        }
    }
}

