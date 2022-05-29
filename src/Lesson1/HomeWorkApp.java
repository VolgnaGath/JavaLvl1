package Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    public static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a=10;
        int b=-20;
        if (a+b >= 0) {
            System.out.println("Sunna pologitelnaya");
        }
        else {
            System.out.println("Summa otricatelnaya");
        }
    }
    public static void printColor() {
        int value=98;
        if (value<0) {
            System.out.println ("Red");
        }
        else if (value>0 && value<=100) {
            System.out.println ("Yellow");
        }
        if (value>100) {
            System.out.println ("Green");
       }
    }
    public static void compareNumbers() {
        int a=19;
        int b=22;
        if (a>=b) {
            System.out.println ("a >= b");
        }
        else {
            System.out.println ("a < b");
        }
    }

}







