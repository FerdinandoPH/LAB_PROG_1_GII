package poao.practicapl1v1;
import java.util.ArrayList;
public abstract class Post {
    protected String titulo;
    protected String nombreUsuario;
    protected int likes;
    protected ArrayList<Tag> tags;
    //region gettersYsetters
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public int getLikes() {
        return likes;
    }
    public ArrayList<Tag> getTags() {
        return tags;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public String getTitulo() {
        return titulo;
    }
    public abstract int getLineas();
    //endregion
    //region constructores
    public Post (String titulo, String nombreUsuario){
        this.titulo=titulo;
        this.nombreUsuario=nombreUsuario;
        this.tags=new ArrayList<Tag>();
        this.likes=0;
    }
    //endregion
    public void addTag(Tag tag){
        boolean añadir=true;
        for (Tag i: this.tags){
            if (i.getIdioma().equals(tag.getIdioma()) && i.getTag().equals(tag.getTag()))
                añadir=false;
        }
        if (añadir)
            this.tags.add(tag);
    }
    public void like(){
        this.likes++;
    }
    @Override
    public String toString(){
        return String.format("[%s]:%s (%d likes)=>%s",nombreUsuario,titulo,likes,tags.toString());
    }
}
