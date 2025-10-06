package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
            System.out.println("Seleccione una opción");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce nombre: ");
                    String nombre = sc.nextLine();

                    System.out.println("Introduce edad: ");
                    int edad = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Introduce nota media: ");
                    float nota_media = sc.nextFloat();

                    System.out.println("Introduce matriculado (true/false): ");
                    boolean matriculado = sc.nextBoolean();

                    añadirEstudiante.añadirAlumno(nombre, edad, nota_media, matriculado);
                    break;
                case 2:
                    break;
                case 3:
                    funcion;
                    break;
                case 4:
                    funcion;
                    break;
                case 5:
                    funcion;
                    break;
                case *:
                    break;
            }
        } while(opcion != 6)


    }
}