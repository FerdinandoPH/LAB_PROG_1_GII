package poo.pl1_perez_holguin;

public abstract class VehiculoElectrico extends Vehiculo {
    protected int capacidadBateria;
    protected int cargaActual;
    public int getCapacidadBateria() {
        return capacidadBateria;
    }
    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }
    public int getCargaActual() {
        return cargaActual;
    }
    public void setCargaActual(int cargaActual) {
        if (cargaActual>=0 && cargaActual<100)
            this.cargaActual = cargaActual;
        else if (cargaActual<0)
            this.cargaActual=0;
        else
            this.cargaActual=100;
    }
    public VehiculoElectrico(String id, String marca, String modelo, int capacidadBateria, int cargaActual) {
        super(id, marca, modelo);
        this.capacidadBateria = capacidadBateria;
        this.setCargaActual(cargaActual);
    }
    public String cadenaNivelBateria(){ //He considerado límites cerrados a la derecha y abiertos a la izquierda (menos para 0)
        String[] mensajesBateria=new String[] {"Bajo","Medio","Alto"};
        int [] nivelesBateria=new int[] {26,76,101};
        for (int i=0;i<nivelesBateria.length;i++){
            if (this.cargaActual<nivelesBateria[i])
                return "Nivel "+mensajesBateria[i];
        }
        return "Nivel Erróneo";
    }
    @Override
    public String toString() {
        return super.toString()+", capacidadBateria (Wh)=" + capacidadBateria + ", cargaActual (%)=" + cargaActual;
    }
}
