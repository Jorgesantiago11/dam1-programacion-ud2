import utilidades.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        // ================================
        // EJERCICIO 1: Uso de atributos
        // ================================
        // 1. Intenta acceder directamente al atributo saldo:
        // System.out.println(cuenta.saldo);
        // 2. Observa el error de compilación.

        // Tu código aquí ↓
        // System.out.println(cuenta.saldo);

        // ================================
        // EJERCICIO 2: Métodos públicos
        // ================================
        // 1. Ingresa 100€ usando depositar().
        // 2. Retira 30€ usando retirar().
        // 3. Imprime el saldo con getSaldo().

        // Tu código aquí ↓
        cuenta.depositar(100);
        cuenta.retirar(30);
        System.out.println("salgo actual:" + cuenta.getSaldo() + "€");

        // ================================
        // EJERCICIO 3: Métodos privados
        // ================================
        // 1. Intenta llamar al método registrarOperacion("Hackeo", 9999).
        // 2. Observa el error de compilación.

        // Tu código aquí ↓
        // cuenta.registrarOperacion("Hackeo", 9999);

        // ================================
        // EJERCICIO 4: Libre
        // ================================
        // Puedes hacer pruebas adicionales con los métodos disponibles
        // para asegurarte de que comprendes la diferencia entre public y private.
        cuenta.depositar(359);
        cuenta.retirar(57);
        System.out.println("Saldo despues de la retirada" + cuenta.getSaldo() + "€");

    }
}

// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿por qué no puedo acceder al saldo directamente?
// Respuesta: Porque es privada dentro de la clase CuentaBancaria y como estamos
// en clase Main, no podemos acceder

// Ejercicio 2: ¿por qué sí puedo usar los métodos depositar(), retirar() y
// getSaldo()?
// Respuesta: Porque esos métodos están publicos, lo que nos permite acceder

// Ejercicio 3: ¿qué significa el error al intentar llamar a
// registrarOperacion()?
// Respuesta: Significa que está en privada

// Ejercicio 4:
// - ¿Qué ventajas tiene que saldo sea private?
// - ¿Qué pasaría si saldo fuera public?
// - ¿Por qué registrarOperacion es private en lugar de public?
// Respuesta: - Que es más seguro ya que no pueden acceder tan fácil a él
// - Que se podría acceder más facilmente a él, ya que podríamos acceder incluso
// desde otro class
// - Porque debe estar oculto por tema de privacidad