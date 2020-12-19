
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int nbJours = 0;
        Aquarium aquarium = init();

        while (nbJours != 2) {
            nbJours = loop(nbJours, aquarium);
        }
    }

    private static Aquarium init() {
        System.out.println("Pour créer un nouvel aquarium, veuillez saisir votre nom.");
        Aquarium aquarium = new Aquarium(sc.next());
        Menu menu = new Menu(aquarium);
        return aquarium;
    }

    private static int loop ( int nbJours, Aquarium aquarium){
        aquarium.feedingPhase();
        display(aquarium);
        return nbJours + 1;
    }


    private static void display (Aquarium aquarium) {
        Stat stat = new Stat(aquarium);
        stat.displayStats();
    }
}