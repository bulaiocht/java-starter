package lesson12;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Bruce", "Willis");
        treeMap.put("Arnold", "Schwarz");
        treeMap.put("Jackie", "Chan");
        treeMap.put("Sylvester", "Stallone");
        treeMap.put("Chuck", "Norris");

        for(Map.Entry tree : treeMap.entrySet()){
            System.out.println(tree.getKey()+" "+ tree.getValue());
        }

        // Create a tree map
        TreeMap<String, Double> tradeMarkMap = new TreeMap<>();

        // Put elements to the map
        tradeMarkMap.put("Zara", new Double(8284.37));
        tradeMarkMap.put("Bershka", new Double(354.11));
        tradeMarkMap.put("Cropp", new Double(2363.00));
        tradeMarkMap.put("Stradivarius", new Double(78.12));
        tradeMarkMap.put("Pull & Bear", new Double(-25.34));

        // Lambda Example
        tradeMarkMap.forEach((key, value) -> {
            System.out.println(key + " = " + value);
        });

        System.out.println("--------------------------------------------------------");

        // Get a set of the entries
        Set set = tradeMarkMap.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry entryMap = (Map.Entry)i.next();
            System.out.print(entryMap.getKey() + ": ");
            System.out.println(entryMap.getValue());
        }
        System.out.println();

        // Deposit 1000 into Zara's account
        double balance = tradeMarkMap.get("Zara");
        tradeMarkMap.put("Zara", balance + 1000);
        System.out.println("Zara's new balance: " + tradeMarkMap.get("Zara"));


        //Natural ordering of User
        Map<User, String> userMap = new TreeMap(new UserSalaryComparator());

        userMap.put(new User("Ni","Lompson",9826), "My Name 1");
        userMap.put(new User("Deryl","Logan",45986), "My Name 2");
        userMap.put(new User("Andriy","Shevchenko", 96), "My Name 3");
        userMap.put(new User("Pedro","Gonzales",9), "My Name 4");

        System.out.println(userMap.toString());

        Set keySet = userMap.entrySet();
        for ( Object user : keySet) {
            System.out.println(user);
        }
    }

}
