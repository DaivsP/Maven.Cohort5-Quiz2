package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.*;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(array1));
        arrayList.addAll(Arrays.asList(array2));
        return arrayList.toArray(new Integer[0]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] newArray = new Integer[array.length];
        for(int i = 0; i < array.length; i++){
            newArray[(i+(array.length-index)) % array.length ] = array[i];
        }
        return newArray;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        List<Integer> listArray1 = new ArrayList<>();
        List<Integer> listArray2 = new ArrayList<>();
        for (Integer integer: array1) {
            listArray1.add(integer);
        }
        for (Integer integer: array2) {
            listArray2.add(integer);
        }
        Integer counter = 0;
        for (int i = 0; i < listArray1.size(); i++) {
            if (listArray1.get(i) == valueToEvaluate){
                counter++;
            }
        }
        for (int i = 0; i < listArray2.size(); i++) {
            if (listArray2.get(i) == valueToEvaluate){
                counter++;
            }
        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        Integer count = 1, tempCount;
        Integer popular = array[0];
        Integer temp = 0;
        for (int i = 0; i < (array.length - 1); i++)
        {
            temp = array[i];
            tempCount = 0;
            for (int j = 1; j < array.length; j++)
            {
                if (temp == array[j])
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }
}
