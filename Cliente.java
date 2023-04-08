/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.LinkedList;

public class Cliente {
    private String nombre;
    private String clave;
    private LinkedList<Libro> librosPrestados;

    public Cliente(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.librosPrestados = new LinkedList<>();
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

    public LinkedList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void prestarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", clave=" + clave + ", librosPrestados=" + librosPrestados + '}';
    }  
}
