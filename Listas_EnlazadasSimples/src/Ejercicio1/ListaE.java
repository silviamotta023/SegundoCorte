package Ejercicio1;

public class ListaE {
    private Vagon cabeza;

    public ListaE() {
        this.cabeza = null;
    }

    // ➕ agregar vagón al final
    public void agregarVagon(String contenido, double pesoToneladas, String origen, String destino) {

        Vagon nuevo = new Vagon(contenido, pesoToneladas, origen, destino);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Vagon actual = cabeza;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }
    }

    // ⚖️ calcular peso total
    public double calcularPesoTotal() {

        double total = 0;
        Vagon actual = cabeza;

        while (actual != null) {
            total += actual.pesoToneladas;
            actual = actual.siguiente;
        }

        return total;
    }
}
