package org.example;


import org.example.añadirAlumnos.Estudiante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String nombre = "";
        int edad = 0;
        float nota_media = 0;
        boolean matriculado = false;

        List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();

        Estudiante estudiante = new Estudiante(nombre, edad, nota_media, matriculado);

        do {
            System.out.println("""
                === Gestor de Estudiantes ===
                1. Añadir estudiante
                2. Listar estudiantes
                3. Buscar por nombre
                4. Calcular nota media general
                5. Mostrar mejor estudiante
                6. Salir
                """);
            sc.nextLine();

            System.out.println("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce nombre: ");
                    nombre = sc.nextLine();

                    System.out.println("Introduce edad: ");
                    edad = sc.nextInt(); sc.nextLine();

                    System.out.println("Introduce nota media: ");
                    nota_media = sc.nextFloat(); sc.nextLine();

                    System.out.println("Introduce matriculado (true/false): ");
                    matriculado = sc.nextBoolean();

                    estudiante.añadirEstudiante(estudiante);
                    break;
                case 2:
                    estudiante.toString();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción invalida.");
                    break;
            }
        } while(opcion != 6);


    }
}