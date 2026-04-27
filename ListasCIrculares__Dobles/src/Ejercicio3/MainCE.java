package Ejercicio3;

import java.util.Scanner;

public class MainCE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Editor editor = new Editor();
        int opcion;

        do {
            System.out.println("\nEditor de capas");
            System.out.println("1. Agregar capa");
            System.out.println("2. Subir capa");
            System.out.println("3. Bajar capa");
            System.out.println("4. Alternar visibilidad");
            System.out.println("5. Eliminar capa activa");
            System.out.println("6. Mostrar capas");
            System.out.println("7. Simulación automática");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Visible (true o False): ");
                    boolean visible = scanner.nextBoolean();
                    scanner.nextLine();

                    System.out.print("Tipo (fondo/objeto/texto): ");
                    String tipo = scanner.nextLine();

                    editor.agregar(nombre, visible, tipo);
                    break;

                case 2:
                    editor.subirCapa();
                    break;

                case 3:
                    editor.bajarCapa();
                    break;

                case 4:
                    editor.toggleVisibilidad();
                    break;

                case 5:
                    editor.eliminarActiva();
                    break;

                case 6:
                    editor.mostrarCapas();
                    break;

                case 7:
                  
                    editor.agregar("Fondo", true, "fondo");
                    editor.agregar("Personaje", true, "objeto");
                    editor.agregar("Texto título", true, "texto");
                    editor.agregar("Sombra", true, "objeto");

                  
                    editor.irACapa(1);

                 
                    editor.subirCapa();

                   
                    editor.toggleVisibilidad();

                    editor.eliminarActiva();

             
                    editor.mostrarCapas();
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }

}
