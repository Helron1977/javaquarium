import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class Carnivore extends Fish {
    private String race;
    private Type type;


    public Carnivore(String name, Boolean male, String race) {
        super(name, male);
        this.setType(Type.CARNIVORE);
        this.setPredatorType(Type.CARNIVORE);
    }

    @Override
    public List<LifeForm> eat(List<LifeForm> preys) {
        while( this == preys.get(0))
            Collections.shuffle(preys);
        preys.remove(0);
        this.setFeed(true);
        return preys;
    }
}
