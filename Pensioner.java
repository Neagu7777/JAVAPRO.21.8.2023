package ConstructorPerson;

public class Pensioner extends Person { // екстенс обозначает расширение класса Персон
    private double pension;
    private int age;


    public Pensioner(String name, int age, double height, double weight, int money, double pension) {
        super(name, age, height, weight, money);// супер -это конструктор Персон
        this.pension = pension;


    }

    @Override
   public void die() {
        double calculatedPension = (age - 50) * pension;
        System.out.println("Этот пенсионер умер, он заработал: " + calculatedPension);
    }
}