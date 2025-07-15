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


    public static void main(String[] args) {
        //1. Even Numbers filter
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for(Integer i : new EasyLevelStreamExample().filterEvenNumbers(numbers)){
            System.out.print(i+" ");
        }
        System.out.println("");
        //2. Uppercase
        List<String> names = Arrays.asList("john", "jane", "doe");
        for(String s : new EasyLevelStreamExample().upperCaseList(names)){
            System.out.print(s+" ");
        }
        System.out.println("");
        //3. Remove Duplicates
        List<Integer> duplicateNumberList = Arrays.asList(1,1,2,2,3,3,4,5,6,7);
        for(Integer i:new EasyLevelStreamExample().removeDuplicates(duplicateNumberList)){
            System.out.print(i+" ");
        }
        System.out.println("");
        //4. Sum of Even
        System.out.println(" Sum of Even numbers :"+new EasyLevelStreamExample().sumOfEvenNumbers(duplicateNumberList));



    }
}
