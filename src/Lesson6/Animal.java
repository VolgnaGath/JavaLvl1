package Lesson6;

public abstract class Animal {
        private String name;
        public static int count = 0;

    public Animal(String name) {
        this.name = name;
        this.count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract boolean run(int distance);
    public abstract boolean swim(int distance);

}
