package Ejercicio_3;

public class ListaP {

    Proceso cabeza;
    Proceso cola;

    // Agregar proceso
    public void agregar(String nombre, int pid, int tiempo, int prioridad) {
        Proceso nuevo = new Proceso(nombre, pid, tiempo, prioridad);

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

   
    public void ejecutar(int quantum) {
        if (cabeza == null) {
            System.out.println("No hay procesos");
            return;
        }

        Proceso actual = cabeza;
        Proceso anterior = cola;

        String ordenFinal = "";

        System.out.println("\nINICIO ROUND");

        while (cabeza != null) {

            System.out.println("\nEjecutando: " + actual.nombre +
                    " (PID: " + actual.pid + ")" +
                    " | Tiempo restante: " + actual.tiempoRestante);

            actual.tiempoRestante -= quantum;

            if (actual.tiempoRestante <= 0) {
                System.out.println("Proceso terminado");

                ordenFinal += actual.nombre + " -> ";

               
                if (actual == cabeza && actual == cola) {
                    cabeza = null;
                    cola = null;
                    break;
                }

                
                if (actual == cabeza) {
                    cabeza = cabeza.siguiente;
                    cola.siguiente = cabeza;
                    actual = cabeza;
                    anterior = cola;
                } else {
                    anterior.siguiente = actual.siguiente;

                    if (actual == cola) {
                        cola = anterior;
                    }

                    actual = actual.siguiente;
                }

            } else {
                System.out.println("No terminó, sigue en cola. Tiempo restante: " + actual.tiempoRestante);
                anterior = actual;
                actual = actual.siguiente;
            }
        }

        System.out.println("\nORDEN DE FINALIZACIÓN");
        System.out.println(ordenFinal + "FIN");
    }

}
