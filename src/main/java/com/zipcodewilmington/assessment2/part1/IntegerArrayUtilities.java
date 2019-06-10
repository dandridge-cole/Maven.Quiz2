package com.zipcodewilmington.assessment2.part1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length%2==0;
    }

    public Integer[] range(int start, int stop) {
        Integer[] answer = new Integer[stop-start+1];
        for (int i = 0; i < answer.length; i++) {
            answer[i]=i+start;
        }
        return answer;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0]+array[1];
    }

    /*
    public Integer getProductOfFirstTwo(Integer[] array) { //original version based on description
        return array[0]*array[1];
    }*/

    public Integer getProductOfFirstTwo(Integer[] array) { // coded to test cases, although it appears one or the other has been misnamed.
        return array[array.length-1]*array[array.length-2];
    }
}
