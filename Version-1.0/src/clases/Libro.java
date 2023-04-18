package clases;

public class Libro {
    private String NombreLibro;
    private String Autor;
    private int CantidadLibros;
    private String Editorial;

    // Metodo para obtener y fijar el nombre del libro (getters y setters).
    public String getNombreLibro() {return NombreLibro;}
    public void setNombreLibro(String NombreLibro) {
        this.NombreLibro = NombreLibro;
    }
    
    // Metodo para obtener y fijar autor (getters y setters).
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public void setCantidadLibros(int CantidadLibros){
      this.CantidadLibros = CantidadLibros;
    }

    public int getCantidadLibros(){
      return CantidadLibros;
    }
    
}


