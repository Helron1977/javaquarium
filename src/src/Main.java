import java.awt.*;
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
        Menu menu = new Menu(aquarium);
        return aquarium;
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
            System.out.println(aquarium.lifeForms.size());
            System.out.println("Nombre de poissons :");
            System.out.println(aquarium.fishes.size());
            System.out.println("Nombre d'algues :");
            System.out.println(aquarium.seaweeds.size());
    }
}