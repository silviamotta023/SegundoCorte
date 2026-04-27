package Ejercicio4;

import java.util.Scanner;

public class Mainfg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Galeria g = new Galeria();
        int opcion;

        do {
            System.out.println("\nGaleria de fotos");
            System.out.println("1. Agregar foto");
            System.out.println("2. Siguiente");
            System.out.println("3. Anterior");
            System.out.println("4. Marcar o Desmarcar favorita");
            System.out.println("5. Eliminar actual");
            System.out.println("6. Mostrar galería");
            System.out.println("7. Simulación automática");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Fecha: ");
                    String fecha = scanner.nextLine();

                    g.agregar(titulo, fecha);
                    break;

                case 2:
                    g.siguiente();
                    break;

                case 3:
                    g.anterior();
                    break;

                case 4:
                    g.toggleFavorita();
                    break;

                case 5:
                    g.eliminarActual();
                    break;

                case 6:
                    g.mostrarGaleria();
                    break;

                case 7:
            
                    g.agregar("Foto 1", "2026-01-01");
                    g.agregar("Foto 2", "2026-04-02");
                    g.agregar("Foto 3", "2026-02-03");
                    g.agregar("Foto 4", "2026-08-04");
                    g.agregar("Foto 5", "2026-09-05");

                    g.siguiente();
                    g.siguiente();

 
                    g.toggleFavorita();

                    g.anterior();

                    g.eliminarActual();

                   
                    g.mostrarGaleria();
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }

}
