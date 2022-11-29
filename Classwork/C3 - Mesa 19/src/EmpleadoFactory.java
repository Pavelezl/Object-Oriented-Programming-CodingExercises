public class EmpleadoFactory {

    public static final String CODIGO_EMP_RD = "EMP-RD";
    public static final String CODIGO_EMP_PH = "EMP-PH";

    private static EmpleadoFactory instance;

    private EmpleadoFactory() {
    }

    public static EmpleadoFactory getInstance() {
        if(instance==null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    public Empleado crearEmpleado (String codigo) throws EmpleadoFactoryExcepction {
        switch (codigo){
            case CODIGO_EMP_RD:
                return new EmpleadoRelacionDependencia("Pablo","Velez",1234,1000.0);
            case CODIGO_EMP_PH:
                return new EmpleadoContratado("Agustin", "Ferres",4567,7.0,0.14);
        }
        throw new EmpleadoFactoryExcepction(codigo + "No es un codigo valido");
    }
}



