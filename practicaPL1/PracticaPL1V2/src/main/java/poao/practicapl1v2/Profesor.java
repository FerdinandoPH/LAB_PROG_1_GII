package poao.practicapl1v2;
import java.util.ArrayList;
public class Profesor extends Persona {
    private String departamento;
    private ArrayList<Asignatura> asignaturasImpartidas;
    //region gettersYsetters
    public String getDepartamento() {
        return departamento;
    }
    //endregion
    public Profesor(String departamento, String dni, String nombre, String direccion){
        super(dni, nombre, direccion);
        this.departamento=departamento;
        this.asignaturasImpartidas=new ArrayList<Asignatura>();
    }
    public void altaAsignatura(Asignatura a){
        asignaturasImpartidas.add(a);
    }
    public String calificarAsignatura(AsignaturaCursada ac, float nota, int convocatoria){
        return ac.Calificar(nota, convocatoria);
    }
    @Override
    public String toString(){
        return super.toString()+", Departamento: "+departamento+", Asignaturas Impartidas: "+asignaturasImpartidas.toString();
    }
}
