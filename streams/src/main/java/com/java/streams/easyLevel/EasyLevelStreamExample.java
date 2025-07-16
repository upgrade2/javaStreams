package com.java.streams.easyLevel;

import java.util.*;
import java.util.stream.Collectors;

public class EasyLevelStreamExample {

    public final String MAX_VALUE="Max";
    public final String MIN_VALUE="Min";


    public List<Integer> filterEvenNumbers(List<Integer> input){
        return input.stream()
                .filter(i->i%2==0)
                .collect(Collectors.toList());
    }

    public List<String> upperCaseList(List<String> input){
        return input.stream()
                .map(String::toUpperCase).collect(Collectors.toList());
    }

    //Remove Duplicates
   public List<Integer> removeDuplicates(List<Integer> input){
        return input.stream()
                .distinct().collect(Collectors.toList());
   }

   //Max Min
    public Map<String,Integer> maxMin(List<Integer> input){
        Integer max =input.stream()
                .max(Integer::compareTo).orElseThrow(NoSuchElementException::new);
        Integer min = input.stream()
                .min(Integer::compareTo).orElseThrow(NoSuchElementException::new);
       Map<String,Integer> result = new HashMap<>(2);
       result.put(MAX_VALUE,max);
       result.put(MIN_VALUE,min);
       return result;
    }

    //4. Sum of Even
    public Integer sumOfEvenNumbers(List<Integer> input){
        return input.stream()
                .filter(i->i%2==0)
                .mapToInt(Integer::intValue).sum();
    }


    // 5. Square each number
    public List<Integer> squareEachNumber(List<Integer> input) {
        return input.stream()
                .map(i->i*i)
                .collect(Collectors.toList());
    }

    // 6. Find average
    public Double findAverage(List<Integer> input) {
      return input.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0.0);
    }

    public Map<Boolean, List<Integer>> partition(List<Integer> input) {
        return input.stream()
                .collect(Collectors.partitioningBy(i->i%2==0));
    }
}
