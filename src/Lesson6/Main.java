package Lesson6;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Bob");
        Animal cat1 = new Cat("Vasya");
        Animal dog2 = new Dog("Bob");
        Animal dog3 = new Dog("Bob");
        Animal dog4 = new Dog("Bob");
        Animal dog5 = new Dog("Bob");
        Animal dog6 = new Dog("Bob");

        dog1.run(150);
        dog1.run(501);
        dog1.swim(150);
        cat1.run(100);
        cat1.run(250);
        cat1.swim(10);

        System.out.println(Animal.count);
        System.out.println(Dog.count);
        System.out.println(Cat.count);
    }
}
