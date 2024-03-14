package poao.practicapl1v1;

public class ImagePost extends Post {
    private String rutaImagen;
    private int pixelesX;
    private int pixelesY;
    //region gettersYsetters
    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    public String getRutaImagen() {
        return rutaImagen;
    }
    public int getPixelesX() {
        return pixelesX;
    }
    public int getPixelesY() {
        return pixelesY;
    }
    public int getLineas(){
        return (int)Math.ceil((double)this.pixelesY/20);
    }
    //endregion
    public ImagePost(String titulo, String nombreUsuario,String rutaImagen, int pixelesX,int pixelesY){
        super(titulo,nombreUsuario);
        this.rutaImagen=rutaImagen;
        this.pixelesX=pixelesX;
        this.pixelesY=pixelesY;
    }
    public ImagePost(String titulo, String nombreUsuario, int pixelesX,int pixelesY){
        this(titulo,nombreUsuario,"",pixelesX,pixelesY);
    }
    @Override
    public String toString(){
        return String.format("%s(%dx%d)",super.toString(),pixelesX,pixelesY);
    }
}
