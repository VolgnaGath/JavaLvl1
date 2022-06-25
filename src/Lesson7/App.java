package Lesson7;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat ("Barsik", 30);
        Cat cat2 = new Cat("Vasya", 50);
        Cat cat3 = new Cat("Kit", 70);
        Plate plate1 = new Plate(100);
        Plate plate2 = new Plate(40);

        Cat[] cats = new Cat[3];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;

        cat1.eat(plate1);
        cat2.eat(plate1);
        cat3.eat(plate1);
        cat1.isHungry();
        cat2.isHungry();
        cat3.isHungry();

        plate1.setFood(20);
        System.out.println(plate1.getFood(plate1));





    }

}
