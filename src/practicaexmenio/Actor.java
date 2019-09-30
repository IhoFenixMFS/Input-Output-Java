/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaexmenio;

import java.io.*;

/**
 *
 * @author Iho
 */
public class Actor implements Comparable, Serializable {
    String nombre;
    String rol;
    
    public Actor () {
        
    }
    
    public Actor (String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
        else {
            this.nombre = "";
        }
        this.rol = "";
    }
    
    public Actor (String nombre, String rol) {
        if (nombre != null) {
            this.nombre = nombre;
        }
        else {
            this.nombre = "";
        }
        if (rol != null) {
            this.rol = rol;
        }
        else {
            this.rol = "";   
        }
    }
    
    public Actor (Actor a) {
        this.nombre = a.getNombre();
        this.rol = a.getRol();
    }
    
    public String getNombre () {
        return this.nombre;
    }
    
    public String getRol () {
        return this.rol;
    }
    
    public void setNombre (String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }
    
    public void setRol (String rol) {
        if (rol != null) {
            this.rol = rol;
        }
    }
    
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Actor a = (Actor) o;
        return (this.getNombre().equals(a.getNombre()) && this.getRol().equals(a.getRol()));
    }
    
    @Override
    public int compareTo (Object o) {
        Actor a = (Actor) o;
        return(this.getNombre().compareTo(a.getNombre()));
    }
    
    @Override
    public String toString () {
        return ("Nombre: " + this.nombre + "\n" + " Rol: " + this.rol);
    }
}
