package Collection2.SnakePit;

import java.util.ArrayList;
import java.util.List;

public class SnakePit {
    private List<Snake> nest = new ArrayList<>();

    public void addSnakeToNest(){
        if (this.nest.size() < 20) this.nest.add(new Snake());
        else System.out.println("THE SNAKE'S PIT IS FULL");
    }
}
