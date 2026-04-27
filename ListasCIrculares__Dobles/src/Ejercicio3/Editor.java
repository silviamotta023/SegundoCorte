package Ejercicio3;

public class Editor {

    Capa cabeza;
    Capa cola;
    Capa capaActiva;

    public Editor() {
        cabeza = null;
        cola = null;
        capaActiva = null;
    }


    public void agregar(String nombre, boolean visible, String tipo) {
        Capa nueva = new Capa(nombre, visible, tipo);

        if (cabeza == null) {
            cabeza = cola = nueva;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
            capaActiva = cabeza;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }

    public void subirCapa() {
        if (capaActiva != null) {
            capaActiva = capaActiva.siguiente;
        }
    }

    public void bajarCapa() {
        if (capaActiva != null) {
            capaActiva = capaActiva.anterior;
        }
    }


    public void toggleVisibilidad() {
        if (capaActiva != null) {
            capaActiva.visible = !capaActiva.visible;
        }
    }

  
    public void eliminarActiva() {
        if (capaActiva == null) return;

    
        if (cabeza == cola) {
            cabeza = cola = capaActiva = null;
            return;
        }

        Capa eliminar = capaActiva;

        eliminar.anterior.siguiente = eliminar.siguiente;
        eliminar.siguiente.anterior = eliminar.anterior;

        if (eliminar == cabeza) {
            cabeza = eliminar.siguiente;
        }

        if (eliminar == cola) {
            cola = eliminar.anterior;
        }

        capaActiva = eliminar.siguiente; 
    }

   
    public void mostrarCapas() {
        if (cabeza == null) {
            System.out.println("No hay capas.");
            return;
        }

        Capa temp = cabeza;
        do {
            String activa = (temp == capaActiva) ? "Bien" : "[ ]";
            String vis = temp.visible ? "Visible" : "Oculta";

            System.out.println(activa + " " + temp.nombre +" | Tipo: " + temp.tipo +" | " + vis);

            temp = temp.siguiente;
        } while (temp != cabeza);
    }

  
    public void irACapa(int posicion) {
        if (cabeza == null) return;

        Capa temp = cabeza;
        int i = 0;

        do {
            if (i == posicion) {
                capaActiva = temp;
                return;
            }
            temp = temp.siguiente;
            i++;
        } while (temp != cabeza);
    }

}
