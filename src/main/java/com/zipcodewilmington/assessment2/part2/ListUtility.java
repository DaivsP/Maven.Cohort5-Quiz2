package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    public Boolean add(int i) {
        return contains(i);
    }

    public Integer size() {
        List<Integer> list = new ArrayList<>();
        return list.size();
    }

    public List<Integer> getUnique() {
        return null;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        List<Integer> list = new ArrayList<>();
        list.add(valueToAdd);
        if (list.isEmpty()){
            return false;
        }
        return true;
    }
}
