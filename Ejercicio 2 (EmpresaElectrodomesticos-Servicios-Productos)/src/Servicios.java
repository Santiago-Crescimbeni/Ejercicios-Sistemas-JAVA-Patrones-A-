public abstract class Servicios {
    private String nombre;

    private String descripcion;


    public Servicios(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }


    public abstract Double calcularPrecioServicio();


    @Override
    public String toString() {
        return "Nombre Servicio: " + nombre + " Precio Servicio : " + calcularPrecioServicio() ;
    }
}
