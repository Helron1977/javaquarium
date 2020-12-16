import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    String owner;
    List<LifeForm> lifeForms = new ArrayList<>();
    List<Seaweed> seaweeds = new ArrayList<>();
    List<Fish> fishes = new ArrayList<>();
    List<Fish> carnivores = new ArrayList<>();
    List<Fish> herbivores = new ArrayList<>();

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
            updateAquarium(car);
        }
        if (type.equals("Herbivore")) {
            Herbivore herb = new Herbivore(name, sex, race);
            herbivores.add(herb);
            updateAquarium(herb);
        }
    }

    private void updateAquarium(Fish fish) {
        fishes.add(fish);
        lifeForms.add(fish);
    }
}
