package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
/*       Integer[] answer = Arrays.copyOf(array1,array1.length+array2.length);
        for (int i = 0; i < array2.length; i++) {
            answer[i+array1.length]=array2[i];
        }*/
        ArrayList<Integer> arrList= new ArrayList<>(Arrays.asList(array1));
        arrList.addAll(Arrays.asList(array2));
        return arrList.toArray(new Integer[0]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(array));
        for (int i = 0; i < index; i++) {queue.add(queue.remove());}
        return queue.toArray(new Integer[0]);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return Collections.frequency(new ArrayList<>(Arrays.asList(merge(array1,array2))),valueToEvaluate);
    }

    public Integer mostCommon(Integer[] array) {
            /*    Integer[] arr = new Integer[Collections.max(set)+1];
        Arrays.fill(arr, 0);
        ArrayList<Integer> counts = new ArrayList<>(Arrays.asList(arr));
        for (Integer theInt:array) {
            counts.set(theInt,counts.get(theInt)+1);
        }
        */
        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer theInt:set) {
            map.put(Collections.frequency(new ArrayList<>(Arrays.asList(array)),theInt),theInt);
        }
        return map.get(Collections.max(map.keySet()));
    }
}
