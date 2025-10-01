import java.util.Scanner;

import utilidades.ProcesadorTexto;

public class DatosUsuario {
    public static void main(String[] args) {

        // Pedir datos del usuario
        Scanner sc = new Scanner(System.in);

        // Almacenar datos del usuario
        System.out.println("Introduce tu nombre");
        String name = sc.nextLine();
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();
        System.out.println("Introduce tu correo electrónico");
        String correo = sc.nextLine();

        // Cerrar Scanner
        sc.close();

        // Comrpobación del correo
        boolean correoValido = ProcesadorTexto.esEmailValido(correo);

        if (correoValido) {
            System.out.println("Tu correo existe");
        } else {
            System.out.println("Tu correo no existe");
        }

    }
}
