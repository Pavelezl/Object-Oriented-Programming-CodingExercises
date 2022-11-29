public class EmpleadoRelacionDependencia extends Empleado {

    private Double sueldoMensual;

    public EmpleadoRelacionDependencia(String nombre, String apellido, Integer legajo, Double sueldoMensual) {
        super(nombre, apellido, legajo);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public Double calcularSueldo(int dias) {
        return (sueldoMensual * dias) / 30;
    }
}
