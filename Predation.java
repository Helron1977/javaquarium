import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Predation {
    public Predation(List<Fish> fishes) {
        Collections.shuffle(fishes);

        for(int i = 0; i < fishes.size()-1; i++) {
            if (fishes.get(i).getType() == (Type.CARNIVORE)) {
                fishes.remove(i + 1);
            }
        }
        if (fishes.get(fishes.size()-1).getType() == (Type.CARNIVORE))
        fishes.remove(0);
    }

}
