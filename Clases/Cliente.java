import java.util.LinkedList;

public class Cliente {
  private String nombre;
  private String clave;
  LinkedList<Cliente> credencialesClientes = new LinkedList<>();

  public Cliente(String nombre, String clave){
    if (credencialesClientes.stream().anyMatch(cliente -> cliente.getNombre().equals(nombre) || cliente.getClave().equals(clave))) {
      System.out.println("usuario o correo ya están en la base de datos");
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

  public LinkedList<Cliente> getCredencialesClientes() {
    return credencialesClientes;
  }

  public void setCredencialesClientes(LinkedList<Cliente> credencialesClientes) {
    this.credencialesClientes = credencialesClientes;
  }

  @Override
  public String toString() {
    return "Cliente{" + "nombre=" + nombre + ", clave=" + clave + ", credencialesClientes=" + credencialesClientes + '}';
  }

}

