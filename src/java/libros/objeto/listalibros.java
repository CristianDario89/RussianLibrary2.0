/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros.objeto;

/**
 *
 * @author Silvia
 */
public class listalibros {
    
    private int ID;
 private String nombre;
    private String autor;
    
    public listalibros(String nombre, String autor, int ID) {
        this.nombre = nombre;
        this.autor = autor;
        this.ID = ID;
    }

    public listalibros(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    
    
    
    
}


