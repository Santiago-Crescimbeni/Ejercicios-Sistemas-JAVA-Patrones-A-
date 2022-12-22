public class ContratoMensual extends Contratos{


    private  Double salarioMensual;
    private Double horasTotalesContratoMensual;
    private Boolean cargoEmpleado;

    public ContratoMensual(Persona persona, Integer cantidadMesesDuracion, String fechaInicioAct, boolean esSelladoPorMinisterio, Double salarioMensual, Double horasTotalesContratoMensual, Boolean cargoEmpleado) {
        super(persona, cantidadMesesDuracion, fechaInicioAct, esSelladoPorMinisterio);
        this.salarioMensual = salarioMensual;
        this.horasTotalesContratoMensual = horasTotalesContratoMensual;
        this.cargoEmpleado = cargoEmpleado;
    }

            public Boolean CargoPersona(){
                 return cargoEmpleado.equals("Jefe");
            }

}
