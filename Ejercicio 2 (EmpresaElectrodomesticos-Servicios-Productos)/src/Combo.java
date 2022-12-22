import java.util.ArrayList;
import java.util.List;

public class Combo extends Servicios{

    private Double descuento;

    List<Servicios> serviciosList;


    public Combo(String nombre, String descripcion, Double descuento) {
        super(nombre, descripcion);
        this.descuento = descuento;
        this.serviciosList = new ArrayList<>();
    }

public  void agregaServicios(Servicios servicio ){
        serviciosList.add(servicio);
}



    @Override
    public Double calcularPrecioServicio() {
    Double sumatoriaServicios=0.0;
        for (Servicios servicios : serviciosList) {
            sumatoriaServicios+= servicios.calcularPrecioServicio();
        }
        return sumatoriaServicios - sumatoriaServicios * descuento;


    }
}
