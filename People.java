import java.util.Random;

public class People {

  String name = "no name";
  String food = "no food";

  int health;

  static private int ind = 0;

  public People(String name) {
    Random rand = new Random();

    health = 100;
    this.name = name + String.valueOf(++ind);

    int g = rand.nextInt(4);

    if (g == 0) {
      food = "carrot";
    }
    if (g == 1) {
      food = "potato";
    }
    if (g == 2) {
      food = "popcorn";
    }
    if (g == 3) {
      food = "corn";
    }
  }

  public String getName() { return name; }

  public String getFood() { return food; }

  public void move(String animalname) {
    System.out.println("I walked near" + name);
  }

  public void feed(String animalname) {
    System.out.println(name + " gave " + food + " to " + animalname);
  };
}