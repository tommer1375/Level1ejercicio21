import java.util.*;

public class Venta {

    private ArrayList<Producto> productos;
    private int precioFinal;

    public Venta () {
        precioFinal=0;
        productos=new ArrayList<>();
    }

    public int getPrecioFinal() {
        return precioFinal;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void calcularTotal() throws ventaVaciaException {

        if (productos.isEmpty()) {
            throw new ventaVaciaException("Has de añadir productos antes de la venta");
        } else {
            precioFinal = 0;
            for (Producto producto : productos) {
                precioFinal += producto.getPrecio();
            }

        }
    }


}






