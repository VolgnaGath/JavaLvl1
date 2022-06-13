package Lesson6;

public class Cat extends Animal {
    public static int count = 0;

    public Cat(String name) {
        super(name);
        this.count++;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= 200) {
            System.out.println(getName() + " probejal " + distance + " m");
        }
        else {
            System.out.println(getName() + " probejal 200 m i ustal");
        }
        return false;
    }

    @Override
    public boolean swim(int distance) {
        if (distance > 0) {
            System.out.println(getName() + " ne poplil");
        }
        return false;
    }
}
