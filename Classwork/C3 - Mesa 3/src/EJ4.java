public class EJ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas en la semana: ");
        Double cantidadTotalHoras = scanner.nextDouble();
        Double valor40HorasTrabajo = 40.0 * 875.0;
        Double calcularHorasTrabajoExtra = (cantidadTotalHoras - 40.0) * 1312.5;
        Double valorTotalAPagar = valor40HorasTrabajo + calcularHorasTrabajoExtra;
        System.out.println("Esta semana se te debe pagar: " + valorTotalAPagar);
    }
}
}
