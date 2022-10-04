enum NumberParity { EVEN, ODD }

public class Griffin extends Animal {

  private final String species_name;
  private final String species_latin;
  private final String locationFound;
  private final int sleepDuration_hours;
  private final int movementSpeed_mph;
  private final boolean isExtinct;

  public Griffin(String name) {
    super(name);

    this.species_name = "Griffin";
    this.species_latin = "grȳpus";
    this.locationFound = "Fantasy";
    this.sleepDuration_hours = 8;
    this.movementSpeed_mph = 80;
    this.isExtinct = true;
  }

  @Override
  public void speak() {
    System.out.println("I'm a Griffin and I chirp like a bird, but I can "
                       + "trumpet loudly if angry.");
  }

  @Override
  public void move() {
    System.out.println("I can walk but I really enjoy flying through the sky.");
  }

  public String getMyName() { return this.name; }

  public String getSpeciesName() { return this.species_name; }

  public String getLatinName() { return this.species_latin; }

  public String getLocationFound() { return this.locationFound; }

  public int getSleepDuration() { return this.sleepDuration_hours; }

  public int getMovementSpeed() { return this.movementSpeed_mph; }

  public boolean getIsExtinct() { return this.isExtinct; }

  public static NumberParity calculateSumParity(int num1, int num2) {
    double sum = num1 + num2;
    double calc = sum;

    boolean isEven = true;
    for (int i = 0; i < sum; i++) {
      isEven = !isEven;
    }
    return (isEven) ? NumberParity.EVEN : NumberParity.ODD;
  }
}
