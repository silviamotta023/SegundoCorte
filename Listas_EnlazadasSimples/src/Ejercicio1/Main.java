package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListaE lista = new ListaE();

        int opcion;

        do {
            System.out.println("\nMENÚ VAGONES");
            System.out.println("1. Agregar vagón");
            System.out.println("2. Mostrar vagones");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {

                case 1:
                    System.out.print("Contenido: ");
                    String contenido = scanner.nextLine();

                    System.out.print("Peso en toneladas: ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Origen: ");
                    String origen = scanner.nextLine();

                    System.out.print("Destino: ");
                    String destino = scanner.nextLine();

                    lista.agregar(contenido, peso, origen, destino);
                    System.out.println(" Vagón agregado correctamente");
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
