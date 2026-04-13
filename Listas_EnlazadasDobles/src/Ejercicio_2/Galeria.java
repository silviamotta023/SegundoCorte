package Ejercicio_2;

public class Galeria {
    Fotografia inicio;
    Fotografia fin;
    Fotografia actual;

    public Galeria() {
        inicio = null;
        fin = null;
        actual = null;
    }

   
    public void agregarFoto(String nombre, double tamano, String resolucion) {
        Fotografia nueva = new Fotografia(nombre, tamano, resolucion);

        if (inicio == null) {
            inicio = fin = nueva;
            actual = nueva;
        } else {
            fin.siguiente = nueva;
            nueva.anterior = fin;
            fin = nueva;
        }
    }

   
    public void mostrarActual() {
        if (actual != null) {
            System.out.println(" Foto actual:");
            System.out.println("Nombre: " + actual.nombreArchivo);
            System.out.println("Tamaño: " + actual.tamanoMB + " MB");
            System.out.println("Resolución: " + actual.resolucion);
            System.out.println("---------------------------");
        } else {
            System.out.println("No hay fotos en la galería.");
        }
    }

   
    public void siguienteFoto() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente;
            mostrarActual();
        } else {
            System.out.println(" No puedes avanzar más.");
        }
    }


    public void fotoAnterior() {
        if (actual != null && actual.anterior != null) {
            actual = actual.anterior;
            mostrarActual();
        } else {
            System.out.println(" No puedes retroceder más.");
        }
    }

    // Recorrer toda la galería
    public void reproducirGaleria() {
        if (inicio == null) {
            System.out.println("Galería vacía.");
            return;
        }

        System.out.println(" Recorriendo hacia adelante:");
        Fotografia temp = inicio;
        while (temp != null) {
            System.out.println(temp.nombreArchivo + " | " + temp.tamanoMB + "MB | " + temp.resolucion);
            temp = temp.siguiente;
        }

        System.out.println(" Recorriendo hacia atrás:");
        temp = fin;
        while (temp != null) {
            System.out.println(temp.nombreArchivo + " | " + temp.tamanoMB + "MB | " + temp.resolucion);
            temp = temp.anterior;
        }
    }

}
