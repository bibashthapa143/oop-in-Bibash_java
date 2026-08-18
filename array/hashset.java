import java.util.HashSet;
import java.util.Set;

public class hashset {
  public static void main(String[] args )
  {
    Set<Integer>set= new HashSet<>();
    set.add(10);
    set.add(20);
    set.add(30);
    set.add(10); //duplicate gets ignored

    System.out.println(set);

  }
  
}
