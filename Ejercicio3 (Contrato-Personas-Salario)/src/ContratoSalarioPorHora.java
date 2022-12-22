public class ContratoSalarioPorHora extends Contratos implements Comparable{

    private Double cantidadHorasMensuales;
    private Double valorHoraContratoPorHora;

    public ContratoSalarioPorHora(Persona persona, Integer cantidadMesesDuracion, String fechaInicioAct, boolean esSelladoPorMinisterio, Double cantidadHorasMensuales, Double valorHoraContratoPorHora) {
        super(persona, cantidadMesesDuracion, fechaInicioAct, esSelladoPorMinisterio);
        this.cantidadHorasMensuales = cantidadHorasMensuales;
        this.valorHoraContratoPorHora = valorHoraContratoPorHora;
    }

    @Override
    public int compareTo(Object o) {

    ContratoSalarioPorHora otroContratoSalarioPorHora = ((ContratoSalarioPorHora) o);
        if (this.cantidadHorasMensuales > otroContratoSalarioPorHora.cantidadHorasMensuales){
            return 1;
        }
        if (this.cantidadHorasMensuales < otroContratoSalarioPorHora.cantidadHorasMensuales){
            return -1;
        }
        return 0;
    }
}
