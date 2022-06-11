package Lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 20);
        empArray[1] = new Employee("Popov Ivan", "Engineer", "ivivan@mailbox.com", "892312313", 40000, 30);
        empArray[2] = new Employee("Sidorov Ivan", "Engineer", "ivivan@mailbox.com", "892312314", 50000, 40);
        empArray[3] = new Employee("Ovi Ivan", "Engineer", "ivivan@mailbox.com", "892312315", 60000, 50);
        empArray[4] = new Employee("Kiryanov Ivan", "Engineer", "ivivan@mailbox.com", "892312316", 70000, 60);

        System.out.println(empArray[0].getAge());

        int i = 0;
        for (i = 0; i < empArray.length; i++) {
            if (empArray[i].age > 40) {
                empArray[i].print();
            }
        }



        }


    }
