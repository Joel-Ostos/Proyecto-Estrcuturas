public class NodoLibro {
  private Libro libro;
  private NodoLibro izquierda;
  private NodoLibro derecha;
  // Constructor, getters, setters y otros métodos
  // Constructor que recibe solo el objeto Libro
  public NodoLibro(Libro libro) {
    this.libro = libro;
    this.izquierdo = null;
    this.derecho = null;
  }

  // Constructor que recibe el objeto Libro y los nodos hijos
  public NodoLibro(Libro libro, NodoLibro izquierdo, NodoLibro derecho) {
    this.libro = libro;
    this.izquierdo = izquierdo;
    this.derecho = derecho;
  }
  // Getter y setter para el atributo 'libro'
  public Libro getLibro() {
    return libro;
  }

  public void setLibro(Libro libro) {
    this.libro = libro;
  }

  // Getter y setter para el atributo 'izquierdo'
  public NodoLibro getIzquierdo() {
    return izquierdo;
  }

  public void setIzquierdo(NodoLibro izquierdo) {
    this.izquierdo = izquierdo;
  }

  // Getter y setter para el atributo 'derecho'
  public NodoLibro getDerecho() {
    return derecho;
  }

  public void setDerecho(NodoLibro derecho) {
    this.derecho = derecho;
  }
}

