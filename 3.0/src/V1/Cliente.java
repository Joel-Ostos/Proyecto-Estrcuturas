package clases.V1;

import java.util.LinkedList;
import java.util.List;

public class Cliente {

    private String nombre;
    private String clave;
    private LinkedList<Libro> listaLibros = new LinkedList<Libro>();

    public Cliente(String nombre, String clave, LinkedList<Libro> listaLibros) {
        this.nombre = nombre;
        this.clave = clave;
        this.listaLibros = listaLibros;
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
    public List<Libro> mostrarLibros() {
        for(Libro l : listaLibros){
            System.err.println(l);
        }
        return this.listaLibros;
    }

    public LinkedList<Libro> getListaLibros() {
        return listaLibros;
    }

    public Libro mostrarPorNombreCli(String Nombre){
      for (Libro i : getListaLibros()){
	if (i.getNombre().equals(Nombre)){
	  return i;
	}
      }
      return null;
    }

}
