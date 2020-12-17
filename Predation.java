import java.util.Collections;
import java.util.List;

public class Predation {
    public Predation(List<Fish> fishes) {
        Fish predator = selectPredator(fishes);
        Collections.shuffle(fishes);

    }

/**    private Fish selectPredator(List<Fish> fishes) {

    }**/
}
