package lesson1.Competitors;

public class Human implements Competitor {
    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;
    private boolean onDistance;


    public Human(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    public Human(String name) {
        this(name, 3000, 400);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " успешно пробежал " + dist + " метров");
        } else {
            System.out.println(name + " не смог пробежать " + dist + " метров");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать");
            onDistance = false;
            return;
        }
        if (dist <= maxSwimDistance) {
            System.out.println(name + " успешно проплыл " + dist + " метров");
        } else {
            System.out.println(name + " не может " + dist + " метров плавать");
            onDistance = false;
        }
    }


    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(name + " " +
                (onDistance ? " на дистанции" : " выбыл из соревнований"));
    }
}
