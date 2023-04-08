/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    // Metodo para obtener y fijar la cantidad de libros (getters y setters).
    public int getCantidadLibros(){
      return CantidadLibros;
    }
    public void setCantidadLibros(int CantidadLibros){
      this.CantidadLibros = CantidadLibros;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }
    
}

