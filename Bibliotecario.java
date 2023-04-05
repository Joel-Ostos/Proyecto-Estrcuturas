public class Bibliotecario extends Usuario {
    // Métodos específicos del bibliotecario
    // Constructor para la clase Bibliotecario
    public Bibliotecario(String nombre, String apellido, String nombreUsuario, String contraseña) {
        super(nombre, apellido, nombreUsuario, contraseña);
    }

    // Método agregarLibro(): agrega un libro al inventario de la biblioteca
    public void agregarLibro(Libro libro, Biblioteca biblioteca) {
        // Implementa la lógica para agregar un libro al inventario de la biblioteca
        biblioteca.agregarLibro(libro);
    }

    // Método actualizarLibro(): actualiza la información de un libro en la biblioteca
    public void actualizarLibro(Libro libro, Biblioteca biblioteca) {
        // Implementa la lógica para actualizar la información de un libro en la biblioteca
        biblioteca.actualizarLibro(libro);
    }

    // Método generarReporte(): genera un reporte de estadísticas de uso de la biblioteca
    public void generarReporte(Biblioteca biblioteca) {
        // Implementa la lógica para generar un reporte de estadísticas de uso de la biblioteca
        biblioteca.generarReporteEstadisticas();
    }
}

