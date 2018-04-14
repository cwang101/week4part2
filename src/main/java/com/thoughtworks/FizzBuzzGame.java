package com.thoughtworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    private Map<Integer,String> map=new HashMap<>();

    public FizzBuzzGame() {
        map.put(3,"Fizz");
        map.put(5,"Buzz");
        map.put(7,"Whizz");
    }

    public void start(int count) {
        for(int i=1;i<=count;i++){
            results.add(getReport(i));
        }
    }

    public List<String> getResults() {
        return results;
    }

    public String getReport(int num){
        if(String.valueOf(num).contains("3")){
            return "Fizz";
        }
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            if(num%entry.getKey()==0){
                sb.append(entry.getValue());
            }
        }
        if(sb.toString().length()<=0){
            return String.valueOf(num);
        }
        return sb.toString();
    }
}


