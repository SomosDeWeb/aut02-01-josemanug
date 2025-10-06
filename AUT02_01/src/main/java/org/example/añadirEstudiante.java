public class añadirEstudiante {
    String nombre;
    int edad;
    float nota_media;
    boolean matriculado;

    String listaAlumnos;

    public añadirEstudiante(String nombre, int edad, float nota_media, boolean matriculado) {
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

    public String añadirAlumno(String nombre, int edad, float nota_media) {
        listaAlumnos.concat(nombre, edad, nota_media);
        return listaAlumnos;
    }
}
