package ConstructorPerson;
public class Worked extends Person {
    private int minSalary;
    private int maxSalary;

    public Worked(String name, int age, double height, double weight, int money, int minSalary, int maxSalary) {
        super(name, age, height, weight, money);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии.");
    }
}
