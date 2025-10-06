package org.example;


import org.example.añadirAlumnos.Estudiante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        String nombre = "";
        int edad = 0;
        float nota_media = 0;
        boolean matriculado = false;
        Estudiante estudiante = new Estudiante();

        List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();

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
            System.out.println("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce nombre: ");
                    nombre = sc.nextLine();

                    System.out.println("Introduce edad: ");
                    edad = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Introduce nota media: ");
                    nota_media = sc.nextFloat();
                    sc.nextLine();

                    System.out.println("Introduce matriculado (true/false): ");
                    matriculado = sc.nextBoolean();

                    estudiante = new Estudiante(nombre, edad, nota_media, matriculado);

                    listaEstudiantes.add(estudiante);
                    break;
                case 2:
                    System.out.println("Lista de estudiantes: \n");
                    for (int i = 0; i < listaEstudiantes.toArray().length; i++) {
                        System.out.println(listaEstudiantes.get(i).toString());
                    }
                    break;
                case 3:
                    System.out.println("Nombre del alumno a buscar: ");
                    String nom = sc.nextLine();
                    int pos = 0;
                    while (!(estudiante.getNombre().equals(nom)) && pos < listaEstudiantes.toArray().length - 1) {
                        pos++;
                    }
                    if (listaEstudiantes.get(pos).getNombre().equals(nom)) {
                        System.out.println(listaEstudiantes.get(pos).toString());
                    }
                    if (pos == listaEstudiantes.size() && !(estudiante.getNombre().equals(nom))) {
                        System.out.println("No existe el alumno a buscar. \n");
                    }
                    break;
                case 4:
                    float totalNota = 0;
                    float mediaGeneral = 0;
                    for (int i = 0; i < listaEstudiantes.toArray().length; i++) {
                        totalNota += listaEstudiantes.get(i).getNota_media();
                    }
                    mediaGeneral = totalNota / listaEstudiantes.toArray().length;
                    System.out.println("La media general es de: " + mediaGeneral + "\n");
                    break;
                case 5:
                    float maxNota = 0;
                    int i = 0;
                    while (i < listaEstudiantes.toArray().length && listaEstudiantes.get(i).getNota_media() > maxNota) {
                        maxNota = listaEstudiantes.get(i).getNota_media();
                        i++;
                    }
                    if (listaEstudiantes.get(i).getNota_media() == maxNota) {
                        System.out.println(listaEstudiantes.get(i).toString());
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción invalida.");
                    break;
            }
        } while(opcion != 6);
        System.out.println("Cerrando programa...");
    }
}