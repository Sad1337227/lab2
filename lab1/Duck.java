enum MagicMonth {
  JAN,
  FEB,
  MARCH,
  APRIL,
  MAY,
  JUNE,
  JULY,
  AUG,
  SEP,
  OCT,
  NOV,
  DEC,
}

public class Duck extends Animal {

  public Duck(String name) { super(name); }

  @Override
  public void speak() {
    System.out.println("I am Duck named " + this.name);
  }

  public void eat() { System.out.println("I eat earthworms"); }

  @Override
  public void move() {
    System.out.println("I use feet to swim");
  }

  public int duckEggsProduction(int monthlyEggsProduction, int monthsinYear) {
    return monthlyEggsProduction * monthsinYear;
  }

  public void studentDuck() {
    int monthlyEggsProduction = 3;
    int monthsinYear = 12;
    int yearlyEggsProduction =
        duckEggsProduction(monthlyEggsProduction, monthsinYear);
    System.out.println("Yearly Eggs Production of Duck is " +
                       yearlyEggsProduction);
  }
}
