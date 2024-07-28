package com.backend.model;

public class MenuVegetariano extends Menu{
    private int cantidadSalsas;

    public MenuVegetariano(double precioBase, int cantidadSalsas) {
        super(precioBase);
        this.cantidadSalsas = cantidadSalsas;
    }

    @Override
    protected String armarMenu() {
        String rpta = "Armando el menú vegetariano: Agregando ensalada, tofu";
        if (cantidadSalsas > 0){
            rpta = "Armando el menú vegetariano: Agregando ensalada, tofu y salsas: " + cantidadSalsas;
        }
        return rpta;
    }

    @Override
    protected double calcularPrecio() {
        double precioTotal = precioBase + 1.01;
        if (cantidadSalsas > 0){
            double recargoSalsa = 2.00 * cantidadSalsas;
            return precioTotal + recargoSalsa;
        }
        return precioTotal;
    }
}
