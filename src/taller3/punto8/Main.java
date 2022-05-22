package taller3.punto8;

import java.util.Scanner;

public class Main {
    public static void buscarUsuario(String arreglo[][], String nombre) {

        String mensaje = "";
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i][0].equals(nombre)) {
                mensaje = ("El estudiante " + arreglo[i][0] + " tiene " + arreglo[i][1]);
            }
        }
        if (mensaje.equals("")) {
            System.out.println("Ese nombre no ha sido registrado en la escuela automovilística");
        } else {
            System.out.println(mensaje);
        }
    }

    public static void main(String[] args) {
        String arregloUsuarios[][] = new String[8][2];
        int opcionMenu;
        int usuarios = 1;
        int masUsuarios = 1;
        String nombreUSuario, aprobo, buscarNombre;
        Scanner sc = new Scanner(System.in);

        //inicializacion de arreglo
        for (int i = 0; i < arregloUsuarios.length; i++) {
            arregloUsuarios[i][0] = "";
            arregloUsuarios[i][1] = "";

        }


        do {

            System.out.println("==============================================");
            System.out.println("ESCUELA AUTOMOVILÍSTICA - EL MAESTRO");
            System.out.println("----------------------------------------------");

            System.out.println("¿Cuál es la solicitud que desea realizar?");
            System.out.println("1. Registrar Usuarios");
            System.out.println("2. Consultar Usuarios");
            System.out.println("3. Salir");
            opcionMenu = sc.nextInt();

            switch (opcionMenu) {
                case 1:
                    if (usuarios == 8) {
                        System.out.println("==============================================");
                        System.out.println("Ya ingreso el máximo de usuarios");
                        System.out.println("--------------------------------------------");
                    } else {


                        while (usuarios <= 8 && masUsuarios == 1) {
                            System.out.println("usuario numero: " + usuarios);

                            System.out.println("Ingrese el nombre del usuario");
                            nombreUSuario = sc.next();

                            for (int i = 0; i < arregloUsuarios.length; i++) {
                                while (arregloUsuarios[i][0].equals(nombreUSuario)) {
                                    System.out.println("Ese usuario ya se encuentra registrado en el usuario " + (i + 1) + " por favor ingrese otro nombre: ");
                                    nombreUSuario = sc.next();
                                }

                            }

                            arregloUsuarios[usuarios - 1][0] = nombreUSuario;


                            System.out.println("¿Este usuario aprobó el curso?");
                            System.out.println("Responda SI o NO, según el caso");

                            aprobo = sc.next();

                            if (aprobo.equals("SI") || aprobo.equals("si")) {
                                arregloUsuarios[usuarios - 1][1] = "Estado de la licencia APROBADO";
                            } else {
                                arregloUsuarios[usuarios - 1][1] = "Estado de la licencia DENEGADO";
                            }

                            if (usuarios <= 7) {
                                System.out.println("============================================");
                                System.out.println("¿Desea registrar mas usuarios?");
                                System.out.println("1. Si");
                                System.out.println("2. Deseo salir al menú principal");
                                System.out.println("(Escriba 1 o 2 según su caso)");
                                masUsuarios = sc.nextInt();
                                usuarios += 1;

                            } else {
                                masUsuarios = 2;
                            }

                        }
                    }
                    masUsuarios = 1;

                    break;
                case 2:
                    System.out.println("Escriba el nombre del usuario qeu desea consultar");

                    buscarNombre = sc.next();

                    buscarUsuario(arregloUsuarios, buscarNombre);
                    break;

                default:
                    opcionMenu = 3;
                    System.out.println("Ha salido del sistema. ¡NOS VEMOS PRONTO!");

                    break;
            }


        } while (opcionMenu != 3);


    }
}
