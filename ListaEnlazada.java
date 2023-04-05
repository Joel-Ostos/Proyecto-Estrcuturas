public class ListaEnlazada {
    private NodoPrestamo cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }

    // Método para agregar un préstamo al inicio de la lista
    public void agregar(Prestamo prestamo) {
        NodoPrestamo nuevoNodo = new NodoPrestamo(prestamo);
        nuevoNodo.setSiguiente(cabeza);
        cabeza = nuevoNodo;
    }

    // Otros métodos como buscar, eliminar, etc.
}

