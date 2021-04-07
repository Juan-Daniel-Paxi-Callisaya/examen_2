package com.emergentes.modelo;

public class Persona {

    int id;
    String nombre;
    String telefono;
    String correo;

    public Persona(int id, String nombre, String telefono, String correo){
        this.id=id;
        this.nombre=nombre;
        this.telefono=telefono;
        this.correo=correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
