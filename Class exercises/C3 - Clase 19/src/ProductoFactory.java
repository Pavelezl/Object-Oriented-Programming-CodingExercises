public class ProductoFactory {

    public static final String CODIGO_CAJA10 = "CAJA10X10";
    public static final String CODIGO_PELOTA_TENNIS = "PELOTATENIS";
    public static final String CODIGO_PELOTA_FUTBOL = "PELOTAFUTBOL";

    private static ProductoFactory instance;

    private ProductoFactory() {
        
    }

    public static ProductoFactory getInstance() {
        if(instance==null){
            instance = new ProductoFactory();
        }
        return instance;
    }

    public Producto crearProducto (String codigo) throws ProductoFactoryExcepction {
        switch (codigo){
            case CODIGO_CAJA10 :
                return new Caja(5.0,10.0,10.0,10.0);
            case CODIGO_PELOTA_TENNIS:
                return new Pelota(2.0,0.32);
            case CODIGO_PELOTA_FUTBOL:
                return new Pelota(4.0,11.0);

        }
        throw new ProductoFactoryExcepction(codigo + "No es un codigo valido");
    }
}
