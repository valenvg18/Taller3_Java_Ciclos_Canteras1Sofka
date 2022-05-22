package taller3.punto4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------ punto 4 ------");
        int digito;

        System.out.println("TABLAS DE MULTIPLICAR");
        System.out.println("Bienvenido al generador de tablas de multiplicar");
        System.out.println("Por favor indique cual tabla de multiplicar desea ver:");


        Scanner sc = new Scanner(System.in);
        digito = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " x " + digito + " = " + i * digito);

        }

    }


}
