package poao.practicapl1v2;

public class Asignatura {
    protected String nombre;
    protected int creditos;
    protected int cuatrimestre;
    protected String tipo;
    //region gettersYsetters
    public String getNombre() {
        return nombre;
    }
    public int getCreditos() {
        return creditos;
    }
    public int getCuatrimestre() {
        return cuatrimestre;
    }
    public String getTipo() {
        return tipo;
    }
    //endregion
    public Asignatura(String nombre, int creditos, int cuatrimestre, String tipo){
        this.nombre=nombre;
        this.creditos=creditos;
        this.cuatrimestre=cuatrimestre;
        this.tipo=tipo;
    }
    @Override
    public String toString(){
        return this.nombre;
    }
}
