public abstract class Fish extends LifeForm{
    protected String name;
    protected Boolean male;

    public Fish(String name, Boolean male) {
        this.name = name;
        this.male = male;
    }


    public abstract void eat(LifeForm eatable);

}
