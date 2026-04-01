package Ejercicio4;

public class ListaL {
    private Lectura cabeza;

    public void agregar(int idSensor, double temperatura, double presion, String hora) {
        Lectura nuevo = new Lectura(idSensor, temperatura, presion, hora);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Lectura actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("No hay lecturas registradas.");
            return;
        }

        Lectura actual = cabeza;

        while (actual != null) {
            System.out.println("--------------");
            System.out.println("ID Sensor: " + actual.idSensor);
            System.out.println("Temperatura: " + actual.temperatura);
            System.out.println("Presión: " + actual.presion);
            System.out.println("Hora: " + actual.hora);
            actual = actual.siguiente;
        }
    }

}
