package Ejercicio3;

public class ListaV {

     private Vuelo cabeza;

    public void agregar(String numeroVuelo, String aerolinea, int combustibleRestante, int pasajeros) {
        Vuelo nuevo = new Vuelo(numeroVuelo, aerolinea, combustibleRestante, pasajeros);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Vuelo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("La lista de vuelos está vacía.");
            return;
        }

        Vuelo actual = cabeza;

        while (actual != null) {
            System.out.println("------------");
            System.out.println("Número de vuelo: " + actual.numeroVuelo);
            System.out.println("Aerolínea: " + actual.aerolinea);
            System.out.println("Combustible restante: " + actual.combustibleRestante);
            System.out.println("Pasajeros: " + actual.pasajeros);
            actual = actual.siguiente;
        }
    }

}
