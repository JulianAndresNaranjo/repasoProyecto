package org.example.tallerrepaso;

public class Estudiante extends Persona {
    private String edad;

    public Estudiante(int edad, String identificacion, String nombre, String apellidos) {
        super(identificacion, nombre, apellidos);
        this.edad = identificacion;

    }
    public String getEdad() {
        return edad;

    }public void setEdad(String apellidos) {
        this.edad = apellidos;
    }
}