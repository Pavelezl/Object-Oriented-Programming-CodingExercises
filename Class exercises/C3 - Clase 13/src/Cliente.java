public class Cliente implements Comparable{

    private String nombre;
    private Integer numeroCliente;

    public Cliente(String nombre, Integer numeroCliente) {
        this.nombre = nombre;
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {

        return nombre;
    }


    @Override
    public int compareTo(Object object) {
        Cliente otroCliente = (Cliente) object;
        if (this.numeroCliente > otroCliente.numeroCliente) {
            return 1;
        }
        if (this.numeroCliente < otroCliente.numeroCliente) {
            return -1;
        }
        return 0;
    }
}
