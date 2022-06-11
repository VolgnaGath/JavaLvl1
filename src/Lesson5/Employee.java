package Lesson5;

public class Employee {
    private String bio;
    private String position;
    private String email;
    private String phone;
    private double salary;
    public int age;

    public Employee(String bio, String position, String email, String phone, double salary, int age) {
        this.bio = bio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getBio() {
        return bio;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print()  {
        System.out.println(bio + ", "+ position + ", " + email + ", " + phone + ", " + salary + ", " + age);
    }
}

