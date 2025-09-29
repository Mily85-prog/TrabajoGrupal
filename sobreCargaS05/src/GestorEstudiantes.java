
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mily
 */
public class GestorEstudiantes {
       private ArrayList<String> estudiantes = new ArrayList<>();

    public void agregarEstudiante(String nombre) {
        estudiantes.add(nombre);
    }

    public void mostrarEstudiantes() {
        for (String e : estudiantes) {
            System.out.println(e);
        }
    }
}
