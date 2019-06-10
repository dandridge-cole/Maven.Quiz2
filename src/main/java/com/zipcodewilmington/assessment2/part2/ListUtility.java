package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUtility {
    List<Integer> theList = new ArrayList<>();

    public Boolean add(Integer i) {
        return theList.add(i);
    }

    public Integer size() {
        return theList.size();
    }

    public List<Integer> getUnique() {
        List<Integer> uniqList = new ArrayList<>();
        for (Integer theInt:theList) if(!uniqList.contains(theInt)) uniqList.add(theInt);
        return uniqList;
    }

    public String join() {
        String answer=theList.toString();
        return answer.substring(1,answer.length()-1);
    }

    public Integer mostCommon() {
        return new ArrayUtility().mostCommon(theList.toArray(new Integer[0]));
    }

    public Boolean contains(Integer valueToAdd) {
        return theList.contains(valueToAdd);
    }
}
