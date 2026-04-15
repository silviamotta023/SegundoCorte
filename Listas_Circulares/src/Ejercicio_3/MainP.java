package Ejercicio_3;

import java.util.Scanner;

public class MainP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListaP lista = new ListaP();

        int opcion;

        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Agregar proceso");
            System.out.println("2. Ejecutar Round Robin");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre del proceso: ");
                    String nombre = scanner.nextLine();

                    System.out.print("PID: ");
                    int pid = scanner.nextInt();

                    System.out.print("Tiempo restante: ");
                    int tiempo = scanner.nextInt();

                    System.out.print("Prioridad (1-3): ");
                    int prioridad = scanner.nextInt();
                    scanner.nextLine();

                    lista.agregar(nombre, pid, tiempo, prioridad);
                    System.out.println("Proceso agregado");
                    break;

                case 2:
                    System.out.print("Quantum: ");
                    int quantum = scanner.nextInt();

                    lista.ejecutar(quantum);
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
