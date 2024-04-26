package Collection2.AnimalSightings;

class SnakeSighting extends AnimalSighting {
    private double lenght;
    private String species;

    public SnakeSighting(int timeOfSighting, double lenght, String species) {
        super(timeOfSighting);
        this.lenght = lenght;
        this.species = species;
    }

    @Override
    public String toString() {
        return "SNAKE SIGHTED AT " + getTimeOfSighting() + " HOURS. SPECIES: " + species + ", LENGHT: " + lenght;
    }
}
