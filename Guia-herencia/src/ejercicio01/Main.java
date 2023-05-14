package ejercicio01;

public class Main {

	public static void main(String[] args) {
		System.out.println("EJERCICIO 1");
        System.out.println("===============================================================");
        CuentaDeAhorros ca = new CuentaDeAhorros(700);
        ca.depositar(10_000,"sueldo");
        ca.depositar(100_000,"venta");
        System.out.println("ca: " + ca.consultarSaldo());
        ca.mostrarHistorial();

	}

}