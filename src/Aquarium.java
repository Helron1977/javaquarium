import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aquarium {
    String owner = "";
    List<LifeForm> aquariumContents = new ArrayList<LifeForm>();

    public Aquarium(String owner) {
        this.owner = owner;
    }

    private void add(LifeForm lf) {
        aquariumContents.add(lf);
    }

}
