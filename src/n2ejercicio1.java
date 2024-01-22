import java.util.*;

public class n2ejercicio1 {

    public static void main(String[] args) {

        ArrayList<Producto> listaProducto = new ArrayList<Producto>();

        int opcion = -1;
        while (opcion != 0) {
            opcion = menuPrograma(listaProducto);
            opcionMenu(opcion, listaProducto);
            System.out.println();
        }
    }

    static int menuPrograma(ArrayList<Producto> listaProducto) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Programa de Productos");
        System.out.println();
        System.out.println("1 - Añadir un Producto y Precio");
        System.out.println("2 - Calcular la venta total");
        System.out.println("0 - Salir del programa");
        System.out.print("Elige unas de las siguientes operaciones: ");
        int opcion = myObj.nextInt();

        return opcion;
    }

    static void opcionMenu(int eleccion, ArrayList<Producto> listaProducto) {


        switch (eleccion) {

            case 1:
                crearProducto(listaProducto);
                break;

            case 2:
                ventaProducto(listaProducto);
                break;

            case 0:
                System.out.println("Has salido del prorama");
                break;

            default:

                System.out.println("No has puesto una opción válida");
        }
    }

    static void crearProducto(ArrayList<Producto> listaProducto) {

        Producto nuevoProducto;

        String nombreProducto = pedirDato("Introduce el nombre: ");
        int precio = pedirDatoN("Introduce el precio del producto: ");

        nuevoProducto = new Producto(nombreProducto, precio);
        listaProducto.add(nuevoProducto);
        listaProductos(listaProducto);


    }

    static void ventaProducto(ArrayList<Producto> listaProducto) {

        Venta venta = new Venta();
        for (Producto producto : listaProducto) {
            venta.agregarProducto(producto);
            try {
                venta.calcularTotal();

            } catch (ventaVaciaException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Precio total de la venta: " + venta.getPrecioFinal() + "€");
    }

    static void listaProductos(ArrayList<Producto> listaProducto) {


        int i;
        for (i = 0; i < listaProducto.size(); i++) {
            System.out.print(listaProducto.get(i));
            System.out.println();


        }
    }

        static String pedirDato (String palabra){

            Scanner myObj = new Scanner(System.in);
            System.out.println();
            System.out.print(palabra);
            String datoString = myObj.nextLine();
            String datoStringF = datoString.toUpperCase();
            return datoStringF;

        }
        static Integer pedirDatoN (String palabra){

            Scanner myObj = new Scanner(System.in);
            System.out.println();
            System.out.print(palabra);
            int pedirDato = myObj.nextInt();
            return pedirDato;
        }

    }



