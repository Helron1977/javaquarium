import java.util.Collections;
import java.util.List;

public class  Herbivore extends Fish {
    String race;

    public Herbivore(String name, Boolean male, String race) {

        super(name, male);
        this.setType(Type.HERBIVORE);
        this.setPredatorType(Type.CARNIVORE);
    }


    @Override
    public List<LifeForm> eat(List<LifeForm> preys) {
        Collections.shuffle(preys);
        preys.remove(0);
        this.setFeed(true);
        return preys;

    }
}
