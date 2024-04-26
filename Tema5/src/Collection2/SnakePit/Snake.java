package Collection2.SnakePit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Snake {
    static Random random = new Random();

    private int age = 0;
    private List<Character> rings;
    private int probability;

    public int getAge() {
        return age;
    }
    public List<Character> getRings() {
        return rings;
    }

    @Override
    public String toString() {
        return "AGE: " + age + "; SNAKE: " + rings;
    }

    public Snake(){
        List<Character> rings = new ArrayList<>();
        addRing();
    }

    public boolean isAlive(){
        return !this.rings.isEmpty();
    }

    public void live(){
        if(age < 10){
            probability = random.nextInt(1,11);
            if (probability <= 8) addRing();
            else shedSkin();
        } else {
            probability = random.nextInt(1, 11);
            if (probability <= 9) decrease();
            else shedSkin();
        }
        this.age++;
    }
    public void addRing(){
        if (rings == null)
            rings = new ArrayList<>();
        int ringColor = random.nextInt(1, 4);
        if (ringColor == 1) this.rings.add('R');
        else if (ringColor == 2) this.rings.add('V');
        else if (ringColor == 3) this.rings.add('A');
    }
    public void shedSkin(){
        int t = this.rings.size();
        this.rings.clear();
        for (int i = 0; i < t; i++) {
            addRing();
        }
    }
    public void decrease(){
        this.rings.removeLast();

    }
}
