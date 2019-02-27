package com.zipcodewilmington.assessment2.part1;


public class WuTangConcatenator {
    public Integer input;
    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public Boolean isWu() {
        Boolean answer = false;
        if (input % 3 == 0){
            answer = true;
        }
        return answer;
    }

    public Boolean isTang() {
        Boolean answer = false;
        if (input % 5 == 0){
            answer = true;
        }
        return answer;
    }

    public Boolean isWuTang() {
        Boolean answer = false;
        if (input % 3 == 0 && input % 5 == 0){
            answer = true;
        }
        return answer;
    }
}
