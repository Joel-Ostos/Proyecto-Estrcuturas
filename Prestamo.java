import java.util.Date;

public class Prestamo {
    private Cliente cliente;
    private Libro libro;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    // Constructor
    public Prestamo(Cliente cliente, Libro libro, Date fechaPrestamo, Date fechaDevolucion) {
        this.cliente = cliente;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    // Getters y setters
    // ...
}

