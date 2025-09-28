
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Mily
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.println("Hola mundo, Semana 04");
          Scanner sc = new Scanner(System.in);
        GestorEstudiante gestor = new GestorEstudiante();
        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE ESTUDIANTES =====");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Buscar estudiante por ID");
            System.out.println("4. Buscar estudiante por nombre");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();

                    Estudiante nuevo = new Estudiante(id, nombre, edad);
                    gestor.agregarEstudiante(nuevo);
                    System.out.println(" Estudiante agregado.");
                    break;

                case 2:
                    gestor.listarEstudiantes();
                    break;

                case 3:
                    System.out.print("Ingrese ID a buscar: ");
                    int buscarId = sc.nextInt();
                    Estudiante encontrado = gestor.buscarPorId(buscarId);
                    if (encontrado != null) {
                        System.out.println("Encontrado: " + encontrado);
                    } else {
                        System.out.println(" No existe estudiante con ese ID.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese nombre a buscar: ");
                    String nombreBuscar = sc.nextLine();
                   var lista = gestor.buscarPorNombre(nombreBuscar);
                   if (lista.isEmpty()) {
                   System.out.println("❌ No se encontraron coincidencias.");
                   } else {
                   System.out.println("✅ Resultados encontrados:");
                   for (Estudiante e : lista) {
                   System.out.println(e);
        }
    }
    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("️ Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
    }
    

