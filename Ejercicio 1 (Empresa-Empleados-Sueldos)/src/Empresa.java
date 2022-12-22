import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> empleadoList;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleadoList = new ArrayList<>();
    }

    public Double calcularSueldosTotal(Integer dias){
        Double sueldoTotal = 0.0;
        for (Empleado empleado : empleadoList) {
            sueldoTotal += empleado.calcularSueldo(dias);
        }
        return sueldoTotal;
    }

    public void agregarEmpleado(String codigo){
        try {
            empleadoList.add(EmpleadoFactory.getInstance().crearEmpleado(codigo));
        } catch (EmpleadoFactoryException e) {
            e.printStackTrace();
        }
    }

    public void agregarEmpleado(String codigo, Integer num){
        for (int i = 0; i < num; i++) {
            agregarEmpleado(codigo);
        }

    }
}
