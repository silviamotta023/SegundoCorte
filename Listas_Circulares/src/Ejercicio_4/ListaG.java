package Ejercicio_4;

public class ListaG {

    Grupo cabeza;
    Grupo cola;

    
    public void agregar(String nombre, int personas, boolean vip, int minutos) {
        Grupo nuevo = new Grupo(nombre, personas, vip, minutos);

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

   
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }

        Grupo temp = cabeza;
        System.out.println("\n Estado de la lista ");

        do {
            System.out.println("Reserva: " + temp.nombreReserva +
                    " | Personas: " + temp.numeroPersonas +
                    " | VIP: " + temp.esvip +
                    " | Espera: " + temp.minutosEsperando + " min");
            temp = temp.siguiente;
        } while (temp != cabeza);
    }

  
    public void atenderSiguiente() {
        if (cabeza == null) {
            System.out.println("No hay grupos en espera");
            return;
        }

        Grupo atendido = cabeza;

        System.out.println("\nAtendiendo grupo:");
        System.out.println("Reserva: " + atendido.nombreReserva +
                " | Personas: " + atendido.numeroPersonas +
                " | VIP: " + atendido.esvip +
                " | Espera: " + atendido.minutosEsperando + " min");

        if (cabeza == cola) {
            if (atendido.esvip) {
                System.out.println("Es VIP, vuelve al final pero es el único");
            } else {
                cabeza = null;
                cola = null;
                System.out.println("Grupo atendido y eliminado");
            }
            return;
        }

     
        if (atendido.esvip) {
            cabeza = cabeza.siguiente;
            cola = atendido;
            cola.siguiente = cabeza;
            System.out.println("Grupo VIP reinsertado al final");
        } 
       
        else {
            cabeza = cabeza.siguiente;
            cola.siguiente = cabeza;
            System.out.println("Grupo eliminado de la lista");
        }

        mostrar();
    }

}
