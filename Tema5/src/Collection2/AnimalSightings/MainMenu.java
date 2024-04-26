package Collection2.AnimalSightings;

import java.util.Scanner;

public class MainMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static AnimalSightingsFunctions functions = new AnimalSightingsFunctions();

    public static void main(String[] args) {
        boolean close = false;
        System.out.println("ANIMAL SIGHTINGS MANAGE SYSTEM:");
        while (!close) {
            showMenu();
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addSighting(scanner, functions);
                    break;
                case 2:
                    showSightingsFrom(scanner, functions);
                    break;
                case 3:
                    functions.showNocturnalSightings();
                    break;
                case 4:
                    functions.showWolfPacks();
                    break;
                case 5:
                    functions.showSnakes();
                    break;
                case 6:
                    functions.showBirds();
                    break;
                case 7:
                    System.out.println("BYE!");
                    close = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void addSighting(Scanner scanner, AnimalSightingsFunctions functions) {
        System.out.println("ENTER THE HOUR OF THE SIGHTING: ");
        int timeOfSighting = scanner.nextInt();
        scanner.nextLine();
        if (timeOfSighting < 0 || timeOfSighting > 24) {
            System.out.println("INVALID HOUR, MUST BE BETWEEN 0 and 24.");
            return;
        }
        System.out.println("ENTER THE TYPE OF THE ANIMAL (SNAKE, BIRD, WOLF): ");
        String animalType = scanner.nextLine().trim().toLowerCase();

        switch (animalType) {
            case "snake":
                addSnakeSighting(scanner, functions, timeOfSighting);
                break;
            case "bird":
                addBirdSighting(scanner, functions, timeOfSighting);
                break;
            case "wolf":
                addWolfPackSighting(scanner, functions, timeOfSighting);
                break;
            default:
                System.out.println("INVALID ANIMAL TYPE, TRY AGAIN.");
                break;
        }
    }

    public static void showMenu(){
        System.out.println("""
                MAIN MENU
                -----------------------------------------------
                INSERT THE NUMBER OF THE TASK YOU WANT TO PERFORM:
                 1 : ADD ANIMAL SIGHTING.
                 2 : SHOW SIGHTINGS FROM A SPECIFIC HOUR.
                 3 : SHOW NOCTURNAL SIGHTINGS.
                 4 : SHOW WOLF PACKS.
                 5 : SHOW SNAKES.
                 6 : SHOW BIRDS.
                 7 : EXIT.
                -----------------------------------------------
                """);
    }

    private static void addSnakeSighting(Scanner scanner, AnimalSightingsFunctions functions, int timeOfSighting) {
        System.out.println("ENTER THE SPECIES OF THE SNAKE: ");
        String species = scanner.nextLine();

        System.out.println("ENTER THE LENGHT OF THE SNAKE: ");
        double length = scanner.nextDouble();

        SnakeSighting sighting = new SnakeSighting(timeOfSighting, length, species);
        functions.addSighting(sighting);
        System.out.println("SNAKE SIGHTED ADDED SUCCESSFULLY.");
    }

    private static void addBirdSighting(Scanner scanner, AnimalSightingsFunctions functions, int timeOfSighting) {
        System.out.println("ENTER THE SPECIES OF THE BIRD: ");
        String species = scanner.nextLine();

        System.out.println("ENTER THE WEIGHT OF THE BIRD: ");
        double weight = scanner.nextDouble();

        BirdSighting sighting = new BirdSighting(timeOfSighting, weight, species);
        functions.addSighting(sighting);
        System.out.println("BIRD SIGHTED ADDED SUCCESSFULLY.");
    }

    private static void addWolfPackSighting(Scanner scanner, AnimalSightingsFunctions functions, int timeOfSighting) {
        System.out.println("ENTER THE NUMBER OF WOLVES IN THE PACK: ");
        int numWolves = scanner.nextInt();
        scanner.nextLine();

        System.out.println("ENTER ANY OBSERVATIONS: ");
        String observations = scanner.nextLine();

        WolfPackSighting sighting = new WolfPackSighting(timeOfSighting, numWolves, observations);
        functions.addSighting(sighting);
        System.out.println("WOLF PACK SIGHTED ADDED SUCCESSFULLY.");
    }

    private static void showSightingsFrom(Scanner scanner, AnimalSightingsFunctions functions) {
        System.out.println("ENTER THE HOUR TO SHOW SIGHTINGS FOR: ");
        int hour = scanner.nextInt();
        functions.showSightingsFrom(hour);
    }
}