package Ejercicio5;

public class ListaR {
    private Cancion cabeza;
    private Cancion actual; 
    public ListaR() {
        this.cabeza = null;
        this.actual = null;
    }

    public void agregarAlFinal(String titulo, String artista, int duracion, String genero) {

        Cancion nuevo = new Cancion(titulo, artista, duracion, genero);

        if (cabeza == null) {
            cabeza = nuevo;
            actual = nuevo;
        } else {
            Cancion temp = cabeza;

            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }

            temp.siguiente = nuevo;
        }
    }

    public void agregarDespuesActual(String titulo, String artista, int duracion, String genero) {

        Cancion nuevo = new Cancion(titulo, artista, duracion, genero);

        if (cabeza == null) {
            cabeza = nuevo;
            actual = nuevo;
            return;
        }

        if (actual == null) {
            agregarAlFinal(titulo, artista, duracion, genero);
            return;
        }

        nuevo.siguiente = actual.siguiente;
        actual.siguiente = nuevo;
        actual = nuevo;
    }

    public void mostrarDuracionTotal() {

        int totalSegundos = 0;
        Cancion temp = cabeza;

        while (temp != null) {
            totalSegundos += temp.duracionSegundos;
            temp = temp.siguiente;
        }

        int minutos = totalSegundos / 60;
        int segundos = totalSegundos % 60;

        System.out.println("Duración total: " + minutos + ":" + (segundos < 10 ? "0" + segundos : segundos));
    }

    public void mostrarLista() {

        Cancion temp = cabeza;

        while (temp != null) {
            System.out.println(
                temp.titulo +
                " | " + temp.artista +
                " | " + temp.duracionSegundos + "s" +
                " | " + temp.genero
            );

            temp = temp.siguiente;
        }
    }
}


