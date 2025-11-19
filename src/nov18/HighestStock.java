package nov18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HighestStock {
    public static void main(String[] args) {
        HashMap<String, Integer> stocks = new HashMap<>();

        stocks.put("Tesla", 450);
        stocks.put("Google", 499);
        stocks.put("Facebook", 460);
        stocks.put("Amazon", 398);
        stocks.put("Apple", 589);

        String highestCompany = null;
        int highestStock = 0;

        Set<Map.Entry<String, Integer>> entrySet = stocks.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > highestStock) {
                highestStock = entry.getValue();
                highestCompany = entry.getKey();
            }
        }

        System.out.println(highestStock);
        System.out.println(highestCompany);
    }
}
