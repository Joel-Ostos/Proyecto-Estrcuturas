import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    private Queue<Reservacion> cola;

    public Cola() {
        cola = new LinkedList<>();
    }

    // Método para agregar una reservación a la cola
    public void agregar(Reservacion reservacion) {
        cola.add(reservacion);
    }

    // Método para quitar y obtener la siguiente reservación en la cola
    public Reservacion siguiente() {
        return cola.poll();
    }

    // Otros métodos como buscar, eliminar, etc.
}

