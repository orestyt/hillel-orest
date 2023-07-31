package part1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = new Participant[]{
                new Human(300, 200),
                new Cat(500, 100),
                new Robot(1000, 0)
        };

        Obstacle[] obstacles = new Obstacle[]{
                new RunRoad(200),
                new Wall(50),
                new RunRoad(450),
                new Wall(99)
        };

        for (Participant participant:
                participants){
            boolean won = true;
            for (Obstacle obstacle:
                 obstacles) {
                if(!obstacle.overcome(participant))
                {
                    System.out.println("Participant left the game");
                    won = false;
                    break;
                }
            }
            if(won) System.out.println("Participant won");
        }
    }

    
}
