package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListaL lista = new ListaL();

        int opcion;

        do {
            System.out.println("\n MENÚ LECTURAS");
            System.out.println("1. Agregar lectura");
            System.out.println("2. Mostrar lecturas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {

                case 1:
                    System.out.print("ID del sensor: ");
                    int id = scanner.nextInt();

                    System.out.print("Temperatura: ");
                    double temp = scanner.nextDouble();

                    System.out.print("Presión: ");
                    double presion = scanner.nextDouble();
                    scanner.nextLine(); 

                    System.out.print("Hora: ");
                    String hora = scanner.nextLine();

                    lista.agregar(id, temp, presion, hora);
                    System.out.println("Lectura agregada correctamente");
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
