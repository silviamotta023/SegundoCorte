package Ejercicio_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Navegador navegador = new Navegador();

        int opcion;

        do {
            System.out.println("\n--- MENU NAVEGADOR ---");
            System.out.println("1. Abrir pestaña");
            System.out.println("2. Cerrar pestaña");
            System.out.println("3. Mostrar pestañas");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();

                    System.out.print("URL: ");
                    String url = sc.nextLine();

                    System.out.print("Hora: ");
                    String hora = sc.nextLine();

                    navegador.abrirPestana(titulo, url, hora);
                    break;

                case 2:
                    System.out.print("URL a cerrar: ");
                    String urlCerrar = sc.nextLine();

                    navegador.cerrarPestanaActual(urlCerrar);
                    break;

                case 3:
                    navegador.mostrarPestanas();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 0);

        sc.close();
    }

}
