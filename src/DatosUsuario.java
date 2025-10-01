import java.util.Scanner;

import utilidades.ProcesadorTexto;
import utilidades.Usuario;

public class DatosUsuario {
    public static void main(String[] args) {

        // Pedir datos del usuario
        Scanner sc = new Scanner(System.in);

        // Almacenar datos del usuario
        System.out.println("Introduce tu nombre");
        String name = sc.nextLine();
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce tu correo electrónico");
        String correo = sc.nextLine();

        // Cerrar Scanner
        sc.close();

        // Condición nombre
        if (name.length() > 2 || name.length() < 20) {

        } else {
            System.out.println("Error en el nombre");

            // Condición edad
            if (edad > 0 || edad < 120) {

            } else {
                System.out.println("Error en la edad");

            }

            // Comrpobación del correo
            boolean correoValido = ProcesadorTexto.esEmailValido(correo);

            if (correoValido) {
                Usuario usuario = new Usuario(name, edad, correo);
                usuario.mostrarInformacion();
                System.out.println("El usuario ha sido creado");
            } else {
                System.out.println("El usuario no puede ser creado porque el correo introducido no es válido");
            }

        }

    }
}
