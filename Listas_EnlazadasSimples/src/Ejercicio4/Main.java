package Ejercicio4;

public class Main {
    public static void main(String[] args) {

        ListaL planta = new ListaL();

        planta.agregarLectura(1, 81.2, 2.1, "08:00");
        planta.agregarLectura(2, 70.6, 2.5, "09:00");
        planta.agregarLectura(3, 88.0, 2.2, "10:00");
        planta.agregarLectura(4, 99.7, 2.8, "11:00"); 

        System.out.println("HISTORIAL");
        planta.mostrarLecturas();

        planta.mostrarMayorTemperatura();
    }

}
