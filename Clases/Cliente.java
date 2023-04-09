import java.util.LinkedList;

public class Cliente {
  private String nombre;
  private String clave;
  private LinkedList<String> listaLibros = new LinkedList<>();

  public Cliente(String nombre, String clave, LinkedList<String> listaLibros) {
    this.nombre = nombre;
    this.clave = clave;
    this.listaLibros = listaLibros;
  }

  public Cliente() {
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
