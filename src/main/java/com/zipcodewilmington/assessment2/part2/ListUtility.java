package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    List<Integer> answer = new ArrayList<>();

    public Boolean add(Integer i) {
        return answer.add(i);
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
        this.answer = answer;
        return answer.contains(valueToAdd);
    }
}
