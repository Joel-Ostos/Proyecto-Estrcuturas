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

    // Método para buscar un préstamo en la lista
    public NodoPrestamo buscar(Prestamo prestamoBuscado) {
        NodoPrestamo actual = cabeza;
        while (actual != null) {
            if (actual.getPrestamo().equals(prestamoBuscado)) {
                return actual;
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    // Método para eliminar un préstamo de la lista
    public void eliminar(Prestamo prestamoEliminar) {
        NodoPrestamo actual = cabeza;
        NodoPrestamo anterior = null;
        boolean encontrado = false;
        while (actual != null && !encontrado) {
            if (actual.getPrestamo().equals(prestamoEliminar)) {
                encontrado = true;
            } else {
                anterior = actual;
                actual = actual.getSiguiente();
            }
        }
        if (actual != null) {
            if (actual == cabeza) {
                cabeza = actual.getSiguiente();
            } else {
                anterior.setSiguiente(actual.getSiguiente());
            }
        }
    }
}
