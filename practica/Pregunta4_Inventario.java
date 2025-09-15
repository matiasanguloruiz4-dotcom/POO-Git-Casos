package practica;
import java.util.ArrayList;

class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre) {
        this(nombre, 0.0, 0);
    }

    public Producto(String nombre, double precio) {
        this(nombre, precio, 0);
    }

    public Producto(String nombre, double precio, int cantidad) {
        if (precio < 0 || cantidad < 0) {
            throw new IllegalArgumentException("Precio o cantidad no pueden ser negativos");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre + " - Precio: " + precio + " - Cantidad: " + cantidad;
    }
}

public class Pregunta4_Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(String nombre) {
        productos.add(new Producto(nombre));
    }

    public void agregarProducto(String nombre, double precio) {
        productos.add(new Producto(nombre, precio));
    }

    public void agregarProducto(String nombre, double precio, int cantidad) {
        productos.add(new Producto(nombre, precio, cantidad));
    }

    public void mostrarInventario() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        Pregunta4_Inventario inv = new Pregunta4_Inventario();

        inv.agregarProducto("Lapicero");
        inv.agregarProducto("Cuaderno", 3.5);
        inv.agregarProducto("Mochila", 50.0, 2);

        System.out.println("Inventario:");
        inv.mostrarInventario();
    }
}
