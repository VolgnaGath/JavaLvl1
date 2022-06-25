package Lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood(Plate plateForFood) {
        return food;
    }

    public void setFood(int food) {
        this.food += food;
    }

    public boolean decriesFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
            return true;
        } else {
            return false;

        }
    }
}
