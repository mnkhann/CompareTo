import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Laptop> laps = new ArrayList<>();
//        ((ArrayList) laps).add("Dell", 4, 200);
//        ((ArrayList) laps).add("Dell", 6, 300);
//        ((ArrayList) laps).add("Dell", 7, 400);

        laps.add(new Laptop("Apple", 16, 1200));
        laps.add(new Laptop("Acer", 8, 800));
        laps.add(new Laptop("Dell", 4, 300));

        Collections.sort(laps);

        for (Laptop l : laps) {
            System.out.println(l);

        }
    }
}



