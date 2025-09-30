/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mily
 */
public class Principal {
        public static void main(String[] args) {
        // --- Sobrecarga ---
        Calculadora calc = new Calculadora();
        System.out.println("Suma 2 enteros: " + calc.sumar(5, 3));
        System.out.println("Suma 3 enteros: " + calc.sumar(5, 3, 2));
        System.out.println("Suma decimales: " + calc.sumar(5.5, 3.2));

        // --- Manejo de errores ---
        Divisor divisor = new Divisor();
        System.out.println("División válida: " + divisor.dividir(10, 2));
        System.out.println("División inválida: " + divisor.dividir(10, 0));

        // --- Colecciones ---
        GestorEstudiantes gestor = new GestorEstudiantes();
        gestor.agregarEstudiante("Ana");
        gestor.agregarEstudiante("Luis");
        gestor.agregarEstudiante("Mily");
        System.out.println("Lista de estudiantes:");
        gestor.mostrarEstudiantes();
    }
}
