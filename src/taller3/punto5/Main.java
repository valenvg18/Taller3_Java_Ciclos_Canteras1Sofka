package taller3.punto5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("------ punto 5 ------");

        int opcionMenu;
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("Antes de iniciar con el menú, por favor digite su nombre: ");
        nombre = sc.next();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        do {



            System.out.println("MENÚ DEL USUARIO");
            System.out.println("Indique con el numero correspondiente, la opción que desea: ");
            System.out.println("1. Captura nombre");
            System.out.println("2. Saludar persona");
            System.out.println("3. Salir del sistema");
            opcionMenu = sc.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println(nombre + " su nombre ha sido capturado por el sistema");
                    break;

                case 2:
                    System.out.println("¡Hola " + nombre + " es un gusto enorme tenerte por acá!");
                    break;
                case 3:
                    System.out.println(nombre + ", nos despedimos. ¡Esperamos tenerte de nuevo!");
                    break;

                default:
                    System.out.println("Opcion incorrecta, vuela a ingresar una opcion");
                    opcionMenu=0;
                    break;

            }


        } while (opcionMenu != 3);


    }
}
