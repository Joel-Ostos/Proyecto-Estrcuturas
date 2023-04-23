package clases;
public class Libro {
  private String nombre;
  private String autor;
  private int cantidad;
  private String editorial;
  private String categoria;

  public Libro(String nombre, String autor, int cantidad, String editorial, String categoria) {
    this.nombre = nombre;
    this.autor = autor;
    this.cantidad = cantidad;
    this.editorial = editorial;
    this.categoria = categoria;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public String getEditorial() {
    return editorial;
  }

  public void setEditorial(String editorial) {
    this.editorial = editorial;
  }
  public void setCategoria( String categoria){
    this.categoria = categoria;
  } 
  public String getCategoria(){
    return categoria;
  }

  @Override
  public String toString() {
    return "Libro{" +
      "nombre='" + nombre + '\'' +
      ", autor='" + autor + '\'' +
      ", cantidad=" + cantidad +
      ", editorial='" + editorial + '\'' +
      '}';
  }
}
