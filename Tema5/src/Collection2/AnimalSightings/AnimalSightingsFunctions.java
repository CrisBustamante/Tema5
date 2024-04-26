package Collection2.AnimalSightings;

import java.util.ArrayList;
import java.util.List;

public class AnimalSightingsFunctions {
    private List<AnimalSighting> sightings;

    public AnimalSightingsFunctions() {
        sightings = new ArrayList<>();
    }

    public void addSighting(AnimalSighting sighting) {
        sightings.add(sighting);
    }

    public void showSightingsFrom(int hour) {
        System.out.println("SIGHTINGS FROM " + hour + " HOURS:");
        for (AnimalSighting sighting : sightings) {
            if (sighting.getTimeOfSighting() >= hour) {
                System.out.println(sighting);
            }
        }
    }

    public void showNocturnalSightings() {
        System.out.println("NOCTURNAL SIGHTINGS (BETWEEN 20 AND 8 HOURS):");
        for (AnimalSighting sighting : sightings) {
            int hour = sighting.getTimeOfSighting();
            if (hour >= 20 || hour < 8) {
                System.out.println(sighting);
            }
        }
    }

    public void showWolfPacks() {
        System.out.println("SIGHTED WOLVESPACKS:");
        for (AnimalSighting sighting : sightings) {
            if (sighting instanceof WolfPackSighting) {
                System.out.println(sighting);
            }
        }
    }

    public void showSnakes() {
        System.out.println("SIGHTED SNAKES:");
        for (AnimalSighting sighting : sightings) {
            if (sighting instanceof SnakeSighting) {
                System.out.println(sighting);
            }
        }
    }

    public void showBirds() {
        System.out.println("SIGHTED BIRDS:");
        for (AnimalSighting sighting : sightings) {
            if (sighting instanceof BirdSighting) {
                System.out.println(sighting);
            }
        }
    }
}
