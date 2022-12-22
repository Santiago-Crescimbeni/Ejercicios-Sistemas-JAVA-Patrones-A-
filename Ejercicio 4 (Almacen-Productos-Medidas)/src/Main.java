public class Main {
    public static void main(String[] args) {

        Almacen almacen = new Almacen();

        ProductoFactory productoFactory = ProductoFactory.getInstance();

        almacen.agregarProducto(productoFactory.crearProducto("CAJA10X10"));
        almacen.agregarProducto(productoFactory.crearProducto("CAJA10X10"));
        almacen.agregarProducto(productoFactory.crearProducto("CAJA10X10"));
        almacen.agregarProducto(productoFactory.crearProducto("PELOTATENNIS"));
        almacen.agregarProducto(productoFactory.crearProducto("PELOTAFUTBOL"));

        System.out.println(almacen.calcularEspacio());

    }
}