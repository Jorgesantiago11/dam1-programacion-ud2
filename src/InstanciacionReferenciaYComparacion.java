
// ================================
// EJERCICIO 1: Crear objetos con new
// ================================
// 1. Crea un objeto Cancion (c1) usando el constructor por defecto.
// 2. Crea otro objeto Cancion (c2) usando el constructor parametrizado,
// por ejemplo: "Clocks", "Coldplay".
// 3. Muestra por consola ambas canciones con System.out.println().
// 4. Observa qué valores se imprimen en cada caso.
// Tu código aquí ↓
import javax.swing.event.CaretListener;

import utilidades.Cancion;
import utilidades.Pelicula;

public class InstanciacionReferenciaYComparacion {
    public static void main(String[] args) {
        System.out.println("[Ejercicio 1]");
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion("Volver", "Miranda");
        System.out.println(c1 == c2);

        // ================================
        // EJERCICIO 2: Comparación con ==
        // ================================
        // 1. Crea dos objetos Cancion (c3 y c4) distintos, con los mismos valores.
        // 2. Imprime el resultado de (c3 == c4).

        // Tu código aquí ↓
        System.out.println("[Ejercicio 2]");
        Cancion c3 = new Cancion("Ruina", "Hard gz");
        Cancion c4 = new Cancion("Ruina", "Hard gz");
        System.out.println(c3 == c4);
        // ================================
        // EJERCICIO 3: Comparación con equals()
        // ================================
        // 1. Usando los mismos objetos c3 y c4 del ejercicio anterior,
        // imprime el resultado de (c3.equals(c4)).

        // Tu código aquí ↓
        System.out.println("[Ejercicio 3]");
        System.out.println(c3.equals(c4));

        // ================================
        // EJERCICIO 4: Comparación en Pelicula
        // ================================
        // 1. Crea dos objetos Pelicula (p1 y p2) con el mismo título y año.
        // 2. Imprime ambas películas por consola.
        // 3. Imprime (p1 == p2).
        // 4. Imprime (p1.equals(p2)).

        // Tu código aquí ↓
        System.out.println("[Ejercicio 4]");
        Pelicula p1 = new Pelicula("Cars", 2007);
        Pelicula p2 = new Pelicula("Cars", 2007);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        // ================================
        // EJERCICIO 5: Referencias
        // ================================
        // 1. Crea un objeto Cancion (c5) con el constructor parametrizado.
        // 2. Declara otra variable Cancion (c6) y haz que apunte al mismo objeto que
        // c5.
        // 3. Imprime (c5 == c6).
        // 4. Cambia el título de la canción desde c6.
        // 5. Imprime c5 de nuevo.

        // Tu código aquí ↓
        System.out.println("[Ejercicio 5]");
        Cancion c5 = new Cancion("Desaparecer", "Mora");
        Cancion c6 = c5;
        System.out.println(c5 == c6);
        c6.setTitutlo("Que habilidad");
        System.out.println(c5);

        // ================================
        // EJERCICIO 6: null
        // ================================
        // 1. Declara una variable Pelicula (p3) y asígnale null.
        // 2. Imprime p3 por consola.
        // 3. Ahora intenta acceder a un método de p3 (ejemplo p3.getTitulo()).
        // Comenta la línea después de probar, porque lanzará un error.

        // Tu código aquí ↓
        System.out.println("[Ejercicio 6]");
        Pelicula p3 = null;
        System.out.println(p3);
        //p3.getTitulo();
        /*
         * Exception in thread "main" java.lang.NullPointerException: Cannot invoke
         * "utilidades.Pelicula.getTitulo()" because "p3" is null
         * at
         * InstanciacionReferenciaYComparacion.main(InstanciacionReferenciaYComparacion.
         * java:86)
         */

    }
}

// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿Qué diferencia hay entre el constructor por defecto y el
// parametrizado?
// Respuesta: El constructor por defecto crea el objeto sin pedirte datos, y el
// parametrizado te pide datos para crear el objeto con lo que tú elijas.

// Ejercicio 2: ¿Por qué da false al comparar con == dos objetos con los mismos
// datos?
// Respuesta: Porque == compara si dos objetos son el mismo en memoria, no si
// tienen los mismos datos.

// Ejercicio 3: ¿Qué diferencia hay entre == y equals()? ¿Por qué ahora sí
// devuelve true?
// Respuesta:== compara si dos objetos son el mismo en memoria, mientras que
// equals() compara si los contenidos de los objetos son iguales, por eso
// equals() puede devolver true aunque == devuelva false.

// Ejercicio 4: ¿Por qué en Pelicula equals no funciona como en Cancion?
// Respuesta:Porque en cancion se está sobreescribiendo y en pelicula no

// Ejercicio 5: ¿Qué ocurre cuando modificas el objeto a través de c6? ¿Qué
// demuestra?
// Respuesta:El titulo de c6 cambia, pero al no pintarlo no lo podemos apreciar

// Ejercicio 6: ¿Qué error aparece al acceder a un método de p3 siendo null?
// ¿Qué significa realmente que una variable valga null?
// Respuesta: -El error que aparece que p3 no existe
// -Significa que esa variable no existe
