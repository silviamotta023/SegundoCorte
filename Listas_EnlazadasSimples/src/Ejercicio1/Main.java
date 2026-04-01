package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        ListaE tren = new ListaE();

        tren.agregarVagon("Maquinaria", 12.5, "Colombia", "Panamá");
        tren.agregarVagon("Granos", 8.3, "Colombia", "México");
        tren.agregarVagon("Vehículos", 15.0, "Colombia", "Chile");

        System.out.println("Peso total: " + tren.calcularPesoTotal());
    }

}
