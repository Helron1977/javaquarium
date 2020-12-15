import java.util.Random;

public  class Carnivore extends Fish {


    public Carnivore(String name, Boolean male) {
        super(name, male);
    }

    @Override
    public void eat(LifeForm eatable) {
        eatable.setExist(false);
    }


}
