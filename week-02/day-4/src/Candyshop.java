/**
 * Created by Connor on 2017.03.23..
 */
import java.util.*;

public class Candyshop{
  public static void main(String... args){
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    // Accidentally we added "2" and "false" to the list.
    // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
    // No, don't just remove the lines

    int indexOfToChange1 = arrayList.indexOf(2);
    arrayList.set(indexOfToChange1, "Croissant");

    int indexOfToChange2 = arrayList.indexOf(false);
    arrayList.set(indexOfToChange2, "Ice cream");

    System.out.println(arrayList);
  }
}
