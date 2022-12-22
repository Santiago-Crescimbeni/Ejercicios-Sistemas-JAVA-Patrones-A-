public class Simple extends  Servicios{

    private Double precioBase;

    private  Boolean incluyeColocacion;


    public Simple(String nombre, String descripcion, Double precioBase, Boolean incluyeColocacion) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.incluyeColocacion = incluyeColocacion;
    }


    @Override
    public Double calcularPrecioServicio() {

        if (incluyeColocacion){
            return  precioBase + precioBase * 0.10;
        }else {
            return precioBase;
        }

    }
}
