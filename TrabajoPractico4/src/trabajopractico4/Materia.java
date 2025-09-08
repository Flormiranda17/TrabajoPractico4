/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico4;

/**
 *
 * @author Florencia
 */
public class Materia {
    private int idMateria;
    private String nombre;
    private int año;

    public Materia(int idMateria, String nombre, int año) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.año = año;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  nombre + ", año: " + año + ", ID Materia: " + idMateria  ;
    }
    

  
    
    
    
}
