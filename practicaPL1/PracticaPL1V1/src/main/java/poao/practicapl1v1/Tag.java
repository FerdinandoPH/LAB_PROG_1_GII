package poao.practicapl1v1;

public class Tag {
    private String tag;
    private String idioma;
    //region gettersYsetters
    public String getIdioma() {
        return idioma;
    }
    public String getTag() {
        return tag;
    }
    //endregion
    public Tag(String tag,String idioma){
        this.tag=tag;
        this.idioma=idioma;
    }
    @Override
    public String toString(){
        return this.tag;
    }
}
