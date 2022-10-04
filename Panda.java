public class Panda extends Animal {

  public Panda(String name) { super(name); }

  @Override
  public void speak() {
    System.out.println("Hi I am a " + this.name + "! I Squeak.. ");
  }

  @Override
  public void move() {
    System.out.println("I am a lazy animal and love to roll on ground");
  }

  public void pandaType() {
    String firstName = "RED";
    String lastName = "PANDA";

    System.out.println(
        "There are 2 types of panda, RED panda ,BLACK-WHITE pandas....");
    String fullName = fullname(firstName, lastName);
    System.out.println("My full name is : " + fullName);
  }

  public String fullname(String fname, String lname) { return fname + lname; }
}
