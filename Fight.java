import java.util.ArrayList;
import java.util.Random;

public class Fight {

  public static void anim_fight(Animal lAnim, Animal rAnim) {

    int l_size = lAnim.getFightAttributes().size;
    int r_size = lAnim.getFightAttributes().size;

    int l_strength = lAnim.getFightAttributes().strength;
    int r_strength = lAnim.getFightAttributes().strength;

    if (l_size == r_size) {
      System.out.println((l_strength > r_strength ? lAnim.name : rAnim.name) +
                         " has won the fight over " +
                         (l_strength < r_strength ? rAnim.name : lAnim.name));
    } else
      System.out.println((l_size > r_size ? lAnim.name : rAnim.name) +
                         " has won the fight over " +
                         (l_size < r_size ? rAnim.name : lAnim.name));
  }

  public static void generate_fight(ArrayList<ArrayList<Animal>> zoo) {

    int list_size = zoo.size();

    Random rand = new Random();

    int list1 = rand.nextInt(list_size);
    int list2 = rand.nextInt(list_size);

    int list1_size = zoo.get(list1).size();
    int list2_size = zoo.get(list2).size();

    anim_fight(zoo.get(list1).get(rand.nextInt(list1_size)),
               zoo.get(list2).get(rand.nextInt(list2_size)));
  }
}