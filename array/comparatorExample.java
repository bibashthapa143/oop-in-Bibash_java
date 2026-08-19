import java.util.*;


public class comparatorExample {
  public static void main(String[] args){
    ArrayList<Integer> numbers = new ArrayList<>();
    
    numbers.add(40);
    numbers.add(10);
    numbers.add(30);
    numbers.add(20);

    numbers.sort(Comparator.naturalOrder());

    System.out.println(numbers);

    numbers.sort(Comparator.reverseOrder());

    System.out.println(numbers);



  }
  
}
