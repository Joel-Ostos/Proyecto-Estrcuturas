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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Date getFechaReservacion() {
        return fechaReservacion;
    }

    public void setFechaReservacion(Date fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }
    
    
}