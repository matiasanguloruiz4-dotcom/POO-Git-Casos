package practica;
import java.util.Scanner;

public class Pregunta2_Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número entero: ");
            int a = sc.nextInt();

            System.out.print("Ingrese el segundo número entero: ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: división entre cero no permitida.");
        }

        sc.close();
    }
}
