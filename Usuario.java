public abstract class Usuario {
    private String nombre;
    private String contraseña;
    // Constructor, getters, setters y otros métodos
   // Constructor para la clase Cliente
    public Cliente(String nombre, String apellido, String nombreUsuario, String contraseña) {
        super(nombre, apellido, nombreUsuario, contraseña);
    }

    // Método reservarLibro(): realiza la reserva de un libro
    public void reservarLibro(Libro libro, Biblioteca biblioteca) {
        // Implementa la lógica para reservar un libro en la biblioteca
        biblioteca.reservarLibro(this, libro);
    }

    // Método devolverLibro(): devuelve un libro a la biblioteca
    public void devolverLibro(Prestamo prestamo, Biblioteca biblioteca) {
        // Implementa la lógica para devolver un libro a la biblioteca
        biblioteca.registrarDevolucion(prestamo);
    }
}

