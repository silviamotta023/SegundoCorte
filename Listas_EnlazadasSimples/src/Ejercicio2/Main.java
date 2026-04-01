package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListaP lista = new ListaP();

        int opcion;

        do {
            System.out.println("\nMENÚ PRODUCTOS");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {

                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Cantidad: ");
                    int cantidad = scanner.nextInt();

                    System.out.print("Días para vencer: ");
                    int dias = scanner.nextInt();
                    scanner.nextLine(); 

                    lista.agregar(nombre, cantidad, dias);
                    System.out.println("Producto agregado correctamente");
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
