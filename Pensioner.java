package ConstructorPerson;

public class Pensioner extends Person { // екстенс обозначает расширение класса Персон
    private double pension;



    public Pensioner(String name, int age, double height, double weight, int money, double pension) {
        super(name, age, height, weight, money);// супер -это конструктор Персон
        this.pension = pension;



    }
    public double getPension() {
        return pension;

    }

    public void setPension(double pension) {
        this.pension = pension;
    }


    @Override
   public void die() {
        double calculatedPension = (getAge() - 50) * pension;
        System.out.println("Этот пенсионер умер, он заработал: " + calculatedPension);
    }
}
