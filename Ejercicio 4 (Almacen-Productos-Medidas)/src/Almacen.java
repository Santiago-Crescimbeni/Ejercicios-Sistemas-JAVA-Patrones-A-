import java.util.ArrayList;
import java.util.List;

public class Almacen {

    private List<Producto> productoList;

    public Almacen() {
        this.productoList = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        productoList.add(producto);
    }

    public Double calcularEspacio(){
        Double espacioNecesario = 0.0;
        for (Producto producto : productoList) {
            espacioNecesario += producto.calcularEspacio();
        }
        return espacioNecesario;
    }
}
