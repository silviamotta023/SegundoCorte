package Ej_1;

public class comando {

     String texto;
    boolean exitoso;
    String directorio;
    comando siguiente;
    comando anterior;

    public comando(String texto, boolean exitoso, String directorio) {
        this.texto = texto;
        this.exitoso = exitoso;
        this.directorio = directorio;
        this.siguiente = null;
        this.anterior = null;
    }
}
