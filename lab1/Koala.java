public class Koala extends Animal {

  enum Climate {
    WINTWR,
    SUMMER,
    FALL;
  }

  public Koala(String name) { super(name); }

  public void speak() { System.out.printf("I'm %s. I'm an Koala!", this.name); }

  public void move() { System.out.println("Koala movement"); }

  public void sum() {
    int num1 = 5;
    int num2 = 5;
    int sum = sumOfNumbers(num1, num2);
    System.out.println("The Sum of two numbers is: " + sum);
  }

  public int sumOfNumbers(int a, int b) { return a + b; }
}
