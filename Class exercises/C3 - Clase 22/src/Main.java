public class Main {
    public static void main(String[] args) {

        Producto hamburguesa = new Producto("Hamburguesa",300.0);
        Producto papaFrita = new Producto("Papa Frita", 180.0);
        Producto gaseosa = new Producto("Gaseosa", 70.0);
        Producto helado = new Producto("Helado",70.0);

        Combo combo1 = new Combo(0.10);
        combo1.agregarComprable(hamburguesa);
        combo1.agregarComprable(papaFrita);
        combo1.agregarComprable(gaseosa);

        Combo comboPareja = new Combo(0.20);
        comboPareja.agregarComprable(combo1);
        comboPareja.agregarComprable(combo1);

        Combo comboFamilia = new Combo(0.25);
        comboFamilia.agregarComprable(combo1);
        comboFamilia.agregarComprable(helado);
        comboFamilia.agregarComprable(helado);
        comboFamilia.agregarComprable(helado);
        comboFamilia.agregarComprable(comboPareja);

        Carrito carrito = new Carrito();
        carrito.agregarComprable(combo1);
        carrito.agregarComprable(comboFamilia);
        carrito.agregarComprable(comboPareja);

        System.out.println(carrito.calcularPrecioTotal());
    }
}