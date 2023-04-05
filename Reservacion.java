import java.util.Date;

public class Reservacion {
    private Cliente cliente;
    private Libro libro;
    private Date fechaReservacion;

    // Constructor
    public Reservacion(Cliente cliente, Libro libro, Date fechaReservacion) {
        this.cliente = cliente;
        this.libro = libro;
        this.fechaReservacion = fechaReservacion;
    }

    // Getters y setters
    // ...
}

