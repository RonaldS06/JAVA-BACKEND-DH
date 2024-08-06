package Flyweight01;

public class Test {

    private static final String colores[] = {"Rojo", "Azul", "Verde", "Negro"};
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            Circulo circulo = FlyweightFactory.obtenerCirculo(colorAleatorio());
            circulo.setRadio(i + 5);
            circulo.setTamanio("Tamaño: " + i * 2);
            circulo.dibujar();
        }
    }
    // Método para obtener un color aleatorio de la lista de colores
    private static String colorAleatorio(){
        return colores[(int)(Math.random() * colores.length)];
    }
}
