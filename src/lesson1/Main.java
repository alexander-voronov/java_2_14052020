package lesson1;

import lesson1.Competitors.Cat;
import lesson1.Competitors.Competitor;
import lesson1.Competitors.Human;
import lesson1.Competitors.Robot;
import lesson1.Obstacle.Cross;
import lesson1.Obstacle.Obstacle;
import lesson1.Obstacle.Water;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {
                new Human("Ellen"),
                new Human("Alice", 2000, 500),
                new Cat("Caesar"),
                new Cat("Kot", 5000, 0),
                new Robot("David"),
                new Robot("T1000", 1000000, 1000000)
        };

        Obstacle[] obstacles = {
                new Cross(1000),
                new Water(300)
        };

        for (Competitor c : competitors) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) {
                    break;
                }
            }
        }

        for (Competitor c : competitors) {
            c.info();
        }


    }
}
