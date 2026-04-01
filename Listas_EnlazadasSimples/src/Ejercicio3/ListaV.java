package Ejercicio3;

public class ListaV {

    private Vuelo cabeza;

    public ListaV() {
        this.cabeza = null;
    }

    public void agregarVuelo(String numero, String aerolinea, int combustible, int pasajeros) {

        Vuelo nuevo = new Vuelo(numero, aerolinea, combustible, pasajeros);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Vuelo actual = cabeza;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }

        if (nuevo.combustibleRestante < 10) {
            moverAlInicio(nuevo.numeroVuelo);
        }
    }

    public void reportarEmergencia(String numeroVuelo) {

        if (cabeza == null || cabeza.numeroVuelo.equals(numeroVuelo)) {
            return;
        }

        Vuelo actual = cabeza;
        Vuelo anterior = null;

        while (actual != null && !actual.numeroVuelo.equals(numeroVuelo)) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual == null) return; 

        anterior.siguiente = actual.siguiente;

        actual.siguiente = cabeza;
        cabeza = actual;
    }

    private void moverAlInicio(String numeroVuelo) {
        reportarEmergencia(numeroVuelo);
    }

    public void mostrarVuelos() {

        Vuelo actual = cabeza;

        while (actual != null) {
            System.out.println(
                actual.numeroVuelo +
                " | " + actual.aerolinea +
                " | Combustible: " + actual.combustibleRestante +
                " | Pasajeros: " + actual.pasajeros
            );

            actual = actual.siguiente;
        }
    }

}
