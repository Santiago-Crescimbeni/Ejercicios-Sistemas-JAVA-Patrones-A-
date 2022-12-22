public class ProductoFactory {

    //creo una isntancia estatica para garantizar que sea la unica
    private static ProductoFactory instance;

    //creo el constructor privado para que no puedan crear desde afuera de mi clase
    private ProductoFactory(){

    }

    //creo el getter que inicializa la clase cuando se ejecuta por primera vez
    public static ProductoFactory getInstance() {
        if(instance == null){
            instance = new ProductoFactory();
        }
        return instance;
    }

    //el metodo que crea los productos
    public Producto crearProducto(String codigo){
        switch (codigo){
            case "CAJA10X10" :
                return new Caja(3.0,10.0,10.0,10.0);
            case "PELOTAFUTBOL" :
                return new Pelota(5.0,11.0);
            case "PELOTATENNIS" :
                return new Pelota(1.0,0.32);
        }
        return null;
    }


}
