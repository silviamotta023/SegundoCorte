package Ejercicio1;

public class ListaE {
    private Vagon cabeza;

    public void agregar(String contenido, double peso, String origen, String destino) {
        Vagon nuevo = new Vagon(contenido, peso, origen, destino);

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

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Vagon actual = cabeza;
        while (actual != null) {
            System.out.println("-------------------");
            System.out.println("Contenido: " + actual.contenido);
            System.out.println("Peso: " + actual.pesoToneladas + " toneladas");
            System.out.println("Origen: " + actual.origen);
            System.out.println("Destino: " + actual.destino);
            actual = actual.siguiente;
        }
    }
}
