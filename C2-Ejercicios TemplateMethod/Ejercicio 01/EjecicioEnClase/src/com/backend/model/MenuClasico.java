package com.backend.model;

public class MenuClasico extends Menu{
    public MenuClasico(double precioBase) {
        super(precioBase);
    }

    @Override
    protected String armarMenu() {
        return "Armando el menú clásico...";
    }

    @Override
    protected double calcularPrecio() {
        return precioBase;
    }
}
