import java.util.ListIterator;

public class Stat {
    private int nbCarnivores = 0;
    private int nbHerbivores = 0;
    private int nbSeaweeds = 0;
    private final int nbFish;
    private final int nbLifeForms;

    public Stat(Aquarium aquarium) {
        ListIterator<LifeForm> lifeFormListIterator = aquarium.lifeForms.listIterator();
        lifeFormListIterator.forEachRemaining(lifeForm -> {
            if (lifeForm.getType() == Type.CARNIVORE)
                nbCarnivores++;
            if (lifeForm.getType() == Type.HERBIVORE)
                nbHerbivores++;
            if (lifeForm.getType() == Type.SEAWEED)
                nbSeaweeds++;
        });
        nbFish = nbCarnivores + nbHerbivores;
        nbLifeForms = aquarium.lifeForms.size();
    }

    public int getNbCarnivores() {
        return nbCarnivores;
    }

    public int getNbHerbivores() {
        return nbHerbivores;
    }

    public int getNbSeaweeds() {
        return nbSeaweeds;
    }

    public int getNbFish() {
        return nbFish;
    }

    public int getNbLifeForms() {
        return nbLifeForms;
    }

    public void displayStats() {
        System.out.println("Nombre d'organismes vivants");
        System.out.println(this.getNbLifeForms());
        System.out.println("Nombre de poissons :");
        System.out.println(this.getNbFish());
        System.out.println("Nombre de Carnivores :");
        System.out.println(this.getNbCarnivores());
        System.out.println("Nombre d'Herbivores :");
        System.out.println(this.getNbHerbivores());
        System.out.println("Nombre d'algues :");
        System.out.println(this.getNbSeaweeds());
    }
}
