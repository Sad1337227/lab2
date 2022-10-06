import java.util.ArrayList;
import java.util.Random;

// enum E_WEATHER{
//     WINDY,
//     SUNNY,
//     RAINY,
//     FOGGY,
//     CLOUDY,
//     SANDSTORM,
//     THUNDERSTORM,
// }

class Weather {

  private static int weather;

  private static void set_hunger_mult(ArrayList<ArrayList<Animal>> zoo,
                                      int mult) {
    for (ArrayList<Animal> list : zoo)
      for (Animal anim : list)
        anim.hunger_mult = mult;

    return;
  }

  public static void change_weather(ArrayList<ArrayList<Animal>> zoo) {

    Random rand = new Random();
    int val = 0;

    while (val == weather)
      val = rand.nextInt(8);

    weather = val;

    switch (val) {
    // WINDY
    case 0: {
      System.out.println("The weather has changed to WINDY");
      set_hunger_mult(zoo, 2);
      break;
    }
    // SUNNY
    case 1: {
      System.out.println("The weather has changed to SUNNY");
      set_hunger_mult(zoo, 1);
      break;
    }
    // RAINY
    case 2: {
      System.out.println("The weather has changed to RAINY");
      set_hunger_mult(zoo, 3);
      break;
    }
    // FOGGY
    case 3: {
      System.out.println("The weather has changed to FOGGY");
      set_hunger_mult(zoo, 2);
      break;
    }
    // CLOUDY
    case 4: {
      System.out.println("The weather has changed to CLOUDY");
      set_hunger_mult(zoo, 1);
      break;
    }
    // SANDSTORM
    case 5: {
      System.out.println("The weather has changed to SANDSTORM");
      set_hunger_mult(zoo, 4);
      break;
    }
    // THUNDERSTORM
    case 6: {
      System.out.println("The weather has changed to THUNDERSTORM");
      set_hunger_mult(zoo, 5);
      break;
    }
    }
    return;
  }
}