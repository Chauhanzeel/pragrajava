package assignment.linkedListExample;

import java.util.LinkedList;

public class StoreCityNames {
    public static void main(String[] args){
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Toronto");
        cities.add("Hamilton");
        cities.add("Brampton");
        System.out.println("original list: "+cities);

        cities.addFirst("London");
        cities.addLast("Milton");
        System.out.println("list after adding cities: "+cities);
    }
}
