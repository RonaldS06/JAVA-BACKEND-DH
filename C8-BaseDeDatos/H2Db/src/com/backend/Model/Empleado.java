package com.backend.Model;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.time.LocalDate;

public class Empleado {

    private static final Logger logger = Logger.getLogger(Empleado.class);

    public static void main(String[] args) {
        logger.info("");
    }

    public static Connection getConnection() throws ClassNotFoundException {
        Class.forName("org.h2.Driver");
        return null;
    }

    private int id;
    private String nombre;
    private int edad;
    private String empresa;
    private String fechaAsignada;

    public Empleado(int id, String nombre, int edad, String empresa, String fechaAsignada) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.empresa = empresa;
        this.fechaAsignada = fechaAsignada;
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

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFechaAsignada() {
        return fechaAsignada;
    }
    public void setFechaAsignada(String fechaAsignada) {
        this.fechaAsignada = fechaAsignada;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", empresa='" + empresa + '\'' +
                ", fechaAsignada='" + fechaAsignada + '\'' +
                '}';
    }
}
