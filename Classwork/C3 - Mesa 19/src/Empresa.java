import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String razonSocial;
    private List<Empleado> empleadoList;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleadoList = new ArrayList<>();
    }

    public void agregarEmpleado(String codigoEmpleado){
        try {
            empleadoList.add(EmpleadoFactory.getInstance().crearEmpleado(codigoEmpleado));
        } catch (EmpleadoFactoryExcepction e) {
            e.printStackTrace();
        }
    }

    public Double calcularSueldoTotal(int dias){

        Double sueldoTotal = 0.0;

        for (Empleado empleado : empleadoList) {
            sueldoTotal += empleado.calcularSueldo(dias);

        }

        return sueldoTotal;
    }
}
