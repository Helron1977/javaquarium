public enum CarnivoresRaces {
    MEROU("Mérou"), THON("Thon"), POISSON_CLOWN("Poisson-clown");

    private String race;

    private CarnivoresRaces(String race) {
        this.race = race;
    }

    public String getRace() {
        return this.race;
    }
}