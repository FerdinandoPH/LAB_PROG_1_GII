package poao.practicapl1v1;
import java.util.ArrayList;
public class MessageBoard {
    private ArrayList<Post> posts;
    //region gettersYsetters
    public ArrayList<Post> getPosts() {
        return posts;
    }
    public int totalSize(){
        int lineas=0;
        for (Post i: posts){
            lineas+=i.getLineas();
        }
        return lineas;
    }

    //endregion
    public MessageBoard(){
        this.posts=new ArrayList<Post>();
    }
    public void addPost(Post post){
        posts.add(post);
    }
    public Post longerPost(){
        Post postLargo=posts.get(0);
        for (Post i: posts){
            if (i.getLineas()>postLargo.getLineas())
                postLargo=i;
        }
        return postLargo;
    }
    public ImagePost[] getImagePosts(){
        ArrayList<ImagePost> imgPosts=new ArrayList<ImagePost>();
        for (Post i:posts){
            if (i instanceof ImagePost)
                imgPosts.add((ImagePost)i);
        }
        return imgPosts.toArray(new ImagePost[imgPosts.size()]);
    }
    @Override
    public String toString(){
        String resultado="En esta tabla hay "+posts.size()+" mensajes\n";
        for (int i=0;i<posts.size();i++){
            resultado+="Post "+Integer.toString(i+1)+":\n";
            resultado+=posts.get(i).toString()+"\n";
        }
        resultado+="Fin de los posts\n";
        return resultado;
    }
}
