package Lesson6;

public class Dog extends Animal {
    public static int count = 0;

    public Dog(String name) {
        super(name);
        this.count++;
    }


    @Override
    public boolean run(int distance) {
        if (distance <= 500) {
            System.out.println(getName() + " probejal " + distance + " m");
        }
        else {
            System.out.println(getName() + " probejal 500 m i ustal");
        }
        return false;
    }

    @Override
    public boolean swim(int distance) {
        if (distance <= 10) {
            System.out.println(getName() + " proplil " + distance + " m");
        }
        else {
            System.out.println(getName() + " proplil 10 m i ustal");
        }
        return false;
    }
}
