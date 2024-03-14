package poao.practicapl1v2;
import java.util.ArrayList;
public class Alumno extends Persona{
    private String titulacion;
    private ArrayList<AsignaturaCursada> asignaturasMatriculadas;
    //region gettersYsetters
    public String getTitulacion() {
        return titulacion;
    }
    public ArrayList<AsignaturaCursada> getAsignaturasMatriculadas() {
        return asignaturasMatriculadas;
    }
    public Alumno(String titulacion, String dni, String nombre, String direccion){
        super(dni,nombre,direccion);
        this.titulacion=titulacion;
        this.asignaturasMatriculadas=new ArrayList<AsignaturaCursada>();
    }
    public void altaAsignaturac(AsignaturaCursada ac){
        asignaturasMatriculadas.add(ac);
    }
    public float notaMedia(){
        float totalNotas=0f;
        for (AsignaturaCursada i: asignaturasMatriculadas){
            totalNotas+=i.getNota();
        }
        return totalNotas/asignaturasMatriculadas.size();
    }
    @Override
    public String toString(){
        return super.toString()+", Titulación: "+titulacion+", Asignaturas matriculadas: "+asignaturasMatriculadas.toString()+", Nota media: "+Float.toString(notaMedia());
    }
}
