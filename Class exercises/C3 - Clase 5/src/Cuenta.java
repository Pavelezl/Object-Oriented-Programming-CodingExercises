import java.sql.SQLOutput;

public class Cuenta {

    //Atributos

    private Integer numeroDeCuenta;
    private String titular;
    private Double saldo;

    //Constructor

    public Cuenta(Integer numeroDeCuenta, String titular) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    //SOBRE CARGAR UN CONSTRUCTOR


    public Cuenta(Integer numeroDeCuenta, String titular, Double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    //Metodos
    public void depositar(Double monto){
        System.out.println(titular + " Tu saldo era de: " + saldo);
        System.out.println( titular + " Se depositaron: " + monto);
        saldo += monto;
        System.out.println(titular + " Tu nuevo saldo es de: " + saldo);
    }

    public void retirar(Double monto){
        if(monto <= saldo){
            System.out.println(titular +" Tu saldo era de: " + saldo);
            System.out.println(titular + " Se retiraron: " + monto);
            saldo -= monto;
            System.out.println(titular + " Tu nuevo saldo es de: " + saldo);
        }else{
            System.out.println(titular + " Saldo insuficiente");
        }

    }

    //GETTERS Y SETTERS
    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

}
