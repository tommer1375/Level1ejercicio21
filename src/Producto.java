
import java.util.*;

public class Producto {



    private String nombre;
    private int precio;

    public Producto (String nombre, int precio) {

        this.nombre=nombre;
        this.precio=precio;

    }
    public int getPrecio() {
        return precio;
    }

    public String toString() {
        return "Se ha añadido el producto "+nombre+" con un precio "+precio+"€";
    }
}
