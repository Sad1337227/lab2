import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Simulate {
  public static String[] names = {"Tolik",  "Mike",   "John",      "Sasha",
                                  "Yuki",   "Charly", "Chop-Chop", "Elbrus",
                                  "Diner",  "Albert", "Pablo",     "Marces",
                                  "Marius", "Aurel",  "Ion",       "Anatolie"};

  public static void rand_speak(ArrayList<ArrayList<Animal>> zoo,
                                ArrayList<People> people_list) {

    int list_size = zoo.size();
    Random rand = new Random();

    int namebaby = rand.nextInt(Simulate.names.length);
    int list1 = rand.nextInt(list_size);
    int list1_size = zoo.get(list1).size();

    Animal lanim = zoo.get(list1).get(rand.nextInt(list1_size));
    Animal ranim = zoo.get(list1).get(rand.nextInt(list1_size));
    String animaltype = lanim.type;

    if (lanim.gender != ranim.gender) {
      Animal anim = new Animal(names[namebaby], animaltype);
      zoo.get(list1).add(anim);
      System.out.println(lanim.name + " and " + ranim.name +
                         " have created a baby " + names[namebaby] +
                         "! Congratz!"
                         + "\n"
                         + "I am " + names[namebaby] + " " + animaltype);
    }
  }

  public static void add_park_slot(ArrayList<ParkingSlot> park_slots,
                                   People person) {

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

  public static void remove_park_slot(ArrayList<ParkingSlot> park_slots,
                                      People person) {

    if (park_slots.size() < 1)
      return;

    for (ParkingSlot park_slot : park_slots)
      if (park_slot.car_owner == person.name) {
        park_slots.remove(park_slot);
        return;
      }

    return;
  }

  public static void handle_customers(ArrayList<People> ppl,
                                      ArrayList<ParkingSlot> park_slots) {

    for (ParkingSlot park_slot : park_slots) {
      park_slot.handle_stay();
      if (park_slot.stay_time == 0) {
        for (People person : ppl) {
          if (person.name == park_slot.car_owner) {
            remove_park_slot(park_slots, person);
            ppl.remove(person);
            System.out.println(
                person.name +
                " has left the zoo because their parking stay time has expired!!");
            return;
          }
        }
      }
    }
  }

  public static void create_person(ArrayList<People> ppl, int rand_index,
                                   ArrayList<ParkingSlot> park_slots) {

    People pers = new People(names[rand_index]);
    ppl.add(pers);
    add_park_slot(park_slots, pers);

    return;
  }

  public static void run_simul() {

    ArrayList<Animal> cat_list = new ArrayList<Animal>();
    ArrayList<Animal> elephant_list = new ArrayList<Animal>();
    ArrayList<Animal> deer_list = new ArrayList<Animal>();
    ArrayList<Animal> dinosaur_list = new ArrayList<Animal>();
    ArrayList<Animal> duck_list = new ArrayList<Animal>();
    ArrayList<Animal> frog_list = new ArrayList<Animal>();
    ArrayList<Animal> griffin_list = new ArrayList<Animal>();
    ArrayList<Animal> koala_list = new ArrayList<Animal>();
    ArrayList<People> people_list = new ArrayList<People>();
    ArrayList<ParkingSlot> park_slots = new ArrayList<ParkingSlot>();

    Random rand = new Random();
    int name1 = rand.nextInt(Simulate.names.length);
    cat_list.add(new Animal(names[name1], "Cat"));
    name1 = rand.nextInt(Simulate.names.length);
    cat_list.add(new Animal(names[name1], "Cat"));
    name1 = rand.nextInt(Simulate.names.length);
    cat_list.add(new Animal(names[name1], "Cat"));

    name1 = rand.nextInt(Simulate.names.length);
    elephant_list.add(new Animal(names[name1], "Elephant"));
    name1 = rand.nextInt(Simulate.names.length);
    elephant_list.add(new Animal(names[name1], "Elephant"));
    name1 = rand.nextInt(Simulate.names.length);
    elephant_list.add(new Animal(names[name1], "Elephant"));

    name1 = rand.nextInt(Simulate.names.length);
    deer_list.add(new Animal(names[name1], "Deer"));
    name1 = rand.nextInt(Simulate.names.length);
    deer_list.add(new Animal(names[name1], "Deer"));
    name1 = rand.nextInt(Simulate.names.length);
    deer_list.add(new Animal(names[name1], "Deer"));

    name1 = rand.nextInt(Simulate.names.length);
    dinosaur_list.add(new Animal(names[name1], "Dinosaur"));
    name1 = rand.nextInt(Simulate.names.length);
    dinosaur_list.add(new Animal(names[name1], "Dinosaur"));
    name1 = rand.nextInt(Simulate.names.length);
    dinosaur_list.add(new Animal(names[name1], "Dinosaur"));

    name1 = rand.nextInt(Simulate.names.length);
    duck_list.add(new Animal(names[name1], "Duck"));
    name1 = rand.nextInt(Simulate.names.length);
    duck_list.add(new Animal(names[name1], "Duck"));
    name1 = rand.nextInt(Simulate.names.length);
    duck_list.add(new Animal(names[name1], "Duck"));

    name1 = rand.nextInt(Simulate.names.length);
    frog_list.add(new Animal(names[name1], "Frog"));
    name1 = rand.nextInt(Simulate.names.length);
    frog_list.add(new Animal(names[name1], "Frog"));
    name1 = rand.nextInt(Simulate.names.length);
    frog_list.add(new Animal(names[name1], "Frog"));

    name1 = rand.nextInt(Simulate.names.length);
    griffin_list.add(new Animal(names[name1], "Griffin"));
    name1 = rand.nextInt(Simulate.names.length);
    griffin_list.add(new Animal(names[name1], "Griffin"));
    name1 = rand.nextInt(Simulate.names.length);
    griffin_list.add(new Animal(names[name1], "Griffin"));

    name1 = rand.nextInt(Simulate.names.length);
    koala_list.add(new Animal(names[name1], "Koala"));
    name1 = rand.nextInt(Simulate.names.length);
    koala_list.add(new Animal(names[name1], "Koala"));
    name1 = rand.nextInt(Simulate.names.length);
    koala_list.add(new Animal(names[name1], "Koala"));

    name1 = rand.nextInt(Simulate.names.length);
    create_person(people_list, name1, park_slots);
    name1 = rand.nextInt(Simulate.names.length);
    create_person(people_list, name1, park_slots);
    name1 = rand.nextInt(Simulate.names.length);
    create_person(people_list, name1, park_slots);
    name1 = rand.nextInt(Simulate.names.length);
    create_person(people_list, name1, park_slots);
    name1 = rand.nextInt(Simulate.names.length);
    create_person(people_list, name1, park_slots);
    name1 = rand.nextInt(Simulate.names.length);
    create_person(people_list, name1, park_slots);

    ArrayList<ArrayList<Animal>> zoo = new ArrayList<ArrayList<Animal>>();

    zoo.add(cat_list);
    zoo.add(elephant_list);
    zoo.add(deer_list);
    zoo.add(dinosaur_list);
    zoo.add(duck_list);
    zoo.add(frog_list);
    zoo.add(griffin_list);
    zoo.add(koala_list);

    TimerTask task = new TimerTask() {
      public void run() {
        Fight.generate_fight(zoo);
        rand_speak(zoo, people_list);
        RandEvent.anim_hurt_ppl(zoo, people_list, park_slots);
        RandEvent.new_customer_came(people_list, park_slots);
        handle_customers(people_list, park_slots);
      }
    };

    Timer timer = new Timer("Timer");

    long delay = 1000L;
    timer.schedule(task, delay, delay);

    TimerTask task1 = new TimerTask() {
      public void run() {

        int list_size = zoo.size();
        Random rand = new Random();

        int list1 = rand.nextInt(list_size);
        int list1_size = zoo.get(list1).size();

        Animal fanim = zoo.get(list1).get(rand.nextInt(list1_size));
        int ind = rand.nextInt(people_list.size());

        for (ArrayList<Animal> arrayList : zoo) {
          for (Animal iterable_element : arrayList) {
            iterable_element.foodline -= 5 * iterable_element.hunger_mult;
          }
        }

        if (fanim.foodline <= 0) {
          people_list.get(ind).feed(fanim.name);
          // fanim.sound();
          fanim.foodline = 100;
        }
      }
    };

    Timer timer1 = new Timer("Timer1");

    long delay1 = 1500L;
    timer1.schedule(task1, delay1, delay1);

    Timer weather_timer = new Timer("weather_timer");
    TimerTask weather_task = new TimerTask() {
      public void run() { Weather.change_weather(zoo); }
    };

    long weather_delay = 10000L;
    weather_timer.schedule(weather_task, weather_delay, weather_delay);
  }
}