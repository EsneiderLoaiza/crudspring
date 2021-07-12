package com.example.crudspring.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@Table(name="empleado")
public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String correo;
    private String titulo;
    private String telefono;
    private String imagenUrl;
    @Column(nullable = false, updatable = false)
    private String codigoEmpleado;


    public Empleado() {
    }

    public Empleado(String nombre, String correo, String titulo, String telefono, String imagenUrl, String codigoEmpleado) {
        this.nombre = nombre;
        this.correo = correo;
        this.titulo = titulo;
        this.telefono = telefono;
        this.imagenUrl = imagenUrl;
        this.codigoEmpleado = codigoEmpleado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", imagenUrl='" + imagenUrl + '\'' +
                ", codigoEmpleado='" + codigoEmpleado + '\'' +
                '}';
    }
}


