package Ejercicio2;

public class ListaP {

    private Producto cabeza;

    public void agregar(String nombre, int cantidad, int diasParaVencer) {
        Producto nuevo = new Producto(nombre, cantidad, diasParaVencer);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Producto actual = cabeza;
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

        Producto actual = cabeza;

        while (actual != null) {
            System.out.println("---------------");
            System.out.println("Nombre: " + actual.nombre);
            System.out.println("Cantidad: " + actual.cantidad);
            System.out.println("Días para vencer: " + actual.diasParaVencer);
            actual = actual.siguiente;
        }
    }

}
