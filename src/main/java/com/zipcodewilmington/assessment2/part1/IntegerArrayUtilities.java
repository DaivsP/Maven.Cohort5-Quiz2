package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;
import java.util.List;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        Boolean answer = false;
        Integer arrayLength = array.length;
        if (arrayLength % 2 == 0){
            answer = true;
        }
        return answer;
    }

    public Integer[] range(int start, int stop) {
        List<Integer> answer = new ArrayList<>();
        for (Integer i = start; i <= stop; i++) {
            answer.add(i);
        }
        return answer.toArray(new Integer[0]);
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer firstNumber = array[0];
        Integer secondNumber = array[1];
        return firstNumber+secondNumber;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer firstNumber = array[0];
        Integer secondNumber = array[1];
        return firstNumber*secondNumber;
    }
}
