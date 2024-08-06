package Flyweight01;

public class Circulo {
    private String color; // Estado intrínseco (compartido)
    private double radio; // Estado extrínseco (no compartido)
    private String tamanio; // Estado extrínseco (no compartido)
    public Circulo(String color) {
        this.color = color; //Solo el color es la parte compartida
    }
    //Getters y Setter que se cambian en tiempo de ejecución
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public String getTamanio() {
        return tamanio;
    }
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    public void dibujar(){
        System.out.println("Dibujamos objeto color: " + color);
    }
}
