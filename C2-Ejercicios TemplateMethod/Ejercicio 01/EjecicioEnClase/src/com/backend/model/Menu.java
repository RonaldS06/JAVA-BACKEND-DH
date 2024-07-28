package com.backend.model;

public abstract class Menu {
    protected double precioBase;

    public Menu(double precioBase){
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void ejecutarSistema(){
        prepararMenu();
        System.out.println(armarMenu());
        double precioTotal = calcularPrecio();
        System.out.println("El precio total es: " + precioTotal);
    }

    public void prepararMenu(){
        System.out.println("Instrucciones generales para armar el menú:");
        System.out.println("✅Verificar la orden del cliente.");
        System.out.println("✅Preparar los ingredientes.");
    }
    protected abstract String armarMenu();
    protected abstract double calcularPrecio();
}
