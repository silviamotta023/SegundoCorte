package Ejercicio4;

public class ListaL {
    private Lectura cabeza;

    public ListaL() {
        this.cabeza = null;
    }

    public void agregarLectura(int idSensor, double temperatura, double presion, String hora) {

        Lectura nuevo = new Lectura(idSensor, temperatura, presion, hora);

        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    public void mostrarMayorTemperatura() {

        if (cabeza == null) {
            System.out.println("No hay lecturas registradas.");
            return;
        }

        Lectura actual = cabeza;
        Lectura mayor = cabeza;

        while (actual != null) {

            if (actual.temperatura > mayor.temperatura) {
                mayor = actual;
            }

            actual = actual.siguiente;
        }

        System.out.println("LECTURA CON MAYOR TEMPERATURA");
        System.out.println(
            "ID Sensor: " + mayor.idSensor +
            " | Temp: " + mayor.temperatura +
            " | Presión: " + mayor.presion +
            " | Hora: " + mayor.hora
        );
    }

    public void mostrarLecturas() {

        Lectura actual = cabeza;

        while (actual != null) {
            System.out.println(
                actual.idSensor +
                " | Temp: " + actual.temperatura +
                " | Presión: " + actual.presion +
                " | Hora: " + actual.hora
            );

            actual = actual.siguiente;
        }
    }

}
