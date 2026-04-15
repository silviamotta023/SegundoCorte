package Ejercicio_2;

public class ListaC {

    Anuncio cabeza;
    Anuncio cola;

    public void agregar(String titulo, int duracion, String categoria) {
        Anuncio nuevo = new Anuncio(titulo, duracion, categoria);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            cola.siguiente = cabeza;
        } else {
            cola.siguiente = nuevo;
            cola = nuevo;
            cola.siguiente = cabeza;
        }
    }

    public void reproducir(int ciclos) {
        if (cabeza == null) {
            System.out.println("No hay anuncios");
            return;
        }

        Anuncio actual = cabeza;
        int tiempoTotal = 0;

        System.out.println("\nREPRODUCCIÓN");

        for (int i = 1; i <= ciclos; i++) {
            System.out.println("\n-- Ciclo " + i + " --");

            do {
                System.out.println("Mostrando: " + actual.titulo +
                                   " | Categoria: " + actual.categoria +
                                   " | Duración: " + actual.duracionSegundos + "s");

                actual.vecesRepetido++;
                tiempoTotal += actual.duracionSegundos;

                actual = actual.siguiente;

            } while (actual != cabeza);
        }


        Anuncio temp = cabeza;
        Anuncio masRepetido = cabeza;

        do {
            if (temp.vecesRepetido > masRepetido.vecesRepetido) {
                masRepetido = temp;
            }
            temp = temp.siguiente;
        } while (temp != cabeza);

        System.out.println("\nRESULTADOS");
        System.out.println("Tiempo total: " + tiempoTotal + " segundos");
        System.out.println("Más repetido: " + masRepetido.titulo +
        " (" + masRepetido.vecesRepetido + " veces)");
    }

}
