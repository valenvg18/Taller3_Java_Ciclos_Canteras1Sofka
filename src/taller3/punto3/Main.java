package taller3.punto3;

public class Main {
    public static void main(String[] args) {

        System.out.println("------ punto 3 ------");

        int filas, columnas, i, j;
        filas = 0;
        j = 2;

        do {
            columnas = 0;

            if (filas < 12) {
                do {
                    columnas = columnas + 1;

                    if ((columnas <= (20 / 2) - filas + 1) || (columnas >= (20 / 2) + filas + 1)) {
                        System.out.print(" ");
                    }

                    if ((columnas > (20 / 2) - filas + 1) && (columnas < (20 / 2) + filas + 1)) {
                        System.out.print("*");
                    }

                    if (columnas == 21) {
                        System.out.println(" ");
                    }
                } while (columnas <= 21);
            }


            if (filas == 12) {
                i = 2;


                do {
                    columnas = columnas + 1;

                    if ((columnas <= (20 / 2) - i + 1) || (columnas >= (20 / 2) + i + 1)) {
                        System.out.print(" ");
                    }

                    if ((columnas > (20 / 2) - i + 1) && (columnas < (20 / 2) + i + 1)) {
                        System.out.print("*");

                    }


                    if (columnas == 21) {
                        System.out.println(" ");

                    }


                } while (columnas <= 21);
            }


            if (filas > 12) {

                do {
                    columnas = columnas + 1;

                    if ((columnas <= (20 / 2) - j + 1) || (columnas >= (20 / 2) + j + 1)) {
                        System.out.print(" ");
                    }

                    if ((columnas > (20 / 2) - j + 1) && (columnas < (20 / 2) + j + 1)) {

                        System.out.print("*");
                    }

                    if (columnas == 21) {
                        System.out.println(" ");
                    }

                } while (columnas <= 21);

                j = j + 1;
            }

            filas = filas + 1;

        } while (filas < 16);


    }
}
