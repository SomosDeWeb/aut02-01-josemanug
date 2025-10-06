package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Seleccione una opción");
            int opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("""
                === Gestor de Estudiantes ===
                1. Añadir estudiante
                2. Listar estudiantes
                3. Buscar por nombre
                4. Calcular nota media general
                5. Mostrar mejor estudiante
                6. Salir
                """);

            switch (opcion) {
                case 1:
                    funcion;
                    break;
                case 2:
                    funcion;
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