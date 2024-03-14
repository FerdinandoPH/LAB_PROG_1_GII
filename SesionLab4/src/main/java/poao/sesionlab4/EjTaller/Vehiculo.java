package poao.sesionlab4.EjTaller;
import java.util.ArrayList;
public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private ArrayList<Pieza> piezasArregladas;
    //region gettersYsetters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
    public ArrayList<Pieza> getPiezasArregladas() {
        return piezasArregladas;
    }
    public void setPiezasArregladas(ArrayList<Pieza> piezasArregladas) {
        this.piezasArregladas = piezasArregladas;
    }
    //endregion
    //region constructores
    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        piezasArregladas = new ArrayList<>();
    }
    public Vehiculo(String matricula, String marca, String modelo, ArrayList<Pieza> piezasArregladas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.piezasArregladas = piezasArregladas;
    }
    //endregion
    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", piezasArregladas=" + piezasArregladas.toString() + '}';
    }
    public void addPieza(Pieza pieza){
        piezasArregladas.add(pieza);
    }
}
