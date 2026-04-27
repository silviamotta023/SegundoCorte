package Ejercicio2;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Historial h = new Historial();
        int opcion;

        do {
            System.out.println("\nHistorial de comandos");
            System.out.println("1. Agregar comando");
            System.out.println("2. Arriba");
            System.out.println("3. Abajo");
            System.out.println("4. Mostrar cursor");
            System.out.println("5. Eliminar actual");
            System.out.println("6. Mostrar historial");
            System.out.println("7. Simulación automática");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Texto: ");
                    String texto = scanner.nextLine();

                    System.out.print("Exitoso (true o false): ");
                    boolean exitoso = scanner.nextBoolean();
                    scanner.nextLine();

                    System.out.print("Directorio: ");
                    String dir = scanner.nextLine();

                    h.agregar(texto, exitoso, dir);
                    break;

                case 2:
                    h.arriba();
                    break;

                case 3:
                    h.abajo();
                    break;

                case 4:
                    h.mostrarCursor();
                    break;

                case 5:
                    h.eliminarActual();
                    break;

                case 6:
                    h.mostrarHistorial();
                    break;

                case 7:
                   
                    h.agregar("ls", true, "/home");
                    h.agregar("cd documentos", true, "/home");
                    h.agregar("mkdir pruebas", true, "/home/documentos");
                    h.agregar("rm archivo.txt", false, "/home/documentos");
                    h.agregar("nano archivo.txt", true, "/home/documentos");

                   
                    h.arriba();
                    h.arriba();
                    h.arriba();

                
                    h.eliminarActual();

                    h.abajo();


                    h.mostrarHistorial();
                    break;

            }

        } while (opcion != 0);

        scanner.close();
    }

}
