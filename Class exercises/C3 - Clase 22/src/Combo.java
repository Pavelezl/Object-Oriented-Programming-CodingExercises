import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable{

    private List<Comprable> comprableList;
    private Double descuento;

    public Combo(Double descuento) {
        this.descuento = descuento;
        comprableList = new ArrayList<>();
    }

    public void agregarComprable(Comprable comprable){
        comprableList.add(comprable);
    }

    @Override
    public Double calcularPrecio() {
        Double sumaPrecios = 0.0;
        System.out.println("encontre un combo");
        for(Comprable comprable : comprableList){
            sumaPrecios += comprable.calcularPrecio();
        }
        Double precioFinal = sumaPrecios - sumaPrecios * descuento;
        System.out.println("el precio con descuento del combo es de: " + precioFinal);
        return precioFinal;
    }
}
