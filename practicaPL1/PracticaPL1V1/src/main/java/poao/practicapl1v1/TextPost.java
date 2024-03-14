package poao.practicapl1v1;

public class TextPost extends Post {
    private String texto;
    //region gettersYSetters
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getTexto() {
        return texto;
    }
    public int getLineas(){
        return (int)Math.ceil(this.texto.length()/80);
    }
    //endregion
    public TextPost(String titulo, String nombreUsuario,String texto){
        super(titulo,nombreUsuario);
        this.texto=texto;
    }
    @Override
    public String toString(){
        return super.toString()+" "+this.texto;
    }
}
