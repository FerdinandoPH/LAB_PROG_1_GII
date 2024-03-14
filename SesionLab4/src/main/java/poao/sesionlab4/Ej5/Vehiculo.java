/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poao.sesionlab4.Ej5;

/**
 *
 * @author perez
 */

public class Vehiculo {
    
    private String matricula;
    private String marca;
    private String modelo;
    private int velocidad;
    private boolean luces;
    private int marcha;
    private int velocidadesMarcha[]= new int [] {0,10,30,60,90,120};
    private Conductor conductor;

    //region gettersYSetters
    public Conductor getConductor() {
        return conductor;
    }
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    public int getMarcha() {
        return marcha;
    }
    public void setMarcha(int marcha) {
        if (marcha >= 0 || marcha <= 5)
            throw new IllegalArgumentException("La marcha debe estar entre 0 y 5");
        this.marcha = marcha;
        this.velocidad = velocidadesMarcha[marcha];
    }
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

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
        for (int i=0; i<velocidadesMarcha.length-1; i++){
            if (i==5||velocidad <= velocidadesMarcha[i+1]){
                this.marcha = i;
                break;
            }
        }
    }

    public boolean isLuces() {
        return luces;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    }
    //endregion
    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
        this.marcha = 0;
        this.luces = false;
        }
    public Vehiculo(String matricula, String marca, String modelo, int velocidad, boolean luces) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.luces = luces;
        for (int i=0; i<velocidadesMarcha.length-1; i++){
            if (i==5||velocidad <= velocidadesMarcha[i+1]){
                this.marcha = i;
                break;
            }
        }
    }
    public  Vehiculo(String matricula, String marca, String modelo, int marcha){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.marcha = marcha;
        this.velocidad = velocidadesMarcha[marcha];
        this.luces = false;
    }
    @Override
    public String toString(){
        return "Matricula: "+matricula+", Marca: "+marca+", Modelo: "+modelo+", Velocidad: "+velocidad+", Luces: "+luces+", Marcha: "+marcha+(conductor==null?", Conductor: ninguno":", "+conductor.toString());
    }
}
