import java.util.List;

public abstract class Fish extends LifeForm{
    private final String name;
    private final Boolean male;
    private Boolean feed = false;

    public Fish(String name, Boolean male) {
        this.name = name;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public Boolean getMale() {
        return male;
    }

    public void setFeed(Boolean feed) {
        this.feed = feed;
    }

    public Boolean getFeed() {
        return feed;
    }

    public abstract List<LifeForm> eat(List<LifeForm> lifeForm);

}
