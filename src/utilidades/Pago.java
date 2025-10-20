package utilidades;


public class Pago {
    private double saldo;

    // Inicializa la cartera con dinero (no se permiten negativos)
    public Pago(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.saldo = redondear2(saldoInicial);
    }

    public double getSaldo() {
        return saldo;
    }

    // --- Métodos pagar (descuentan del saldo y muestran el saldo restante) ---

    // Pagar en efectivo
    public void pagar(double cantidad) {
        cobrar(cantidad, "en efectivo");
    }

    // Pagar con tarjeta (necesita pin)
    public void pagar(double cantidad, String pin) {
        if (pin == null || pin.isBlank()) {
            throw new IllegalArgumentException("PIN inválido.");
        }
        String pinMascara = "*".repeat(Math.min(pin.length(), 4));
        cobrar(cantidad, "con tarjeta (PIN " + pinMascara + ")");
    }

    // Pagar con Bizum (necesita teléfono)
    public void pagar(double cantidad, int telefono) {
        if (telefono <= 0) {
            throw new IllegalArgumentException("Teléfono inválido.");
        }
        cobrar(cantidad, "con Bizum al número " + telefono);
    }

    // --- (Opcional) Ingresar saldo positivo ---
    public void ingresar(double cantidad) {
        if (cantidad <= 0 || Double.isNaN(cantidad) || Double.isInfinite(cantidad)) {
            throw new IllegalArgumentException("La cantidad a ingresar debe ser positiva.");
        }
        saldo = redondear2(saldo + cantidad);
        System.out.printf("Ingresaste %.2f€. Saldo actual: %.2f€.%n", cantidad, saldo);
    }

    // --- Helpers privados ---
    private void cobrar(double cantidad, String detalle) {
        validarCantidad(cantidad);
        cantidad = redondear2(cantidad);

        if (cantidad > saldo) {
            System.out.printf(
                    "Saldo insuficiente para pagar %.2f€ %s. Saldo disponible: %.2f€.%n",
                    cantidad, detalle, saldo
            );
            return;
        }

        saldo = redondear2(saldo - cantidad);
        System.out.printf(
                "Pagaste %.2f€ %s. Saldo restante: %.2f€.%n",
                cantidad, detalle, saldo
        );
    }

    private void validarCantidad(double cantidad) {
        if (cantidad <= 0 || Double.isNaN(cantidad) || Double.isInfinite(cantidad)) {
            throw new IllegalArgumentException("La cantidad a pagar debe ser positiva.");
        }
    }

    private double redondear2(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }
}