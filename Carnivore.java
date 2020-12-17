import java.util.List;
import java.util.Random;

public  class Carnivore extends Fish {
    String race;


    public Carnivore(String name, Boolean male, String race) {
        super(name, male, Carnivore.class.getName());
    }


    @Override
    public void eat(List<LifeForm> lf) {

    }
}
