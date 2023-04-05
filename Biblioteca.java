
import java.util.Date;

public class Biblioteca {
  InterfazGrafica gui = new InterfazGrafica();
  private ArbolBinarioBusqueda arbolLibros;
  private TablaHash tablaUsuarios;
  private ListaEnlazada listaPrestamos;
  private Cola colaReservaciones;

  public Biblioteca() {
    arbolLibros = new ArbolBinarioBusqueda();
    tablaUsuarios = new TablaHash();
    listaPrestamos = new ListaEnlazada();
    colaReservaciones = new Cola();
  }

  // Método para agregar un libro al árbol de libros
  public void agregarLibro(Libro libro) {
    arbolLibros.insertar(libro);
  }

  // Método para agregar un usuario a la tabla hash de usuarios
  public void agregarUsuario(Usuario usuario) {
    tablaUsuarios.agregar(usuario);
  }

  // Método para registrar un préstamo en la lista enlazada de préstamos
  public void registrarPrestamo(Cliente cliente, Libro libro) {
    Prestamo prestamo = new Prestamo(cliente, libro, new Date(), null);
    listaPrestamos.agregar(prestamo);
  }

  // Método para registrar una devolución en la lista enlazada de préstamos
  public void registrarDevolucion(Prestamo prestamo) {
    // Aquí puedes implementar la lógica para registrar la devolución de un libro
    // Por ejemplo, puedes actualizar la fecha de devolución del préstamo
    prestamo.setFechaDevolucion(new Date());
  }

  // Método para reservar un libro en la cola de reservaciones
  public void reservarLibro(Cliente cliente, Libro libro) {
    Reservacion reservacion = new Reservacion(cliente, libro, new Date());
    colaReservaciones.agregar(reservacion);
  }

  // Método para actualizar la información de un libro en el árbol de libros
  public void actualizarLibro(Libro libro) {
    // Implementa la lógica para actualizar la información de un libro en el árbol de libros
  }

  // Método para generar un reporte de estadísticas de uso de la biblioteca
  public void generarReporteEstadisticas() {
    // Implementa la lógica para generar un reporte de estadísticas de uso de la biblioteca
  }
}

  


