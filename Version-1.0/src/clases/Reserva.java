package clases;

public class Reserva {
    private String cliente;
    private String libro;

    public Reserva(String cliente, String libro) {
        this.cliente = cliente;
        this.libro = libro;
    }

    public String getCliente() {
        return cliente;
    }

    public String getLibro() {
        return libro;
    }
}
