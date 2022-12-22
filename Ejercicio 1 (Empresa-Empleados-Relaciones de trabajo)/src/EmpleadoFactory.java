public class EmpleadoFactory {

    public static final String CODIGO_EMPLEADO_DEPENDENCIA = "EMP-RD";
    public static final String CODIGO_EMPLEADO_CONTRATADO = "EMP-PH";
    private static EmpleadoFactory instance;

    private EmpleadoFactory(){

    }

    public static EmpleadoFactory getInstance(){
        if(instance == null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    public Empleado crearEmpleado(String codigo) throws EmpleadoFactoryException{
        switch (codigo) {
            case CODIGO_EMPLEADO_DEPENDENCIA:
                return new EmpleadoRelacionDependencia("Pepe","Perez",5, 1000.0);
            case CODIGO_EMPLEADO_CONTRATADO:
                return new EmpleadoContratado("Maria", "Gomez", 10,7.0,0.14);
        }
        throw new EmpleadoFactoryException("El código " + codigo + " no existe");
    }
}
