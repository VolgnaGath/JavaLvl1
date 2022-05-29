package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        method1(10,9);
        method2(3);
        method3(-3);
        method4("stroka", 5);
        method6(1900);
    }

    public static void method2(int k) {
        if (k>=0) {
            System.out.println ("positive number");
            }
        else {
            System.out.println ("negative number");
        }
    }
    public static boolean method1(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        return true;
    }
    public static boolean method3(int l) {
        if (l>=0) {
            System.out.println("False");
            return false;
        }
        System.out.println("True");
        return true;
        }

        //Написать метод, которому в качестве аргумен cедается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз

    public static void method4(String message, int b) {
        for (int k = 0; k < b; k++) {
            System.out.println(message);
        }
    }

    public static boolean method6(int year) {
        if ((year % 4 == 0) && ((year % 4 == 0) && (year % 100 > 0)) || ((year % 4 == 0) && (year%100==0) && (year % 400==0))) {
            System.out.println("leap year");
            return true;
        } else {
            System.out.println("Non-leap year");
            return false;
        }
    }

}
