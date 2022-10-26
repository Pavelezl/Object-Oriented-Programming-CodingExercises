public class Perro {


    private String apodo;
    private String color;

    public Perro(String apodo,String color) {
        this.apodo = apodo;
        this.color = color;
    }

    public void ladrar(){
        System.out.println("guau woof");
    }
    public void correr(){
        System.out.println("estoy corriendo");
    }


    public String getApodo() {
        return apodo;
    }
}
