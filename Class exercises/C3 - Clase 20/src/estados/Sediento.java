package estados;

public class Sediento implements TamagochiState{

    @Override
    public TamagochiState recibirComida() {
        return new Triste();
    }

    @Override
    public TamagochiState recibirMimos() {
        return this;
    }

    @Override
    public TamagochiState recibirBebida() {
        return new Feliz();
    }
}
