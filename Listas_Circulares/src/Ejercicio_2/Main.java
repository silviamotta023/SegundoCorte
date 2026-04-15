package Ejercicio_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListaC lista = new ListaC();

        int opcion;

        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Agregar anuncio");
            System.out.println("2. Reproducir anuncios");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {

                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Duración segundos: ");
                    int duracion = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Categoría: ");
                    String categoria = scanner.nextLine();

                    lista.agregar(titulo, duracion, categoria);
                    System.out.println("Anuncio agregado");
                    break;

                case 2:
                    System.out.print("Número de ciclos: ");
                    int ciclos = scanner.nextInt();

                    lista.reproducir(ciclos);
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
