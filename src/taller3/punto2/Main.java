package taller3.punto2;

public class Main {

    public static void main(String[] args) {

        System.out.println("------ punto 2 ------");
        int i, j;
        i = 1;

        while (i <= 10) {
            j = 1;
            while (j <= 10) {
                if (j > (10 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                if (j == 10) {
                    System.out.println(" ");
                }
                j = j + 1;
            }
            i = i + 1;

        }
    }
}
