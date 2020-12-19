public class LifeForm {
    Boolean exist;
    private Type type;
    private Type predatorType;

    public Boolean getExist() {
        return exist;
    }

    public void setExist(Boolean exist) {
        this.exist = exist;
    }


    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public Type getPredatorType() {
        return predatorType;
    }

    public void setPredatorType(Type predatorType) {
        this.predatorType = predatorType;
    }
}

