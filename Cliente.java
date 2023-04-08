package clases;
import java.util.LinkedList;

public class Cliente {
    private String nombre;
    private String clave;
    private static LinkedList<Cliente> credencialesClientes = new LinkedList<>();
    public Cliente(String nombre, String clave) {
        if (credencialesClientes.stream().anyMatch(cliente -> cliente.getNombre().equals(nombre) )) {
            System.out.println("El cliente ya está en la base de datos");
        } else {
            this.nombre = nombre;
            this.clave = clave;
            credencialesClientes.add(this);
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}

