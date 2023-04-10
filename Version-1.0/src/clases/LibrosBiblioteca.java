package clases;

import java.util.*;

public class LibrosBiblioteca {
    LinkedList<Libro> libros = new LinkedList<>();
    Queue<Libro>Cola = new LinkedList<>();
    

    public void create(String NombreLibro, String Autor, int CantidadLibros, String Editorial) {
        Libro libro = new Libro();
        libro.setNombreLibro(NombreLibro);
        libro.setAutor(Autor);
        libro.setCantidadLibros(CantidadLibros);
        libro.setEditorial(Editorial);
        libros.add(libro);
    }
    public void create(String NombreLibro){
        for(Libro i : libros){
            if(i.getNombreLibro().equals(NombreLibro)){
                System.out.println("Libro en la Biblioteca");
                System.out.println("guardando libro...");
            }else{
                System.out.println("Libro no disponible\nagregando a la cola...");
                Cola.add(i);
            }
        }
    }

    public Libro mostrarPorNombre(String NombreLibro) {
        for (Libro libro : libros) {
            if (libro.getNombreLibro().equals(NombreLibro)) {
                return libro;
            }
        }
        return null;
    }

    public LinkedList<String> mostrarTodos() {
        LinkedList<String> todosLibros = new LinkedList<>();
        for (Libro libro : libros) {
            todosLibros.add(libro.getNombreLibro());
        }
        return todosLibros;
    }

    public String eliminarLibro(String NombreLibro) {
        for (Libro l : libros) {
            if (l.getNombreLibro().equals(NombreLibro)) {
                libros.remove(l);
                return NombreLibro;
            }
        }
        return null;
    }
}
