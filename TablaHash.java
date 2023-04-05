import java.util.HashMap;

public class TablaHash {
    private HashMap<String, Usuario> tabla;

    public TablaHash() {
        tabla = new HashMap<>();
    }

    // Método para agregar un usuario a la tabla
    public void agregar(Usuario usuario) {
        tabla.put(usuario.getNombreUsuario(), usuario);
    }

    // Método para buscar un usuario por nombre de usuario
    public Usuario buscar(String nombreUsuario) {
        return tabla.get(nombreUsuario);
    }

    // Otros métodos como eliminar, etc.
}

