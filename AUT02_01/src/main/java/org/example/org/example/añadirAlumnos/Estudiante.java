package org.example.añadirAlumnos;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private int edad;
    private float nota_media;
    private boolean matriculado;


    public Estudiante(String nombre, int edad, float nota_media, boolean matriculado) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota_media = nota_media;
        this.matriculado = matriculado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getNota_media() {
        return nota_media;
    }

    public void setNota_media(float nota_media) {
        this.nota_media = nota_media;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }


    @Override
    public String toString() {
        for (int i = 0; i < listaEstudiantes.toArray().length; i++) {
            return listaEstudiantes.get(i).toString();
        }
    }
}


