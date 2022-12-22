import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("DH");

        EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();

        empresa.agregarEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_CONTRATADO);
        empresa.agregarEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_DEPENDENCIA, 4);

        System.out.println(empresa.calcularSueldosTotal(20));
    }
}