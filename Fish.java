import java.util.List;

public abstract class Fish extends LifeForm{
    protected String name;
    protected Boolean male;
    protected String type;

    public Fish(String name, Boolean male, String Type) {
        this.name = name;
        this.male = male;
    }


    public abstract void eat(List<LifeForm> lf);

}
