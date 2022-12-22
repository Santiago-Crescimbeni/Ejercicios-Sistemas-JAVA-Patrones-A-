public class Main {
    public static void main(String[] args) throws ServicioFactoryException {


        EmpresaElectrodomesticos empresa1 =new EmpresaElectrodomesticos("Santiago tech");


        ServicoFactory servicoFactory =ServicoFactory.getInstance();

try {
    System.out.println(servicoFactory.crearServicio(ServicoFactory.VENTA_AIRE_ACONDICIONADO));
    System.out.println(servicoFactory.crearServicio(ServicoFactory.COLOCACION_AIRE_ACONDICIONADO));
    System.out.println(servicoFactory.crearServicio(ServicoFactory.FULL_AIRE_ACONDICIONADO));
}catch (ServicioFactoryException e){
    e.printStackTrace();
}

    empresa1.agregarServicios(servicoFactory.crearServicio(ServicoFactory.VENTA_AIRE_ACONDICIONADO));
    empresa1.agregarServicios(servicoFactory.crearServicio(ServicoFactory.COLOCACION_AIRE_ACONDICIONADO));
    empresa1.agregarServicios(servicoFactory.crearServicio(ServicoFactory.FULL_AIRE_ACONDICIONADO));

    System.out.println(empresa1);








    }
}