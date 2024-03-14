package poo.empleados.nominas;
//import java.time.LocalDate;
import poo.empleados.*;


public class NominaTest {
    public static void main(String[] args) {
        // Crear objetos necesarios para las pruebas
        Empresa empresa = new Empresa("Empresa XYZ","1234567890");
        Departamento departamento = new Departamento("Departamento A", "A1", "Localización A", empresa);
        Empleado empleado = new Empleado("John Doe", "1234567890", 30, "Soltero", 1000.0, "Categoría A", departamento);
        double retenciones = 21.0;

        // Crear una instancia de Nomina utilizando el primer constructor
        Nomina nomina1 = new Nomina(empresa, departamento, empleado, retenciones);

        // Verificar que los valores se hayan asignado correctamente
        System.out.println("Empresa: " + nomina1.getEmpresa().getNombre());
        System.out.println("Departamento: " + nomina1.getDepartamento().getNombre());
        System.out.println("Empleado: " + nomina1.getEmpleado().getNombre());
        System.out.println("Retenciones: " + nomina1.getRetenciones());
        System.out.println("Salario neto: " + nomina1.getSalarioNeto());
        // Crear una instancia de Nomina utilizando el segundo constructor
        Nomina nomina2 = new Nomina(empleado, retenciones);

        // Verificar que los valores se hayan asignado correctamente
        System.out.println("Empleado: " + nomina2.getEmpleado().getNombre());
        System.out.println("Retenciones: " + nomina2.getRetenciones());

        // Modificar algunos valores y verificar que se actualicen correctamente
        nomina2.setRetenciones(55);
        System.out.println("Retenciones actualizadas: " + nomina2.getRetenciones());

        // Probar el método toString()
        System.out.println(nomina1.toString());
        System.out.println(nomina2.toString());
    }
}
