package Collection2.AnimalSightings;

class WolfPackSighting extends AnimalSighting {
    private int howManyWolves;
    private String observations;

    public WolfPackSighting(int timeOfSighting, int howManyWolves, String observations) {
        super(timeOfSighting);
        this.howManyWolves = howManyWolves;
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "WOLFPACK SIGHTED AT " + getTimeOfSighting() + " HOURS. Nº OF WOLVES: " + howManyWolves + ", OBSERVATIONS: " + observations;
    }
}
