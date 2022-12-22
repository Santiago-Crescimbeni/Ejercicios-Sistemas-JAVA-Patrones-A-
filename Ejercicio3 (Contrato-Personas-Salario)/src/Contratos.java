public abstract class Contratos {

    private Persona persona;
    private Integer cantidadMesesDuracion;
    private String fechaInicioAct;
    private boolean esSelladoPorMinisterio;

    public Contratos(Persona persona, Integer cantidadMesesDuracion, String fechaInicioAct, boolean esSelladoPorMinisterio) {
        this.persona = persona;
        this.cantidadMesesDuracion = cantidadMesesDuracion;
        this.fechaInicioAct = fechaInicioAct;
        this.esSelladoPorMinisterio = esSelladoPorMinisterio;
    }

    public boolean puedeIncorporarseAlTrabajo(){
        if (esSelladoPorMinisterio){
            return  true;
        }else {
             return  false;
        }
    }






}
