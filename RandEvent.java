import java.util.ArrayList;
import java.util.Random;

class RandEvent {

  private static long last_event_occured;

  public static void add_new_customer(ArrayList<People> ppl) {

    Random rand = new Random();

    int rand_name = rand.nextInt(Simulate.names.length);
    String name = Simulate.names[rand_name];

    ppl.add(new People(name));

    System.out.println(name + " came to the zoo");

    return;
  }

  public static void customer_left(ArrayList<People> ppl) {

    Random rand = new Random();

    int rand_ind = rand.nextInt(ppl.size());

    System.out.println(ppl.get(rand_ind) + " came to the zoo");

    ppl.remove(rand_ind);

    return;
  }

  public static void anim_hurt_ppl(ArrayList<ArrayList<Animal>> zoo,
      ArrayList<People> ppl) {

    if (ppl.size() <= 1)
      return;

    Random rand = new Random();
    int randval = rand.nextInt(100);

    if (randval != 1)
      return;

    int randh = rand.nextInt(ppl.size());
    int randl = rand.nextInt(zoo.size());
    int randa = rand.nextInt(zoo.get(randl).size());
    int randd = rand.nextInt(101);

    ppl.get(randh).health -= randd;

    if (ppl.get(randh).health <= 0) {
      System.out.println(zoo.get(randl).get(randa).name + " has killed " +
          ppl.get(randh).name);

      add_new_customer(ppl);
      ppl.remove(randh);
    } else {
      System.out.println(zoo.get(randl).get(randa).name + " has damaged " +
          ppl.get(randh).name + " for " + randd + " damage");
    }
    last_event_occured = System.currentTimeMillis();

    return;
  }

  public static void new_customer_came(ArrayList<People> ppl) {

    Random rand = new Random();
    int randval = rand.nextInt(50);

    if (randval != 1)
      return;

    add_new_customer(ppl);

    return;
  }
}