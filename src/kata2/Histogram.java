package kata2;

import java.util.HashMap;

public class Histogram {
    private final HashMap<Integer, Integer> hashmap = new HashMap<>();

    public void fillHistogram(int[] array) {
        for (int actualValue : array) {
            hashmap.put(actualValue,increment(actualValue));
        }
    }
    public int increment(int actualValue){
        if (hashmap.containsKey(actualValue)) return hashmap.get(actualValue) +1;
        return 1;
    }

    public String maxOcurrences() {
        int maxFrecuency = 0;
        int maxKey = Integer.MIN_VALUE;
        for (Integer key : hashmap.keySet()) {
            if (maxFrecuency < hashmap.get(key)) {
                maxFrecuency = hashmap.get(key);
                maxKey = key;
            }
        }
        return ("Key: " +maxKey +", Frecuency: "+ maxFrecuency);
    }
    public String Ocurrences(){
        String string ="";
        for (Integer key : hashmap.keySet()) {
            string += key + " -> " + hashmap.get(key)+ "\n";
        }
            
        return string;
    }
}
