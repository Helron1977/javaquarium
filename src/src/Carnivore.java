import java.util.Random;

public  class Carnivore extends Fish {
    String race;

    public Carnivore(String name, Boolean male, String race) {
        super(name, male);
    }


    @Override
    public void eat(LifeForm eatable) {
        eatable.setExist(false);
    }


}
