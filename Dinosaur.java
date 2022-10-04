public class Dinosaur extends Animal {

  public Dinosaur(String name) { super(name); }

  enum level { sunday, monday, tuesday }

  @Override
  public void speak() {
    System.out.printf("i'm %s. I am a DINOSAURRRRR....!\n", this.name);
  }

  @Override
  public void move() {
    System.out.println("I hunt in the FALCON CAVE");
  }

  public int area(int l, int b) { return l * b; }

  public void value() {
    System.out.println("At " + area(3, 2) + "th"
                       + " Avenue");
  }
}
