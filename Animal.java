import java.util.Random;

public class Animal {

  String name = "no name";
  String gender;
  FightAttrib fightAttrib;
  String type;
  int foodline;
  int hunger_mult;

  public Animal(String name, String type) {
    Random rand = new Random();

    this.name = name;
    this.type = type;
    int g = rand.nextInt(100);
    int i = rand.nextInt(100);
    this.gender = (g % 2 == 0 ? "FEMALE" : "MALE");
    this.foodline = i;

    fightAttrib = new FightAttrib();

    fightAttrib.size = rand.nextInt(3);
    fightAttrib.strength = rand.nextInt(3);
  }

  public String getName() { return name; }

  public String getGender() { return gender; }

  public void setGender(String gender) { this.gender = gender; }

  public FightAttrib getFightAttributes() { return fightAttrib; }

  public void speak() {
    System.out.println("I am " + type + ", my name is " + name);
  }
}
