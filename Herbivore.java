import java.util.List;

public class  Herbivore extends Fish{
    String race;

    public Herbivore(String name, Boolean male, String race) {
        super(name, male, Herbivore.class.getName());
    }


    @Override
    public void eat(List<LifeForm> lf) {

    }
}
