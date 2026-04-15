package Ejercicio_4;

public class Grupo {

    String nombreReserva;
    int numeroPersonas;
    boolean esvip;
    int minutosEsperando;
    Grupo siguiente;

    public Grupo(String nombreReserva, int numeroPersonas, boolean esVip, int minutosEsperando) {
        this.nombreReserva = nombreReserva;
        this.numeroPersonas = numeroPersonas;
        this.esvip = esvip;
        this.minutosEsperando = minutosEsperando;
        this.siguiente = null;
    }

}
