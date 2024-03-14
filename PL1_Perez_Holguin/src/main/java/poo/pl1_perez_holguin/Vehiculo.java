package poo.pl1_perez_holguin;
import java.util.ArrayList;
public abstract class Vehiculo {
    protected String id;
    protected String marca;
    protected String modelo;
    protected static ArrayList<String> ids=new ArrayList<String>();
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Vehiculo(String id, String marca, String modelo) {
        for (String e:ids){
            if (id.equals(e))
                throw new IllegalArgumentException("Id ya introducido");
        }
        this.id = id;
        ids.add(id);
        this.marca = marca;
        this.modelo = modelo;
    }
    @Override
    public String toString() {
        return "id=" + id + ", marca=" + marca + ", modelo=" + modelo;
    }
}
