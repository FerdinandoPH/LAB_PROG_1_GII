package poo.pl1_perez_holguin;

public class Bicicleta extends VehiculoElectrico {
    private int autonomia;
    private int numeroMarchas;
    public int getAutonomia() {
        return autonomia;
    }
    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
    public int getNumeroMarchas() {
        return numeroMarchas;
    }
    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }
    public Bicicleta(String id, String marca, String modelo, int capacidadBateria, int cargaActual, int autonomia,
            int numeroMarchas) {
        super(id, marca, modelo, capacidadBateria, cargaActual);
        this.autonomia = autonomia;
        this.numeroMarchas = numeroMarchas;
    }
    @Override
    public String toString() {
        return super.toString()+", autonomia (km)=" + autonomia + ", numeroMarchas=" + numeroMarchas;
    }
    
}
