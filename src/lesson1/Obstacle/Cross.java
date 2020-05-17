package lesson1.Obstacle;

import lesson1.Competitors.Competitor;

public class Cross extends Obstacle {

    private int dist;

    public Cross(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(dist);

    }
}
