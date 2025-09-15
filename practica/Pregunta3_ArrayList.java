package practica;
import java.util.ArrayList;

public class Pregunta3_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<>();

        // Agregar 5 nombres
        estudiantes.add("Ana");
        estudiantes.add("Luis");
        estudiantes.add("Carlos");
        estudiantes.add("María");
        estudiantes.add("José");

        System.out.println("Lista completa de estudiantes:");
        for (String e : estudiantes) {
            System.out.println(e);
        }

        // Eliminar el tercer nombre (índice 2)
        estudiantes.remove(2);

        System.out.println("\nLista después de eliminar el tercer estudiante:");
        for (String e : estudiantes) {
            System.out.println(e);
        }
    }
}
