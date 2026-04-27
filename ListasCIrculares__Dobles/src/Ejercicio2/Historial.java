package Ejercicio2;

public class Historial {

    Comando cabeza;
    Comando cola;
    Comando cursor;

    public Historial() {
        cabeza = null;
        cola = null;
        cursor = null;
    }

  
    public void agregar(String texto, boolean exitoso, String directorio) {
        Comando nuevo = new Comando(texto, exitoso, directorio);

        if (cabeza == null) {
            cabeza = cola = nuevo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
            cursor = cabeza;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cola = nuevo;
        }
    }

   
    public void arriba() {
        if (cursor != null) {
            cursor = cursor.anterior;
        }
    }

  
    public void abajo() {
        if (cursor != null) {
            cursor = cursor.siguiente;
        }
    }


    public void mostrarCursor() {
        if (cursor == null) {
            System.out.println("Historial vacío.");
        } else {
            System.out.println("COMANDO ACTUAL:");
            System.out.println("Texto: " + cursor.texto);
            System.out.println("Exitoso: " + cursor.exitoso);
            System.out.println("Directorio: " + cursor.directorio);
        }
    }

  
    public void eliminarActual() {
        if (cursor == null) return;


        if (cabeza == cola) {
            cabeza = cola = cursor = null;
            return;
        }

        Comando eliminar = cursor;

        eliminar.anterior.siguiente = eliminar.siguiente;
        eliminar.siguiente.anterior = eliminar.anterior;

        if (eliminar == cabeza) {
            cabeza = eliminar.siguiente;
        }

        if (eliminar == cola) {
            cola = eliminar.anterior;
        }

        cursor = eliminar.siguiente; 
    }

  
    public void mostrarHistorial() {
        if (cabeza == null) {
            System.out.println("Historial vacío.");
            return;
        }

        Comando temp = cabeza;
        do {
            if (temp == cursor) {
                System.out.println("Cursor");
            }
            System.out.println("Texto: " + temp.texto +
                    " | Exitoso: " + temp.exitoso +
                    " | Dir: " + temp.directorio);
            temp = temp.siguiente;
        } while (temp != cabeza);
    }

}
