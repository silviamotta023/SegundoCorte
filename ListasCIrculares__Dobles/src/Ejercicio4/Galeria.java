package Ejercicio4;

public class Galeria {

    Foto cabeza;
    Foto cola;
    Foto actual;

    public Galeria() {
        cabeza = null;
        cola = null;
        actual = null;
    }

    
    public void agregar(String titulo, String fecha) {
        Foto nueva = new Foto(titulo, fecha);

        if (cabeza == null) {
            cabeza = cola = nueva;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
            actual = cabeza;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }

  
    public void siguiente() {
        if (actual != null) {
            actual = actual.siguiente;
        }
    }


    public void anterior() {
        if (actual != null) {
            actual = actual.anterior;
        }
    }

   
    public void toggleFavorita() {
        if (actual != null) {
            actual.esFavorita = !actual.esFavorita;
        }
    }

    public void eliminarActual() {
        if (actual == null) return;

        if (cabeza == cola) {
            cabeza = cola = actual = null;
            return;
        }

        Foto eliminar = actual;

        eliminar.anterior.siguiente = eliminar.siguiente;
        eliminar.siguiente.anterior = eliminar.anterior;

        if (eliminar == cabeza) {
            cabeza = eliminar.siguiente;
        }

        if (eliminar == cola) {
            cola = eliminar.anterior;
        }

        actual = eliminar.siguiente; 
    }

    
    public void mostrarGaleria() {
        if (cabeza == null) {
            System.out.println("Galería vacía.");
            return;
        }

        Foto temp = cabeza;

        do {
            String actualMark = (temp == actual) ? "[Actual]" : "[ ]";
            String favMark = temp.esFavorita ? "[Favorita]" : "[ ]";

            System.out.println(actualMark + favMark + " " +
                    temp.titulo + " | " + temp.fecha);

            temp = temp.siguiente;
        } while (temp != cabeza);
    }

}
