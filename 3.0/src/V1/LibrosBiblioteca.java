package clases.V1;

import clases.V1.Libro;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;
import java.util.concurrent.CompletionStage;
import java.util.ArrayList;

public class LibrosBiblioteca {

    private TreeSet<Libro> libros;
    private Queue<Reserva> reservas;
    private ArrayList<Libro> listaEnvio;

    public LibrosBiblioteca() {
        libros = new TreeSet<>(Comparator.comparing(Libro::getNombre)
                .thenComparing(Libro::getAutor)
                .thenComparingInt(Libro::getCantidad)
                .thenComparing(Libro::getEditorial)
                .thenComparing(Libro::getCategoria));
        reservas = new LinkedList<>();
        listaEnvio = new ArrayList<>();
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

                //System.out.println(libro);
                return libro;
            }

        }
        return null;
    }

    public ArrayList mostrarPorAutor(String autor) {
        if (listaEnvio != null) {
            listaEnvio.clear();
        }

        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {

                System.out.println(libro);
                listaEnvio.add(libro);

            }
        }
        if (listaEnvio == null) {
            return null;
        } else {
            return listaEnvio;
        }
    }

    public ArrayList mostrarPorEditorial(String editorial) {
        if (listaEnvio != null) {
            listaEnvio.clear();
        }

        for (Libro libro : libros) {
            if (libro.getEditorial().equals(editorial)) {

                System.out.println(libro);
                listaEnvio.add(libro);

            }
        }
        if (listaEnvio == null) {
            return null;
        } else {
            return listaEnvio;
        }

    }

    public ArrayList mostrarPorCategoria(String categoria) {
        if (listaEnvio != null) {
            listaEnvio.clear();
        }

        for (Libro libro : libros) {
            if (libro.getCategoria().equals(categoria)) {

                System.out.println(libro);
                listaEnvio.add(libro);

            }
        }
        if (listaEnvio == null) {
            return null;
        } else {
            return listaEnvio;
        }
    }

    public int cantidadLibros(String NombreLibro) { //Obsoleto

        //obsoleto
        Libro libro = mostrarPorNombre(NombreLibro);
        return libro.getCantidad();
    }

    public ArrayList mostrarTodos() {
        if (listaEnvio != null) {
            listaEnvio.clear();
        }
        for (Libro libro : libros) {
            //System.out.println(libro);
            listaEnvio.add(libro);
        }

        if (listaEnvio == null) {
            return null;
        } else {
            return listaEnvio;
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
        libros.remove(libro);
        return null;
    }

    public Libro retirarUnidad(String nombre) {
        Libro libro = mostrarPorNombre(nombre);
        if (libro.getCantidad() > 0) {
            libro.setCantidad(libro.getCantidad() - 1);
            return libro;
        }
        return null;
    }

    public boolean pertenenciaColaReserva(String cliente, String libro){
        Libro libroEncontrado = mostrarPorNombre(libro);

        if (libroEncontrado == null) {
            System.out.println("El libro " + libro + " no existe.");
            return false; // no existe
        }

        // Verifica si ya existe una reserva para ese cliente y ese libro
        for (Reserva reserva : reservas) {
            if (reserva.getCliente().equals(cliente) && reserva.getLibro().equals(libro)) {
                System.out.println("Ya tienes una reserva para este libro.");
                return true; // ya esta en la cola
            }
            else{
                return false; //no deberia estar en esta opcion
            }
        }
    }
    
    
    
    public int reservarLibro(String cliente, String libro) {
        Libro libroEncontrado = mostrarPorNombre(libro);

        if (libroEncontrado == null) {
            System.out.println("El libro " + libro + " no existe.");
            return 0; // no existe
        }

        // Verifica si ya existe una reserva para ese cliente y ese libro
        for (Reserva reserva : reservas) {
            if (reserva.getCliente().equals(cliente) && reserva.getLibro().equals(libro)) {
                System.out.println("Ya tienes una reserva para este libro.");
                return 1; // ya esta en la cola
            }
        }
        // Al ejecutar este metodo se sabe que no hay libros disponibles
        // Agrega la reserva a la cola de reservas en todos los casos
        reservas.add(new Reserva(cliente, libro));
        //System.out.println("Reserva realizada. Serás notificado cuando el libro esté disponible.");
        return 2; // añade el libro a la reserva
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

    public Queue mostrarLibrosReservados() {
        /*for (Reserva i : reservas) {
            System.out.println(i.getLibro());
            return this.reservas;
        }*/
        System.out.println(reservas.toString());
        return reservas;
    }

    public String notificarCliente(String cliente) {
        if (reservas.isEmpty()) {
            return null;
        }

        Queue<Reserva> reservasTemporales = new LinkedList<>();

        Reserva reservaCliente = null;
        while (!reservas.isEmpty()) {
            Reserva reserva = reservas.poll();
            if (reserva.getCliente().equals(cliente)) {
                reservaCliente = reserva;
                break;
            }
            reservasTemporales.add(reserva);
        }

        while (!reservasTemporales.isEmpty()) {
            reservas.add(reservasTemporales.poll());
        }

        if (reservaCliente == null) {
            // El cliente no tiene reservas en la cola
            return null;
        }

        Libro libro = mostrarPorNombre(reservaCliente.getLibro());
        if (libro != null && libro.getCantidad() > 0) {
            System.out.println("Notificaci�n: El libro " + libro.getNombre() + " reservado por " + cliente + " est� disponible.");
            return reservaCliente.getCliente();
        } else {
            return null;
        }
    }

}
