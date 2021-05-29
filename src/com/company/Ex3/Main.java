package com.company.Ex3;

/*Create a method that takes the map as a parameter, where the key is string and the value number, and then
prints each map element to the console in the format: Key: <k>, Value: <v>. There should be a comma at the
end of every line except the last, and a period at the last.
Example:
Key: Java, Value: 18,
Key: Python, Value: 1,
…
Key: PHP, Value: 0 */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> mapItems = new HashMap<>();
        mapItems.put("Java", 23);
        mapItems.put("Python", 1);
        mapItems.put("PHP", 0);
        printMap(mapItems);
    }

    public static void printMap(Map<String, Integer> map) {
        int index = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(index == map.size()-1){
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue() + ".");
            }
            else{System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue() + ",");
            }
            index++;


        }
    }


}
