package poao.practicapl1v2;

public abstract class Persona {
    private String dni;
    private String nombre;
    private String direccion;
    //region gettersYsetters
    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //endregion
    public Persona (String dni, String nombre, String direccion){
        this.dni=dni;
        this.nombre=nombre;
        this.direccion=direccion;
    }
    @Override
    public String toString(){
        return "Nombre: "+nombre+", DNI: "+dni+", Dirección: "+direccion;
    }
}
