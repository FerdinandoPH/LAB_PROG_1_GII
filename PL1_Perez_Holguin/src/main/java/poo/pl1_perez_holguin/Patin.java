package poo.pl1_perez_holguin;

public class Patin extends VehiculoElectrico {
    
    private int velocidadMaxima;
    private int pesoMaximo;
    

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getPesoMaximo() {
        return pesoMaximo;
    }
    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public Patin(String id, String marca, String modelo, int capacidadBateria, int velocidadMaxima,
            int pesoMaximo, int cargaActual) {
        super(id, marca, modelo,capacidadBateria,cargaActual);
        this.velocidadMaxima = velocidadMaxima;
        this.pesoMaximo = pesoMaximo;
    }
    @Override
    public String toString() {
        return super.toString()+ ", velocidadMaxima (km/h)=" + velocidadMaxima + ", pesoMaximo (kg)=" + pesoMaximo;
    }
    
    
    
}
