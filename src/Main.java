import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int nbJours = 0;
        Aquarium aquarium = init();

        while (nbJours != 10) {
            nbJours = loop(nbJours, aquarium);
        }
    }

    private static Aquarium init() {
        System.out.println("Pour créer un nouvel aquarium, veuillez saisir votre nom.");
        Aquarium aquarium = new Aquarium(sc.next());
        addLifeFormMenu();
        return aquarium;
    }

    private static void addLifeFormMenu() {
        System.out.println("Que voulez vous ajouter à votre aquarium ? 1-Poisson 2- Algue");
        int choice = sc.nextInt();
        if (choice < 1 || choice > 2) {
            displayInvalideChoice();
            addLifeFormMenu();
        }
        switch (choice) {
            case 1:
                addFishMenu();
                break;
            case 2:
                addSeaweedMenu();
                break;
        }
    }

    private static void displayInvalideChoice() {
        System.out.println("Choix invalide. Saisissez à nouveau votre choix.");
    }

    private static void addSeaweedMenu() {
        //TODO ADD a seaweed int the aquarium
    }

    private static void addFishMenu() {
        //TODO add a carnivore or a herbivore in the aquarium

    }

    private static int loop ( int nbJours, Aquarium aquarium){
            display(aquarium);
            return nbJours + 1;
    }
        private static void display (Aquarium aquarium) {
            System.out.println("Nombre d'organismes vivants");
            System.out.println(aquarium.aquariumContents.size());
            System.out.println("nombre de poissons :");
            //instanceof  = pas beau certainement pb conception
    }
}