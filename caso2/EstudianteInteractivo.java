import java.util.Scanner;

// Clase Estudiante con atributos privados
class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    // Constructor
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
    }
}

// Clase principal con main
public class EstudianteInteractivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar datos por teclado
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese el promedio del estudiante: ");
        double promedio = sc.nextDouble();

        // Crear objeto estudiante
        Estudiante est = new Estudiante(nombre, edad, promedio);

        System.out.println("\n--- Datos del Estudiante ---");
        est.mostrarDatos();

        sc.close();
    }
}
