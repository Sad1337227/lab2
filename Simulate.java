import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Simulate {
  public static String[] names = {
      "Mike", "John", "Sasha", "Yuki", "Charly", "Chop-Chop", "Elbrus",
      "Diner", "Albert", "Pablo", "Marces", "Marius", "Aurel", "Ion" };

  public static void rand_speak(ArrayList<ArrayList<Animal>> zoo,
      ArrayList<People> people_list) {

    int list_size = zoo.size();
    Random rand = new Random();

    int namebaby = rand.nextInt(14);
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

  public static void run_simul() {

    ArrayList<Animal> cat_list = (ArrayList) new ArrayList<Animal>();
    ArrayList<Animal> elephant_list = (ArrayList) new ArrayList<Animal>();
    ArrayList<Animal> deer_list = (ArrayList) new ArrayList<Animal>();
    ArrayList<Animal> dinosaur_list = (ArrayList) new ArrayList<Animal>();
    ArrayList<Animal> duck_list = (ArrayList) new ArrayList<Animal>();
    ArrayList<Animal> frog_list = (ArrayList) new ArrayList<Animal>();
    ArrayList<Animal> griffin_list = (ArrayList) new ArrayList<Animal>();
    ArrayList<Animal> koala_list = (ArrayList) new ArrayList<Animal>();
    ArrayList<People> people_list = (ArrayList) new ArrayList<People>();

    Random rand = new Random();
    int name1 = rand.nextInt(14);
    cat_list.add(new Animal(names[name1], "Cat"));
    name1 = rand.nextInt(14);
    cat_list.add(new Animal(names[name1], "Cat"));
    name1 = rand.nextInt(14);
    cat_list.add(new Animal(names[name1], "Cat"));

    name1 = rand.nextInt(14);
    elephant_list.add(new Animal(names[name1], "Elephant"));
    name1 = rand.nextInt(14);
    elephant_list.add(new Animal(names[name1], "Elephant"));
    name1 = rand.nextInt(14);
    elephant_list.add(new Animal(names[name1], "Elephant"));

    name1 = rand.nextInt(14);
    deer_list.add(new Animal(names[name1], "Deer"));
    name1 = rand.nextInt(14);
    deer_list.add(new Animal(names[name1], "Deer"));
    name1 = rand.nextInt(14);
    deer_list.add(new Animal(names[name1], "Deer"));

    name1 = rand.nextInt(14);
    dinosaur_list.add(new Animal(names[name1], "Dinosaur"));
    name1 = rand.nextInt(14);
    dinosaur_list.add(new Animal(names[name1], "Dinosaur"));
    name1 = rand.nextInt(14);
    dinosaur_list.add(new Animal(names[name1], "Dinosaur"));

    name1 = rand.nextInt(14);
    duck_list.add(new Animal(names[name1], "Duck"));
    name1 = rand.nextInt(14);
    duck_list.add(new Animal(names[name1], "Duck"));
    name1 = rand.nextInt(14);
    duck_list.add(new Animal(names[name1], "Duck"));

    name1 = rand.nextInt(14);
    frog_list.add(new Animal(names[name1], "Frog"));
    name1 = rand.nextInt(14);
    frog_list.add(new Animal(names[name1], "Frog"));
    name1 = rand.nextInt(14);
    frog_list.add(new Animal(names[name1], "Frog"));

    name1 = rand.nextInt(14);
    griffin_list.add(new Animal(names[name1], "Griffin"));
    name1 = rand.nextInt(14);
    griffin_list.add(new Animal(names[name1], "Griffin"));
    name1 = rand.nextInt(14);
    griffin_list.add(new Animal(names[name1], "Griffin"));

    name1 = rand.nextInt(14);
    koala_list.add(new Animal(names[name1], "Koala"));
    name1 = rand.nextInt(14);
    koala_list.add(new Animal(names[name1], "Koala"));
    name1 = rand.nextInt(14);
    koala_list.add(new Animal(names[name1], "Koala"));

    name1 = rand.nextInt(14);
    people_list.add(new People(names[name1]));
    name1 = rand.nextInt(14);
    people_list.add(new People(names[name1]));
    name1 = rand.nextInt(14);
    people_list.add(new People(names[name1]));
    name1 = rand.nextInt(14);
    people_list.add(new People(names[name1]));
    name1 = rand.nextInt(14);
    people_list.add(new People(names[name1]));

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
        RandEvent.anim_hurt_ppl(zoo, people_list);
        RandEvent.new_customer_came(people_list);
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
      public void run() {
        Weather.change_weather(zoo);
      }
    };

    long weather_delay = 10000L;
    weather_timer.schedule(weather_task, weather_delay, weather_delay);
  }
}