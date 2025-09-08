/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico4;

import java.util.HashSet;
import trabajopractico4.interfaz.Formulario;

/**
 *
 * @author Florencia
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Formulario form = new Formulario();
        form.setVisible(true); //hace visible pantalla(interfaz)
        form.setLocationRelativeTo(null); //centra pantalla

        // TODO code application logic here
        Materia m1 = new Materia(1, "WEB", 2);
        Materia m2 = new Materia(2, "Matematica", 1);
        Materia m3 = new Materia(3, "Laboratorio 1", 1);
        Materia m4 = new Materia(3, "Laboratorio 1", 3);

        Alumno a1 = new Alumno(1001, "Lopez", "Martin");
        Alumno a2 = new Alumno(1002, "Martinez", "Brenda");
        Alumno a3 = new Alumno(1002, "Martinez", "Brian");

        HashSet<Alumno> listaalumnos = new HashSet();

        listaalumnos.add(a1);
        listaalumnos.add(a2);
        listaalumnos.add(a3);

        HashSet<Materia> listamaterias = new HashSet();

        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);

        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);

        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        a2.agregarMateria(m3);

        System.out.println("Lista total de alumnos: ");
        for (Alumno alu : listaalumnos) {
            System.out.println(alu);
        }
        System.out.println("");

        System.out.println("Lista total de materias: ");
        for (Materia mate : listamaterias) {
            System.out.println(mate);
        }
        System.out.println("");

        System.out.println("-------Listas de Materias del alumno Martin Lopez-------");
        a1.listarMaterias();
        System.out.println("");

        System.out.println("-------Listas de Materias del alumno Martinez Brenda-------");
        a2.listarMaterias();
        System.out.println("Cantidad de materias inscriptas del alumno Martin Lopez");
        System.out.println("");

        System.out.println(a1.cantidadMaterias());
        System.out.println("Cantidad de materias inscriptas del alumno Martinez Brenda");
        System.out.println(a2.cantidadMaterias());

    }
}
