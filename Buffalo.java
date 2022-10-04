public class Buffalo extends Animal {
  enum COLOR { BLACK, BROWN }

  public Buffalo(String name) { super(name); }

  @Override
  public void speak() {
    System.out.printf("I'm %s. I'm a Buffalo!", this.name);
  }

  @Override
  public void move() {
    System.out.println("I usually walk with four legs");
  }
  //@Override
  public void diet() { System.out.println("I'm a Herbivore"); }

  //@Override
  public void family() { System.out.println("I am from Bovidae family"); }

  //@Override
  public void lifespan() { System.out.println("My life span is 10-20 years"); }

  public double getBuffaloAddition(double morningMilkProduction,
                                   double eveningMilkProduction) {
    return morningMilkProduction + eveningMilkProduction;
  }

  public void Buffalo() {
    double morningMilkProduction = 4.5;
    double eveningMilkProduction = 4.0;
    double perDayMilkProduction =
        getBuffaloAddition(morningMilkProduction, eveningMilkProduction);
    System.out.println(
        "I am " + this.name + ", I produce " + morningMilkProduction +
        "liters Of milk in the morning and " + eveningMilkProduction +
        " liters in the Evening, Overall I will produce " +
        perDayMilkProduction + "\"liters per\" day");
  }
}
