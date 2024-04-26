package Collection2.SnakePit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainMenu {
    static Random random = new Random();
    public static void main(String[] args) {
        List<Snake> nest = new ArrayList<>();
        life(nest);
    }
    public static void snakeBorn(List<Snake> nest){
        int nestLong = Math.min(20 - nest.size(), 3);
        int randomBorn = random.nextInt(1, 4);
        if (nestLong >= 0) {
            int bornAmount = Math.min(randomBorn, nestLong);
            for(int i = 0; i < bornAmount; i++){
                nest.add(new Snake());
            }
            System.out.println(bornAmount + " HAS BORN.");
        }

    }
    public static void mongooseAttack(List<Snake> nest){
        int amount = random.nextInt(5);
        for (int i = 0; i < amount;i++) {
            nest.remove(random.nextInt(nest.size()));
        }
        System.out.println("THE SNAKE PIT HAS BEEN RAIDED BY A MANGOOSE! " + amount + " SNAKES HAVE DIED.");
    }
    public static void life(List<Snake> nest){
        int seconds = 0;
        while (seconds <100){ //300
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("ERROR.");
            }
            System.out.println("\n");
            for(Snake snake :  nest){
                snake.live();
                System.out.println(snake.toString());
            }
            if(seconds % 5 == 0) snakeBorn(nest);
            if(seconds % 10 == 0) {
                int probability = random.nextInt(1, 11);
                if(probability <= 2) mongooseAttack(nest);
            }
            nest.removeIf(snake -> !snake.isAlive());
            seconds++;
        }
    }
}
