enum SuperPlanet {
  EARTH,
  JUPITER,
  VENUS,
  NEPTUNE,
  URANUS,
}

public class Elephant extends Animal {

  public Elephant(String name) { super(name); }

  @Override
  public void speak() {
    System.out.printf(" I'm %s.I'm an Elephant!", this.name);
  }

  @Override
  public void move() {
    System.out.println(
        " I could not able to swim in water but would like to walk!. ");
  }

  public void profess() {
    double a = 2.5;
    int b = 5;
    double c = getElephantAddition(a, b);
    System.out.printf("I know ElephantAddition! %4.2f plus %d is %4.2f \n", a,
                      b, c);
  }

  public double getElephantAddition(double valueOne, int valueTwo) {
    return valueOne + valueTwo;
  }
}
