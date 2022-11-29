package estados;

public class Hambriento implements TamagochiState{

    @Override
    public TamagochiState recibirComida() {
        return new Feliz();
    }

    @Override
    public TamagochiState recibirMimos() {
        return this;
    }

    @Override
    public TamagochiState recibirBebida() {
        return new Triste();
    }
}
