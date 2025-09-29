

import java.util.ArrayList;

public class GestorEstudiante {
    private ArrayList<Estudiante> estudiantes;
    
    public GestorEstudiante() {
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("️ No hay estudiantes registrados.");
        } else {
            System.out.println("\n--- Lista de Estudiantes ---");
            for (Estudiante e : estudiantes) {
                System.out.println(e);
            }
        }
    }

    public Estudiante buscarPorId(int id) {
        for (Estudiante e : estudiantes) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
    public ArrayList<Estudiante> buscarPorNombre(String nombre) {
    ArrayList<Estudiante> resultados = new ArrayList<>();
    for (Estudiante e : estudiantes) {
        if (e.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
            resultados.add(e);
        }
    }
    return resultados;
}
}
