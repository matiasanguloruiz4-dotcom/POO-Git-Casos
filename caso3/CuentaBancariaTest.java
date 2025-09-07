import java.util.Scanner;

// Clase CuentaBancaria
class CuentaBancaria {
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor que 0.");
        }
    }

    // Método para retirar con validación
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else if (monto > saldo) {
            System.out.println("Error: Fondos insuficientes.");
        } else {
            System.out.println("El monto a retirar debe ser mayor que 0.");
        }
    }

    // Mostrar información
    public void mostrarDatos() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: " + saldo);
    }
}

// Clase principal
public class CuentaBancariaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear cuenta bancaria
        System.out.print("Ingrese el nombre del titular: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(nombre, saldoInicial);

        int opcion;
        do {
            System.out.println("\n--- Menú de operaciones ---");
            System.out.println("1. Ver datos de la cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    cuenta.mostrarDatos();
                    break;
                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito = sc.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double retiro = sc.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema bancario.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
