package poo.empleados.nominas;
import java.time.LocalDate;

import poo.empleados.*;

public class Nomina {
    private Empresa empresa;
    private Departamento departamento;
    private Empleado empleado;
    private LocalDate fecha;
    private double salarioBruto;
    private double retenciones;
    private double salarioNeto;
    //region gettersYsetters
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public double getSalarioBruto() {
        return salarioBruto;
    }
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    public double getRetenciones() {
        return retenciones;
    }
    public void setRetenciones(double retenciones) {
        this.retenciones = retenciones;
        this.salarioNeto = salarioBruto - salarioBruto*retenciones/100;
    }
    public double getSalarioNeto() {
        return salarioNeto;
    }
    //endregion
    //region constructores
    public Nomina(Empresa empresa, Departamento departamento, Empleado empleado, double retenciones) {
        this.empresa = empresa;
        this.departamento = departamento;
        this.empleado = empleado;
        this.fecha = LocalDate.now();
        this.salarioBruto = empleado.getSueldo();
        this.retenciones = retenciones;
        this.salarioNeto = salarioBruto - salarioBruto*retenciones/100;
    }
    public Nomina(Empleado empleado, double retenciones){
        this(empleado.getDepartamento().getEmpresa(), empleado.getDepartamento(), empleado, retenciones);
    }
    //endregion
    @Override
    public String toString() {
        return "Nomina{" +
                "empresa=" + empresa.toString() +
                ", departamento=" + departamento.toString() +
                ", empleado=" + empleado.toString() +
                ", fecha=" + fecha +
                ", salarioBruto=" + salarioBruto +
                ", retenciones=" + retenciones +
                ", salarioNeto=" + salarioNeto +
                '}';
    }
}
