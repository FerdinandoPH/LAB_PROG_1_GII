package poao.sesionlab4.EjParking;
import java.time.LocalDate;
import java.util.ArrayList;
public class Aparcamiento {
    private ArrayList<Vehiculo> vehiculos;
    private int capacidad;
    //region gettersYsetters
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    //endregion
    //region constructores
    public Aparcamiento(int capacidad) {
        this.capacidad = capacidad;
        vehiculos = new ArrayList<>();
    }
    public Aparcamiento(ArrayList<Vehiculo> vehiculos, int capacidad) {
        this.vehiculos = vehiculos;
        this.capacidad = capacidad;
    }
    //endregion
    public void introducirVehiculo(Vehiculo vehiculo){
        if(vehiculos.size()<capacidad){
            vehiculos.add(vehiculo);
        }
        else{
            System.out.println("No hay plazas disponibles");
        }
    }
    //region sacarVehiculo
    public double sacarVehiculo(Vehiculo vehiculo,LocalDate fechaSalida){
        vehiculos.remove(vehiculo);
        return vehiculo.calcularImporte(fechaSalida);
    }
    public void sacarVehiculo(Vehiculo vehiculo){
        this.sacarVehiculo(vehiculo,LocalDate.now());
    }
    public void sacarVehiculo(String matricula){
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo.getMatricula().equals(matricula)){
                this.sacarVehiculo(vehiculo);
            }
        }
        throw new IllegalArgumentException("No se ha encontrado el vehiculo con matricula "+matricula);
    }
    public void sacarVehiculos(String matricula, LocalDate fechaSalida){
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo.getMatricula().equals(matricula)){
                this.sacarVehiculo(vehiculo,fechaSalida);
            }
        }
        throw new IllegalArgumentException("No se ha encontrado el vehiculo con matricula "+matricula);
    }
    //endregion
    @Override
    public String toString() {
       String respuesta;
        respuesta = "Capacidad: "+capacidad+", Vehículos: ";
        for (Vehiculo vehiculo : vehiculos) {
            respuesta+=vehiculo.toString()+", ";
        }
        return respuesta;
    }
}
