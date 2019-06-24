
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Matti", 150000));
        people.add(new Person("Pekka", 3000));
        people.add(new Person("Mikko", 300));
        people.add(new Person("Arto", 10));
        people.add(new Person("Merja", 500));
        people.add(new Person("Pertti", 80));

        System.out.println(people);

        System.out.println("Really? " + people.get(0).compareTo(people.get(1)));
        if(people.get(0) instanceof Comparable)
            System.out.println("Yes it is?");
        /*
         * When you have implemented the compareTo-method, remove comment below.
         */
        Collections.sort(people);
        System.out.println(people);

    }
}
