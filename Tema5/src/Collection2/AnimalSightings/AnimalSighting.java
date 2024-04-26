package Collection2.AnimalSightings;

public abstract class AnimalSighting {
    private int timeOfSighting;

    public AnimalSighting(int timeOfSighting) {
        if (timeOfSighting < 0 || timeOfSighting > 24) {
            throw new IllegalArgumentException("Hour of sighting must be between 0 and 24");
        }
        this.timeOfSighting = timeOfSighting;
    }

    public int getTimeOfSighting() {
        return timeOfSighting;
    }

    public abstract String toString();
}
