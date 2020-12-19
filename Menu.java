import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public Menu(Aquarium aquarium) {
        lifeFormMenu(aquarium);
        aquarium.updateAquarium();
        new Stat(aquarium).displayStats();

    }
    private static void lifeFormMenu(Aquarium aquarium) {
        System.out.println("Quelle forme de vie voulez vous ajouter à votre aquarium ?\n1- Poisson 2- Algue");
        String choice = sc.next();
        if (choice.equals("1")) {
            displayFishTypeSelection(aquarium);
        }
        else if ( choice.equals("2")) {
            aquarium.addSeaweed();

        } else {
            displayInvalideChoice();
            lifeFormMenu(aquarium);
        }
        askAgain(aquarium);
    }

    private static String askAgain(Aquarium aquarium) {
        System.out.println("Voulez vous ajouter une autre forme de vie ?"+ yesNo());
        String choice = sc.next();

        while(!choice.equals("Y") && !choice.equals("N")) {
            displayInvalideChoice();
            choice = askAgain(aquarium);
        }
        if(choice.equals("Y")) {
            lifeFormMenu(aquarium);
        }
        return choice;
    }

    private static String yesNo() {
        return "\nY- Oui   ou N- Non";
    }

    private static void addSeaweed() {
    }

    private static void displayInvalideChoice() {
        System.out.println("Choix invalide");
    }

    private static void displayFishTypeSelection(Aquarium aquarium) {
        System.out.println("Avez vous acheté un : \n1- Carnivore ou\n2- Herbivore ?");
        String choice = sc.next();

        while(!choice.equals("1") && !choice.equals("2")) {
            displayInvalideChoice();
            displayFishTypeSelection(aquarium);
        }
        if(choice.equals("1")) {
            String race = raceCarnivoreSelection();
            String name = nameSelection();
            Boolean sex = sexSelection();
            aquarium.addFish(name, sex, "Carnivore", race);
        }
        if(choice.equals("2")) {
            String race = raceHerbivoreSelection();
            String name = nameSelection();
            Boolean sex = sexSelection();
            aquarium.addFish(name, sex, "Herbivore", race);
        }
    }

    private static String raceHerbivoreSelection() {
        System.out.println("De quel race est ce poisson Herbivore ?");
        HerbivoresRaces[] herbivoresRaces = HerbivoresRaces.values();

        for(int i = 0; i < herbivoresRaces.length; i++){
            System.out.println( ( i+1) + "- " + herbivoresRaces[i].getRace());
        }
        String choice = sc.next();

        if( !choice.equals("1") && !choice.equals("2") && !choice.equals("3") ) {
            displayInvalideChoice();
            return raceHerbivoreSelection();
        }
        return herbivoresRaces[Integer.parseInt(choice)-1].getRace();

    }

    private static String raceCarnivoreSelection() {
        System.out.println("De quel race est ce poisson carnivore ?");
        CarnivoresRaces[] carnivoresRaces = CarnivoresRaces.values();

        for(int i =0; i < carnivoresRaces.length; i++) {
            System.out.println( (i+1) + "- " + carnivoresRaces[i].getRace()+ " ");
        }
        String choice = sc.next();

        if( !choice.equals("1") && !choice.equals("2") && !choice.equals("3") ) {
            displayInvalideChoice();
            return raceCarnivoreSelection();
        }
        return carnivoresRaces[Integer.parseInt(choice)-1].getRace();

    }

    private static String nameSelection() {
        System.out.println("Quel nom voulez vous donner à votre nouveau poisson ?");
        return sc.next();
    }

    private static Boolean sexSelection() {
        System.out.println("Est ce un mâle ?"+ yesNo());
        String choice = sc.next();

        if(!choice.equals("Y") && !choice.equals("N")) {
            displayInvalideChoice();
            return sexSelection();
        }
        return choice.equals("Y");
    }
}
