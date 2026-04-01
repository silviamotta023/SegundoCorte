package Ejercicio3;

public class Main {
    public static void main(String[] args) {

        ListaV lista = new ListaV();

        lista.agregarVuelo("235", "Avianca", 50, 180);
        lista.agregarVuelo("202", "Latam", 8, 200);
        lista.agregarVuelo("389", "JetSmart", 30, 150);
        lista.agregarVuelo("558", "Satena", 5, 220); 

        System.out.println("COLA DE VUELOS");
        lista.mostrarVuelos();

        System.out.println("\nEMERGENCIA MANUAL");
        lista.reportarEmergencia("235");
        lista.mostrarVuelos();
    }

}
