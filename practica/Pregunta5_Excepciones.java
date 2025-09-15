package practica;
import java.util.Scanner;

// Excepción personalizada
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class Pregunta5_Excepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        String entrada = sc.nextLine();

        try {
            int numero = Integer.parseInt(entrada);

            if (numero < 0) {
                throw new NumeroNegativoException("Error: el número no puede ser negativo.");
            }

            System.out.println("Número ingresado: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: debe ingresar un valor numérico válido.");
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
