package Lesson3;


public class main {
    public static void main(String[] args) {
        /* Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0*/
        int[] mass1 = new int[10];
        mass1[0] = 1;
        mass1[1] = 0;
        mass1[2] = 1;
        mass1[3] = 0;
        mass1[4] = 1;
        mass1[5] = 0;
        mass1[6] = 1;
        mass1[7] = 0;
        mass1[8] = 1;
        mass1[9] = 0;
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] == 0) {
                mass1[i] = 1;
            } else if (mass1[i] == 1) {
                mass1[i] = 0;
            }
        }
        for (int i = 0; i < mass1.length; i++) {
            System.out.print(mass1[i]);
        }
        /* Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/
        int[] mass2 = new int[100];
        mass2[0] = 1;
        for (int i = 1; i < mass2.length; i++) {
            mass2[i] = mass2[i-1] + 1;
            System.out.println(mass2[i]);
        }


        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
        int[] mass3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass3.length; i++) {
            if (mass3[i] < 6) {
                mass3[i] *= 2;
            }
            System.out.println(mass3[i]);
        }


        int[][] mass4 = new int[6][6];
        for (int i = 0; i < mass4[mass4.length - 1].length; i++) {
            mass4[i][i] = 1;
            mass4[mass4.length - 1 - i][i] = 1;
        }
        for (int l = 0; l < mass4.length; l++) {
            for (int j = 0; j < mass4[l].length; j++) {
                System.out.print(mass4[l][j] + " ");
            }
            System.out.println();
        }
        createMass(5, 12354);

    }
    public static int createMass(int len, int initialValue) {
        int[] mass5 = new int[len];
        for (int i = 0; i < mass5.length; i++) {
            mass5[i] = initialValue;
            System.out.println(mass5[i]);
        }
        return mass5[mass5.length-1];
    }
}
