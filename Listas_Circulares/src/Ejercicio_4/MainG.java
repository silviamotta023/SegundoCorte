package Ejercicio_4;

import java.util.Scanner;

public class MainG {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListaG lista = new ListaG();

        int opcion;

        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Agregar grupo");
            System.out.println("2. Atender siguiente");
            System.out.println("3. Simular 6 atenciones");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre de reserva: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Número de personas: ");
                    int personas = scanner.nextInt();

                    System.out.print("¿Es VIP? (verdadero o falso): ");
                    boolean vip = scanner.nextBoolean();

                    System.out.print("Minutos esperando: ");
                    int minutos = scanner.nextInt();
                    scanner.nextLine();

                    lista.agregar(nombre, personas, vip, minutos);
                    System.out.println("Grupo agregado");
                    break;

                case 2:
                    lista.atenderSiguiente();
                    break;

                case 3:
                    for (int i = 1; i <= 6; i++) {
                        System.out.println("\n--- Turno " + i + " ---");
                        lista.atenderSiguiente();
                    }
                    break;

                case 4:
                    lista.mostrar();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 5);

        scanner.close();
    }

}
