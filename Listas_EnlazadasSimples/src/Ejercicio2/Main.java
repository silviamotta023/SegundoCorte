package Ejercicio2;

public class Main {

    public static void main(String[] args) {

        ListaP lista = new ListaP();

        lista.agregarProducto("Leche", 10, 2);
        lista.agregarProducto("Yogur", 5, 6);
        lista.agregarProducto("Queso", 8, 4);
        lista.agregarProducto("Mantequilla", 3, 1);

        System.out.println(" TODA LA LISTA ");
        lista.mostrarTodo();

        System.out.println("\n PRÓXIMOS A VENCER ");
        lista.imprimirProximosAVencer();
    }

}
