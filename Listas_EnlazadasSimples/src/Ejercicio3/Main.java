package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListaV lista = new ListaV();

        int opcion;

        do {
            System.out.println("\n MENÚ VUELOS");
            System.out.println("1. Agregar vuelo");
            System.out.println("2. Mostrar vuelos");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {

                case 1:
                    System.out.print("Número de vuelo: ");
                    String numero = scanner.nextLine();

                    System.out.print("Aerolínea: ");
                    String aerolinea = scanner.nextLine();

                    System.out.print("Combustible restante: ");
                    int combustible = scanner.nextInt();

                    System.out.print("Pasajeros: ");
                    int pasajeros = scanner.nextInt();
                    scanner.nextLine();

                    lista.agregar(numero, aerolinea, combustible, pasajeros);
                    System.out.println("Vuelo agregado correctamente");
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
