package Ejercicio5;

public class Main {
    public static void main(String[] args) {

        ListaR spotify = new ListaR();

        spotify.agregarAlFinal("Soltera", "Blessd", 3, "reggeton");
        spotify.agregarAlFinal("Shape of You", "Ed Sheeran", 4, "Pop");

        spotify.agregarDespuesActual("La plena", "Beele", 5, "Afrobeats");

        spotify.agregarAlFinal("Baby", "Justin Bieber", 18, "Teen Pop y R&B");

        System.out.println("LISTA DE REPRODUCCIÓN");
        spotify.mostrarLista();

        System.out.println("\nTIEMPO TOTAL");
        spotify.mostrarDuracionTotal();
    }

}
