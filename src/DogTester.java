import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Random;

public class DogTester {
    public static void main(String[] args) {
        ArrayList<ShowDog> dogs = new ArrayList<ShowDog>();
        RandomDogFactory rdf = new RandomDogFactory();
        for (int i = 0; i < 100; i++) {
            dogs.add(rdf.createShowDog());
        }
        for (int i = 0; i < 1000; i++) {
            dogs.get((int)(Math.random()*100)).awardMedal();
        }
        Comparator<ShowDog> c1 = new Comparator<ShowDog>(){
            @Override
            public int compare(ShowDog o1, ShowDog o2) {
                return Integer.compare(o2.getMedals(), o1.getMedals());
            }
        };
        Collections.sort(dogs, c1);
        for (int i = 0; i < 3; i++) {
            System.out.println(dogs.get(i));
        }
    }
}
