public enum HerbivoresRaces {
    SOL("Sol"), BAR("Bar"), CARPE("Carpe");

    private String race;

    private HerbivoresRaces(String race) {
        this.race = race;
    }

    public String getRace() {
        return this.race;
    }
}
