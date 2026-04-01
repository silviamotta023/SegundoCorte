package Ejercicio2;

public class ListaP {

    private Producto cabeza;

    public ListaP() {
        this.cabeza = null;
    }

    public void agregarProducto(String nombre, int cantidad, int diasParaVencer) {

        Producto nuevo = new Producto(nombre, cantidad, diasParaVencer);

        if (diasParaVencer < 3) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } 
        else {
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
    }

    public void imprimirProximosAVencer() {

        Producto actual = cabeza;

        System.out.println("Productos con menos de 5 días para vencer:");

        while (actual != null) {

            if (actual.diasParaVencer < 5) {
                System.out.println(
                    actual.nombre +
                    " | Cantidad: " + actual.cantidad +
                    " | Días: " + actual.diasParaVencer
                );
            }

            actual = actual.siguiente;
        }
    }

    public void mostrarTodo() {

        Producto actual = cabeza;

        while (actual != null) {
            System.out.println(
                actual.nombre +
                " | Cantidad: " + actual.cantidad +
                " | Días: " + actual.diasParaVencer
            );
            actual = actual.siguiente;
        }
    }

}
