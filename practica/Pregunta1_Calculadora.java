package practica;
// Clase Calculadora con sobrecarga de métodos
public class Pregunta1_Calculadora {

    // Suma de dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Suma de tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Suma de dos decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Pregunta1_Calculadora calc = new Pregunta1_Calculadora();

        System.out.println("Suma de 2 enteros: " + calc.sumar(5, 7));
        System.out.println("Suma de 3 enteros: " + calc.sumar(2, 4, 6));
        System.out.println("Suma de 2 decimales: " + calc.sumar(3.5, 2.8));
    }
}
