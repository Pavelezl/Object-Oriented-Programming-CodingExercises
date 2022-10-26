public class Impresora {

    //ATRIBUTOS
    private String modelo;
    private String tipoConexion;
    private String fechaFabricacion;
    private Integer cantidadHojas;

        //CONSTRUCTOR

    public Impresora(String modelo, String tipoConexion, String fechaFabricacion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        cantidadHojas = 0;
    }

    //METODOS
    private Boolean tienePapel(){
        return cantidadHojas > 0;
    }

    public void imprimir(String texto){
        if(tienePapel()){
            System.out.println(" imprimiendo " + texto);
            cantidadHojas--;
        }else{
            System.out.println("No tengo papel");

        }

    }

    public void agregarHojas(Integer hojasAgregadas){
        cantidadHojas += hojasAgregadas;
    }

    public void imprimirMuchos(String texto, Integer cantidad){
        for (int i = 0; i < cantidad; i++) {
            imprimir(texto);
        }
    }
}
