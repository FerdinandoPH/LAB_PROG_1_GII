package poao.practicapl1v2;

public class AsignaturaCursada extends Asignatura{
    private float nota;
    private int convocatoria;
    //region gettersYsetters
    public float getNota() {
        return nota;
    }
    public int getConvocatoria() {
        return convocatoria;
    }
    //endregion
    public AsignaturaCursada(String nombre, int creditos, int cuatrimestre, String tipo){
        super(nombre, creditos, cuatrimestre, tipo);
        this.nota=0f;
        this.convocatoria=0;
    }
    public AsignaturaCursada(Asignatura a){
        super(a.getNombre(), a.getCreditos(), a.getCuatrimestre(), a.getTipo());
        this.nota=0f;
        this.convocatoria=0;
    }
    public String Calificar(float nota, int convocatoria){
        this.nota=nota;
        this.convocatoria=convocatoria;
        String[] resultados=new String[]{"SUSPENSO","APROBADO","NOTABLE","SOBRESALIENTE"};
        float[] notasResultados=new float[]{5f,7f,9f,10.1f};
        for (int i=0;i<notasResultados.length;i++){
            if (nota<notasResultados[i])
                return resultados[i];
        }
        return resultados[resultados.length-1];
    }
}
