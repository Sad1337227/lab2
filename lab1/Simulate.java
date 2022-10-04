import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Simulate {

  public static void rand_speak(ArrayList<ArrayList<Animal>> zoo) {

    int list_size = zoo.size();

    Random rand = new Random();

    int list1 = rand.nextInt(list_size);
    int list1_size = zoo.get(list1).size();

    Animal lanim = zoo.get(list1).get(rand.nextInt(list1_size));
    Animal ranim = zoo.get(list1).get(rand.nextInt(list1_size));

    if (lanim.gender != ranim.gender) {
      Animal anim = new Cat("baby" + String.valueOf(list1_size - 1));
      zoo.get(list1).add(anim);
      System.out.println(lanim.name + " and " + ranim.name +
                         " have created a baby! Congratz!");
    }
  }

  public static void run_simul() {

    ArrayList<Animal> cat_list = (ArrayList) new ArrayList<Cat>();
    ArrayList<Animal> elephant_list = (ArrayList) new ArrayList<Elephant>();
    ArrayList<Animal> deer_list = (ArrayList) new ArrayList<Deer>();
    ArrayList<Animal> dinosaur_list = (ArrayList) new ArrayList<Dinosaur>();
    ArrayList<Animal> duck_list = (ArrayList) new ArrayList<Duck>();
    ArrayList<Animal> frog_list = (ArrayList) new ArrayList<Frog>();
    ArrayList<Animal> griffin_list = (ArrayList) new ArrayList<Griffin>();
    ArrayList<Animal> koala_list = (ArrayList) new ArrayList<Koala>();

    cat_list.add(new Cat("CAT"));
    cat_list.add(new Cat("CAT1"));
    cat_list.add(new Cat("CAT2"));

    elephant_list.add(new Elephant("elephant"));
    elephant_list.add(new Elephant("elephant1"));
    elephant_list.add(new Elephant("elephant2"));

    deer_list.add(new Deer("deer"));
    deer_list.add(new Deer("deer1"));
    deer_list.add(new Deer("deer2"));

    dinosaur_list.add(new Dinosaur("dinosaur"));
    dinosaur_list.add(new Dinosaur("dinosaur1"));
    dinosaur_list.add(new Dinosaur("dinosaur2"));

    duck_list.add(new Duck("duck"));
    duck_list.add(new Duck("duck1"));
    duck_list.add(new Duck("duck2"));

    frog_list.add(new Frog("frog"));
    frog_list.add(new Frog("frog1"));
    frog_list.add(new Frog("frog2"));

    griffin_list.add(new Griffin("griffin"));
    griffin_list.add(new Griffin("griffin1"));
    griffin_list.add(new Griffin("griffin2"));

    koala_list.add(new Koala("koala"));
    koala_list.add(new Koala("koala1"));
    koala_list.add(new Koala("koala2"));

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
        rand_speak(zoo);
      }
    };

    Timer timer = new Timer("Timer");

    long delay = 1000L;
    timer.schedule(task, delay, delay);
  }
}