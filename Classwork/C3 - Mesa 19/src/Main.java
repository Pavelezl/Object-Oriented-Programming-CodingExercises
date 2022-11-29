public class Main {
    // Exercise of company and employees, where we have to calculate the salary of each of their contracts depending on the number of days of work. Using Singelton and Factory
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Coda");

        empresa.agregarEmpleado(EmpleadoFactory.CODIGO_EMP_PH);
        empresa.agregarEmpleado(EmpleadoFactory.CODIGO_EMP_RD);

        System.out.println(empresa.calcularSueldoTotal(30));
    }
}