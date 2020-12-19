import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    String owner;
    List<LifeForm> lifeForms = new ArrayList<>();
    List<LifeForm> seaweeds = new ArrayList<>();
    List<LifeForm> fishes = new ArrayList<>();
    List<LifeForm> carnivores = new ArrayList<>();
    List<LifeForm> herbivores = new ArrayList<>();

    public Aquarium(String owner) {
        this.owner = owner;
    }


    public void addSeaweed() {
        Seaweed seaweed = new Seaweed();
        seaweeds.add(seaweed);
        lifeForms.add(seaweed);
    }


    public void addFish(String name, Boolean sex, String type, String race) {
        if (type.equals("Carnivore")) {
            Carnivore car = new Carnivore(name, sex, race);
            carnivores.add(car);
            fishes.add(car);
        }
        if (type.equals("Herbivore")) {
            Herbivore herb = new Herbivore(name, sex, race);
            herbivores.add(herb);
            fishes.add(herb);
        }
    }

    public void updateAquarium() {
        lifeForms.clear();
        lifeForms.addAll(fishes);
        lifeForms.addAll(seaweeds);
        resetAnger();
    }

    private void resetAnger() {
        for (LifeForm fish : fishes) {
            ((Fish) fish).setFeed(false);
        }
    }

    public void feedingPhase() {
        for (int i = 0; i < fishes.size(); i++) {
            Fish fish = (Fish) fishes.get(i);
            if (fish.getType() == Type.CARNIVORE && !fish.getFeed() && fishes.size() >= 2)
                fishes = fish.eat(fishes);
            if (fish.getType() == Type.HERBIVORE && !seaweeds.isEmpty())
                seaweeds = fish.eat(seaweeds);
        }
        updateAquarium();

    }



}
