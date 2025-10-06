package org.example.añadirAlumnos;

public class Estudiante {
    private String nombre;
    private int edad;
    private float nota_media;
    private boolean matriculado;

    public Estudiante() {}

    public Estudiante(String nombre, int edad, float nota_media, boolean matriculado) throws Exception {
        this.nombre = setNombre(nombre);
        this.edad = setEdad(edad);
        this.nota_media = setNota_media(nota_media);
        this.matriculado = setMatriculado(matriculado);
    }

    public String getNombre() {
        return nombre;
    }

    public String setNombre(String nombre) throws Exception {
        if(!nombre.equals("")){
            return this.nombre = nombre;
        }
        else {
            throw new Exception("El nombre no puede ser vacio");
        }
    }

    public int getEdad() {
        return edad;
    }

    public int setEdad(int edad) throws Exception {
        if(edad >= 0 && edad <= 100){
            return this.edad = edad;
        }
        else {
            throw new Exception("Edad no valida");
        }
    }

    public float getNota_media() {
        return nota_media;
    }

    private float setNota_media(float nota_media) throws Exception {
        if(nota_media > 0 && nota_media <= 10) {
            return this.nota_media = nota_media;
        }
        else {
            throw new Exception("La media se encuentra fuera de rango (0-10)");
        }
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    private boolean setMatriculado(boolean matriculado) throws Exception {
        if(matriculado == true || matriculado == false){
           return this.matriculado = matriculado;
        }
        else {
            throw new Exception("Campo no valido");
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años) - Nota media: " + nota_media + " - Matriculado: " + matriculado;
    }
}