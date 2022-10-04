public class Cat extends Animal {

  public Cat(String name) { super(name); }

  @Override
  public void speak() {
    System.out.println(" I am a Cat.. " + this.name);
  }

  @Override
  public void move() {
    System.out.println(" I can run faster");
  }

  public void profess() {
    double a = 2.5;
    int b = 2;
    double c = getCatAddition(a, b);
    System.out.printf("I know AardvarkAddition! %4.2f plus %d is %4.2f \n", a,
                      b, c);
  }

  public double getCatAddition(double valueOne, int valueTwo) {
    return valueOne + valueTwo;
  }

  public enum Animal {
    Arvicolinae,
    Cat,
    Cow,
  }
}
