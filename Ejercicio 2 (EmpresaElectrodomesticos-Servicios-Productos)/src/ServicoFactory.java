public class ServicoFactory {

    public static final String VENTA_AIRE_ACONDICIONADO = "Venta Aire Acondicionado";
    public static final String COLOCACION_AIRE_ACONDICIONADO = "Colocacion Aire Acondicionado";
    public static final String FULL_AIRE_ACONDICIONADO = "Full Aire Acondicionado";
    private static ServicoFactory instance;


    private ServicoFactory() {
    }


     public static ServicoFactory getInstance() {
        if (instance==null) {
            instance = new ServicoFactory();
        } return instance;
    }



    public Servicios crearServicio(String servicio) throws ServicioFactoryException{
        switch (servicio){

            case VENTA_AIRE_ACONDICIONADO: return new Simple("Venta Aires","Es un servicio de venta",65000.0,false);

            case COLOCACION_AIRE_ACONDICIONADO: return  new Simple("Colocacion Aires","Es un servicio de Colocacion",10000.0,true);

            case FULL_AIRE_ACONDICIONADO:   Combo combo1 = new Combo("Venta e Instalacion de Aires","Combo de aire completo",0.10);
                                                combo1.agregaServicios(crearServicio(ServicoFactory.VENTA_AIRE_ACONDICIONADO));
                                                combo1.agregaServicios(crearServicio(ServicoFactory.COLOCACION_AIRE_ACONDICIONADO));
                                                return combo1;



        }
        throw new ServicioFactoryException("No se encuentra el servicio");
    }



}
