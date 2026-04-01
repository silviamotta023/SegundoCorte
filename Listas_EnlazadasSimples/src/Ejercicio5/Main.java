package Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListaR lista = new ListaR();

        int opcion;

        do {
            System.out.println("\nMENÚ CANCIONES");
            System.out.println("1. Agregar canción");
            System.out.println("2. Mostrar canciones");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Artista: ");
                    String artista = scanner.nextLine();

                    System.out.print("Duración en segundos: ");
                    int duracion = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Género: ");
                    String genero = scanner.nextLine();

                    lista.agregar(titulo, artista, duracion, genero);
                    System.out.println("Canción agregada correctamente");
                    break;

                case 2:
                    lista.mostrar();
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 3);

        scanner.close();
    }
}
