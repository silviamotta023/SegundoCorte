package Ejercicio_3;

public class Navegador {
     Pestana cabeza;
    Pestana cola;

    public Navegador() {
        cabeza = null;
        cola = null;
    }

    public void abrirPestana(String titulo, String url, String hora) {
        Pestana nueva = new Pestana(titulo, url, hora);

        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            cola = nueva;
        }
    }

    public void mostrarPestanas() {
        if (cabeza == null) {
            System.out.println("No hay pestañas abiertas.");
            return;
        }

        Pestana actual = cabeza;
        while (actual != null) {
            System.out.println("Titulo: " + actual.tituloPagina +
                               " | URL: " + actual.url +
                               " | Hora: " + actual.horaApertura);
            actual = actual.siguiente;
        }
    }

    public void cerrarPestanaActual(String url) {

        if (cabeza == null) {
            System.out.println("No hay pestañas para cerrar.");
            return;
        }

        Pestana actual = cabeza;

        while (actual != null) {

            if (actual.url.equals(url)) {

            
                if (cabeza == cola) {
                    cabeza = null;
                    cola = null;
                }
            
                else if (actual == cabeza) {
                    cabeza = cabeza.siguiente;
                    cabeza.anterior = null;
                }

                else if (actual == cola) {
                    cola = cola.anterior;
                    cola.siguiente = null;
                }
            
                else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }

                System.out.println("Pestaña cerrada: " + url);
                return;
            }

            actual = actual.siguiente;
        }

        System.out.println("No se encontró la pestaña.");
    }
}
