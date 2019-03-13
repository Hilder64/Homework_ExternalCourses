package task_collections;

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        List<Integer> sequence = new ArrayList<>();
        int[] arr = {4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7};
        for (int value : arr) {
            sequence.add(value);
        }

        Map<Integer, Integer> map = new TreeMap<Integer, Integer>() {
            @Override
            public String toString() {
                Iterator<Map.Entry<Integer,Integer>> i = entrySet().iterator();
                if (! i.hasNext())
                    return "";

                StringBuilder sb = new StringBuilder();
                for (;;) {
                    Map.Entry<Integer,Integer> e = i.next();
                    Integer key = e.getKey();
                    Integer value = e.getValue();
                    sb.append(key);
                    sb.append('-');
                    sb.append(value);
                    if (! i.hasNext())
                        return sb.toString();
                    sb.append('\n');
                }
            }
        };

        for (Integer value : sequence) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }

        String s = map.toString();

        System.out.println(map);
    }
}
