package poao.sesionlab4.vehiculosYLamparas;

public class Lampara {
    private boolean encendida;
    private int intensidad;
    //region gettersYSetters
    public boolean isEncendida() {
        return encendida;
    }
    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }
    public int getIntensidad() {
        return intensidad;
    }
    public void setIntensidad(double voltaje) {
        if (voltaje < 1.5 || voltaje > 12.5)
            throw new IllegalArgumentException("El voltaje debe estar entre 1.5 y 12.5");
        this.intensidad = (int) ((voltaje-1.5)*100/11);
    }
    //endregion
    public Lampara(boolean encendida, double voltaje) {
        this.encendida = encendida;
        setIntensidad(voltaje);
    }
    public Lampara() {
        this(false, 1.5);
    }
    @Override
    public String toString() {
        return "Lampara{" + "encendida=" + encendida + ", intensidad=" + intensidad + '}';
    }
}
