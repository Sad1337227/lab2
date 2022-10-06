import java.util.Random;

class ParkingSlot {

  public static String[] make_list = {"BMW",        "Audi",  "Maserati",
                                      "Marussia",   "Volvo", "Kia",
                                      "Volkswagen", "Dacia", "Buggati"};

  public static int limit = 50;
  protected String car, car_owner;

  // in seconds
  protected int stay_time;
  protected int payed_for_stay;

  public void randomize_stay(String car_owner) {

    Random rand = new Random();

    this.car_owner = car_owner;
    car = make_list[rand.nextInt(make_list.length)];
    stay_time = rand.nextInt(3600 - 600) + 600;
    payed_for_stay = stay_time * rand.nextInt(10 - 5) + 5;

    System.out.println(car_owner + " has occupied a parking slot for " +
                       stay_time + " seconds");

    return;
  }

  public void handle_stay() {

    if (stay_time > 0)
      stay_time -= 1;

    return;
  }
}