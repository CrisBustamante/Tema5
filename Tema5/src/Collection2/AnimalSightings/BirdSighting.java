package Collection2.AnimalSightings;

class BirdSighting extends AnimalSighting {
    private double weight;
    private String species;

    public BirdSighting(int timeOfSighting, double weight, String species) {
        super(timeOfSighting);
        this.weight = weight;
        this.species = species;
    }

    @Override
    public String toString() {
        return "BIRD SIGHTED AT " + getTimeOfSighting() + " HOURS. SPECIES: " + species + ", WEIGHT: " + weight;
    }
}
