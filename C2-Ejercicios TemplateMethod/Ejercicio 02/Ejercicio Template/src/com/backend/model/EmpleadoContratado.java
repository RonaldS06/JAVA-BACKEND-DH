package com.backend.model;

public class EmpleadoContratado extends Empleado{
    private int cantidadHoras;
    private double valorHora;

    public EmpleadoContratado(String nombre, String apellido, String numeroDeCuenta, int cantidadHorasTrabajadas, double valorHora) {
        super(nombre, apellido, numeroDeCuenta);
        this.cantidadHoras = cantidadHorasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }
    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
