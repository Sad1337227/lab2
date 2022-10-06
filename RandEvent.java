import java.util.ArrayList;
import java.util.Random;

class RandEvent {

  // private static long last_event_occured;

  public static void add_new_customer(ArrayList<People> ppl,
                                      ArrayList<ParkingSlot> park_slots) {

    Random rand = new Random();

    int rand_name = rand.nextInt(Simulate.names.length);
    String name = Simulate.names[rand_name];
    People person = new People(name);

    ppl.add(person);

    System.out.println(person.name + " welcome to the zoo!!");

    if (park_slots.size() > ParkingSlot.limit) {
      System.out.println(
          "Unfortunately " + person.name +
          " couldn't get a parking slot, because the parking is full!!");
      return;
    }

    ParkingSlot park_slot = new ParkingSlot();
    park_slot.randomize_stay(person.name);

    park_slots.add(park_slot);

    return;
  }

  public static void anim_hurt_ppl(ArrayList<ArrayList<Animal>> zoo,
                                   ArrayList<People> ppl,
                                   ArrayList<ParkingSlot> park_slots) {

    if (ppl.size() <= 1)
      return;

    Random rand = new Random();
    int randval = rand.nextInt(25);

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

      add_new_customer(ppl, park_slots);
      ppl.remove(randh);
    } else {
      System.out.println(zoo.get(randl).get(randa).name + " has damaged " +
                         ppl.get(randh).name + " for " + randd + " damage");
    }
    // last_event_occured = System.currentTimeMillis();

    return;
  }

  public static void new_customer_came(ArrayList<People> ppl,
                                       ArrayList<ParkingSlot> park_slots) {

    Random rand = new Random();
    int randval = rand.nextInt(6);

    if (randval != 1)
      return;

    add_new_customer(ppl, park_slots);

    return;
  }
}