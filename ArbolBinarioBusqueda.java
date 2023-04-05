public class ArbolBinarioBusqueda {
    private NodoLibro raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    // Método para insertar un libro en el árbol
    public void insertar(Libro libro) {
        raiz = insertarRecursivo(raiz, libro);
    }

    // Método recursivo para la inserción
    private NodoLibro insertarRecursivo(NodoLibro nodo, Libro libro) {
        // Caso base: el nodo está vacío, crear un nuevo nodo
        if (nodo == null) {
            return new NodoLibro(libro);
        }

        // Comparar y decidir en qué subárbol insertar
        int comparacion = libro.getTitulo().compareTo(nodo.getLibro().getTitulo());

        if (comparacion < 0) {
            nodo.setIzquierdo(insertarRecursivo(nodo.getIzquierdo(), libro));
        } else if (comparacion > 0) {
            nodo.setDerecho(insertarRecursivo(nodo.getDerecho(), libro));
        } else {
            // El libro ya existe, actualizar cantidad o realizar otra acción
        }

        return nodo;
    }

    // Otros métodos como buscar, eliminar, etc.
}

