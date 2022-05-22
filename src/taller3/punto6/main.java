package taller3.punto6;

import java.util.Scanner;

public class main {



    public static void contactoEliminado(String nombre, int telefono, String organizacion) {
        imprimirInfoContacto(nombre, telefono, organizacion);
        System.out.println("-------------------------------------------------------");
        System.out.println("HA SIDO ELIMINADO");
    }

    public static void devolverInfoDeContacto(String nombre, int telefono, String organizacion) {
        System.out.println("El contacto que esta buscando es:");
        imprimirInfoContacto(nombre, telefono, organizacion);
    }

    public static void imprimirInfoContacto(String nombre, int telefono, String organizacion) {

        System.out.println("-------------------------------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
        System.out.println("Organizaci�n: " + organizacion);
    }

    public static void main(String[] args) {
        System.out.println("------ punto 6 ------");

        String nombre1, nombre2, nombre3;
        int telefono1, telefono2, telefono3, busquedaTelefono, numeroDeTelefono;
        String organizacion1, organizacion2, organizacion3;
        String busquedaNombre, nombrecontacto;
        int opcionDeBusqueda, solicitud;
        Scanner sc = new Scanner(System.in);
        numeroDeTelefono = 0;
        nombrecontacto = "";
        nombre1 = "";
        nombre2 = "";
        nombre3 = "";
        telefono1 = 0;
        telefono2 = 0;
        telefono3 = 0;
        organizacion1 = "";
        organizacion2 = "";
        organizacion3 = "";

        System.out.println("BIENVENIDO");

        for (int i = 1; i <= 3; i++) {
            System.out.println("=======================================================");
            System.out.println("PARA AGREGAR CONTACTO #" + i);
            System.out.println("-------------------------------------------------------");
            System.out.println("Escribe el nombre completo: ");


            if (nombre1.equals("")) {
                nombre1 = sc.next();
            } else if (nombre2.equals("")) {
                nombre2 = sc.next();

            } else if (nombre3.equals("")) {
                nombre3 = sc.next();
            }


            System.out.println("�Cu�l es su n�mero telef�nico?");

            numeroDeTelefono = sc.nextInt();

            while ((numeroDeTelefono == telefono1) || (numeroDeTelefono == telefono2)) {
                System.out.println("Este numero de telefono ya existe. Por favor ingrese otro:");
                numeroDeTelefono = sc.nextInt();
            }

            if (telefono1 == 0) {
                telefono1 = numeroDeTelefono;
            } else if (telefono2 == 0) {
                telefono2 = numeroDeTelefono;

            } else if (telefono3 == 0) {
                telefono3 = numeroDeTelefono;
            }

            System.out.println("�En que organizaci�n podr�a ubicar a este contacto?");

            if (organizacion1.equals("")) {
                organizacion1 = sc.next();
            } else if (organizacion2.equals("")) {
                organizacion2 = sc.next();

            } else if (organizacion3.equals("")) {
                organizacion3 = sc.next();
            }

        }

        do {
            System.out.println("=======================================================");
            System.out.println("�Que otra solicitud desea procesar?");
            System.out.println("1. Buscar contactos almacenados");
            System.out.println("2. Eliminar alg�n contacto ");
            System.out.println("3. Salir del sistema");
            solicitud = sc.nextInt();

            System.out.flush();

            switch (solicitud) {
                case 1:
                    System.out.println("�C�mo desea buscar su contacto?");
                    System.out.println("1. Nombre");
                    System.out.println("2. Telefono");
                    opcionDeBusqueda = sc.nextInt();

                    System.out.flush();

                    if (opcionDeBusqueda == 1) {
                        System.out.println("Ingrese el nombre del contacto que desea buscar");
                        busquedaNombre = sc.next();


                        if (busquedaNombre.equals(nombre1)) {
                            devolverInfoDeContacto(nombre1, telefono1, organizacion1);
                        } else if (busquedaNombre.equals(nombre2)) {
                            devolverInfoDeContacto(nombre2, telefono2, organizacion2);
                        } else if (busquedaNombre.equals(nombre3)) {
                            devolverInfoDeContacto(nombre3, telefono3, organizacion3);
                        } else {
                            System.out.println("Ese nombre NO EXISTE.");
                        }

                    } else {
                        System.out.println("Ingrese el numero del contacto que desea buscar");
                        busquedaTelefono = sc.nextInt();

                        if (busquedaTelefono == telefono1) {
                            devolverInfoDeContacto(nombre1, telefono1, organizacion1);
                        } else if (busquedaTelefono == telefono2) {
                            devolverInfoDeContacto(nombre2, telefono2, organizacion2);
                        } else if (busquedaTelefono == telefono3) {
                            devolverInfoDeContacto(nombre3, telefono3, organizacion3);
                        } else {
                            System.out.println("Ese n�mero NO EXISTE");
                        }
                    }
                    break;
                case 2:
                    System.out.println("�Cu�l es el nombre del contacto que deseas eliminar?");
                    nombrecontacto = sc.next();
                    System.out.flush();

                    while (!nombrecontacto.equals(nombre1) && !nombrecontacto.equals(nombre2) && !nombrecontacto.equals(nombre3)) {
                        System.out.println("Este nombre de contacto no existe en la lista. Por favor ingrese uno que si se encuentre.");
                        nombrecontacto = sc.next();
                    }

                    if (nombrecontacto.equals(nombre1)) {

                        contactoEliminado(nombre1, telefono1, organizacion1);

                        nombre1 = "";
                        telefono1 = 0;
                        organizacion1 = "";
                    } else if (nombrecontacto.equals(nombre2)) {

                        contactoEliminado(nombre2, telefono2, organizacion2);

                        nombre2 = "";
                        telefono2 = 0;
                        organizacion2 = "";
                    } else if (nombrecontacto.equals(nombre3)) {

                        contactoEliminado(nombre3, telefono3, organizacion3);

                        nombre3 = "";
                        telefono3 = 0;
                        organizacion3 = "";
                    }

                    break;
                case 3:
                    System.out.println("¡VUELVA PRONTO!");
                    break;
                default:
                    solicitud = 3;
                    break;
            }

        } while (solicitud != 3);


    }

}

