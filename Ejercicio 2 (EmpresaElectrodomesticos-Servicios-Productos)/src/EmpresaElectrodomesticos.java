import java.util.ArrayList;
import java.util.List;

public class EmpresaElectrodomesticos {

    private String razonSocial;

    private List<Servicios> serviciosList;


    public EmpresaElectrodomesticos(String razonSocial) {
        this.razonSocial = razonSocial;
        this.serviciosList = new ArrayList<>();
    }

    public void agregarServicios(Servicios servicio){
        serviciosList.add(servicio);

    }

    @Override
    public String toString() {
        return "Servicios Disponibles" + serviciosList ;
    }
}
