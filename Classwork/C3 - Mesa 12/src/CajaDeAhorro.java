public class CajaDeAhorro extends Cuenta{
    private Double tasaDeInteres;


    public CajaDeAhorro(Double tasaDeInteres, Cliente cliente){
        super(cliente);
        this.tasaDeInteres = tasaDeInteres;
    }

    @Override
    public void extraer(Double cantDeDinero){
        this.setSaldo(this.getSaldo() - cantDeDinero);
    }

    public void cobrarInteres(Integer cantMeses){
        System.out.println((this.getSaldo() * this.tasaDeInteres) * cantMeses);
    }


}
