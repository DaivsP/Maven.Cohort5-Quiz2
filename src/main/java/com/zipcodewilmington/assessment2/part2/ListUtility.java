package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListUtility {
    ArrayUtility arrayUtility = new ArrayUtility();
    List<Integer> answer = new ArrayList<>();

    public Boolean add(Integer i) {
        return answer.add(i);
    }

    public Integer size() {
        List<Integer> list = new ArrayList<>();
        return answer.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(answer);
        answer.clear();
        answer.addAll(set);
        return answer;
    }

    public String join() {
        StringBuilder sb = new StringBuilder();
        for (Integer integer : answer) {
            sb.append(integer);
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public Integer mostCommon() {
            return arrayUtility.mostCommon(answer.toArray(new Integer[answer.size()]));

    }

    public Boolean contains(Integer valueToAdd) {
        this.answer = answer;
        return answer.contains(valueToAdd);
    }
}
