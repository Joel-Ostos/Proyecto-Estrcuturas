package clases;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;
import java.util.concurrent.CompletionStage;

public class LibrosBiblioteca {

    private TreeSet<Libro> libros;
    private Queue<Reserva> reservas;

    public LibrosBiblioteca() {
        libros = new TreeSet<>(Comparator.comparing(Libro::getNombre)
                .thenComparing(Libro::getAutor)
                .thenComparingInt(Libro::getCantidad)
                .thenComparing(Libro::getEditorial)
                .thenComparing(Libro::getCategoria));
        reservas = new LinkedList<>();
    }

    public void create(String nombre, String autor, int cantidad, String editorial, String categoria) {
        Libro libro = new Libro(nombre, autor, cantidad, editorial, categoria);
        if (libros.contains(libro) != false) {
            libro.setCantidad(libro.getCantidad() + cantidad);
        } else {
            libros.add(libro);
        }

    }

    public Libro mostrarPorNombre(String nombre) {
        for (Libro libro : libros) {
            if (libro.getNombre().equals(nombre)) {
                return libro;
            }
        }
        return null;
    }

    public Libro mostrarPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    public Libro mostrarPorAutorEditorial(String autor, String editorial) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor) && libro.getEditorial().equals(editorial)) {
                return libro;
            }
        }
        return null;
    }

    public Libro mostrarPorEditorial(String editorial) {
        for (Libro libro : libros) {
            if (libro.getEditorial().equals(editorial)) {
                return libro;
            }
        }
        return null;
    }

    public int cantidadLibros(String NombreLibro) {
        Libro libro = mostrarPorNombre(NombreLibro);
        return libro.getCantidad();
    }

    public void mostrarTodos() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
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
        if (libro.getCantidad() > 0) {
            libro.setCantidad(libro.getCantidad() - 1);
            return libro;
        } else if (libro.getCantidad() == 0) {
            libros.remove(libro);
        }
        return null;
    }

    public boolean reservarLibro(String cliente, String libro) {
        Libro libroEncontrado = mostrarPorNombre(libro);
        System.out.println(libroEncontrado);
        if (libroEncontrado == null) {
            return false;
        }
        reservas.add(new Reserva(cliente, libro));
        System.out.println("Libro reservado...");
        return true;
    }

    public boolean cancelarReserva(String cliente, String libro) {
        for (Reserva reserva : reservas) {
            if (reserva.getCliente().equals(cliente) && reserva.getLibro().equals(libro)) {
                reservas.remove(reserva);
                System.out.println("Reserva cancelada...");
                return true;
            }
        }
        return false;
    }

    public void mostrarLibrosReservados() {
        for (Reserva i : reservas) {
            System.out.println(i.getLibro());
        }
    }

    public String notificarCliente(String cliente) {
        if (reservas.isEmpty()) {
            return null;
        }

        Reserva reservaCliente = null;
        for (Reserva reserva : reservas) {
            if (reserva.getCliente().equals(cliente)) {
                reservaCliente = reserva;
                break;
            }
        }

        if (reservaCliente == null) {
// El cliente no tiene reservas en la cola
            return null;
        }

        Libro libro = mostrarPorNombre(reservaCliente.getLibro());
        if (libro != null) {
            reservas.remove(reservaCliente);
            System.out.println("Notificación: El libro " + libro.getNombre() + " reservado por " + cliente + " está disponible.");
            return reservaCliente.getCliente();
        } else {
            return null;
        }
    }

}
