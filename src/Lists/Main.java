package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> cityNames = Arrays.asList("Napoli", "Palermo", "Milano");

       // cityNames.set(3, "Tegucigalpa");  // non viene inserito perchè la nostra lista è costituita da 3 elementi
        System.out.println(cityNames);

        List<String> kingOfRome = new ArrayList<>();
        kingOfRome.add("Romolo");
        kingOfRome.add("Numa Pompilio");
        kingOfRome.add("Tullo Ostilio");
        kingOfRome.add("Anco Marzio");
        kingOfRome.add("Tarquinio Prisco");
        kingOfRome.add("Servio Tullio");
        kingOfRome.add("Tarquinio il Superbo");

        System.out.println(kingOfRome);

        String[] kingsOfRomeArray = kingOfRome.toArray(new String[]{});
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}
