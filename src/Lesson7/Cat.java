package Lesson7;

public class Cat {
    private String name;
    private int appetite;

    boolean isFull = true;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void isHungry() {
        if (appetite > 0) {
            isFull = false;
            System.out.println(name + " Golodniy");
        } else {
            System.out.println(name + " Poel");
        }
    }

    public void eat(Plate plateForFood) {
        if (plateForFood.getFood(plateForFood) >= appetite) {
            plateForFood.decriesFood(appetite);
            appetite = 0;
        } else {
            System.out.println("Malo edi");
        }


    }
}
