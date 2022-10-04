public class Deer extends Animal {

  public Deer(String name) { super(name); }

  @Override
  public void speak() {
    System.out.println("Iam deer, Iam deer, Iam deer");
  }

  @Override
  public void move() {
    System.out.println("When i move, I run, I can run fast");
  }

  public void place() { System.out.println("It lives only on land"); }

  public void ismamal() { System.out.println("I am a mamal"); }

  public void food() { System.out.println("Feeds on plants"); }
}
