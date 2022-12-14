package estados;

public class Feliz implements TamagochiState{

    @Override
    public TamagochiState recibirComida() {
        return new Sediento();
    }

    @Override
    public TamagochiState recibirMimos() {
        return this;
    }

    @Override
    public TamagochiState recibirBebida() {
        return new Hambriento();
    }
}
