package biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenidos al Sistema de Biblioteca!");
        System.out.println("Ingrese el titulo del libro: ");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        String autor = sc.nextLine();
        Libro libro = new Libro(titulo,autor);

        System.out.println("\nOpciones: ");
        System.out.println("1. Prestar libro");
        System.out.println("2. Devolver libro");
        System.out.println("3. Mostrar informacion");
        System.out.println("4. Salir");
        System.out.println("Seleccione un opción");
        try {
            int option = sc.nextInt();
            switch (option){
                case 1:
                    libro.prestar();
                    break;
                case 2:
                    libro.devolver();
                    break;
                case 3:
                    libro.mostrarInfo();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }catch (java.util.InputMismatchException ex){
            System.out.println("Error: Ingrese un numero valido");
        }
        sc.close();
    }
}
