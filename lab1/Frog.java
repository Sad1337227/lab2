public class Frog extends Animal {

  enum RACE {
    FIRST,
    SECOUND,
    THIRD

  }
  public Frog(String name) { super(name); }

  @Override
  public void speak() {
    System.out.println("Iam Frog,Iam Frog,Iam Frog");
  }

  @Override
  public void move() {
    System.out.println("When i move,I jump,I jump");
  }

  public void habitate() {
    System.out.println("It lives both on land and water");
  }

  public void type() { System.out.println("Its a amphibian"); }

  public void feeding() { System.out.println("Feeds on algae and insects"); }

  public void livespan() { System.out.println("lives upto 10-12 years"); }

  public int age(int DOB, int cuy) { return cuy - DOB; }

  public void agec() { System.out.println("Frog age: " + age(1999, 2021)); }
}
