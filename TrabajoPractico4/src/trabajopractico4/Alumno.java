/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico4;

import java.util.HashSet;

/**
 *
 * @author Florencia
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet <Materia>materias;
    

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias=new HashSet <>();
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.legajo;
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
        final Alumno other = (Alumno) obj;
        return this.legajo == other.legajo;
    }
    
    
    
    
    public void agregarMateria (Materia m){
             
                        materias.add(m);

            }
        
        
        
    
    
    public int cantidadMaterias (){
       
        return  materias.size();
        
    }

    
    public void listarMaterias(){
        for(Materia mm: materias){
            System.out.println(mm);
        }
        
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "legajo=" + legajo + ", apellido=" + apellido + ", nombre=" + nombre + '}';
    }
    
    

    
    
    
    
    
}
