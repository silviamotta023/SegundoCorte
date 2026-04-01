package Ejercicio5;

public class ListaR {
    private Cancion cabeza;

    public void agregar(String titulo, String artista, int duracionSegundos, String genero) {
        Cancion nueva = new Cancion(titulo, artista, duracionSegundos, genero);

        if (cabeza == null) {
            cabeza = nueva;
        } else {
            Cancion actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nueva;
        }
    }

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("La lista de canciones está vacía.");
            return;
        }

        Cancion actual = cabeza;

        while (actual != null) {
            System.out.println("--------------");
            System.out.println("Título: " + actual.titulo);
            System.out.println("Artista: " + actual.artista);
            System.out.println("Duración: " + actual.duracionSegundos + " segundos");
            System.out.println("Género: " + actual.genero);
            actual = actual.siguiente;
        }
    }
}


