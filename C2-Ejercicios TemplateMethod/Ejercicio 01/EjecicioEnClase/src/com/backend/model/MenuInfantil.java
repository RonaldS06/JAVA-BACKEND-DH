package com.backend.model;

public class MenuInfantil extends Menu{
    private int cantidadJuguetes;

    public MenuInfantil(double precioBase, int cantidadJuguetes) {
        super(precioBase);
        this.cantidadJuguetes = cantidadJuguetes;
    }

    @Override
    protected String armarMenu() {
        String rpta = "El menú infantil contiene papas, bebida y hamburguesa";
        if (cantidadJuguetes > 0){
            rpta = "El menú infantil contiene " + cantidadJuguetes + " juguete(s), papas, bebida y hamburguesa";
        }
        return rpta;
    }
    @Override
    protected double calcularPrecio() {
        double precioTotal = precioBase;
        if (cantidadJuguetes > 0){
            double recargoJuguete = 3.0 * cantidadJuguetes;
            precioTotal = precioBase + recargoJuguete;
        }
        return precioTotal;
    }
}
