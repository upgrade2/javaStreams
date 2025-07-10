package com.java.streams.easyLevel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EasyLevelStreamExample {

    public List<Integer> filterEvenNumbers(List<Integer> input){
        return input.stream()
                .filter(i->i%2==0)
                .collect(Collectors.toList());
    }

    public List<String> upperCaseList(List<String> input){
        return input.stream()
                .map(String::toUpperCase).collect(Collectors.toList());
    }




    public static void main(String[] args) {
        //1. Even Numbers filter
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for(Integer i : new EasyLevelStreamExample().filterEvenNumbers(numbers)){
            System.out.print(i+" ");
        }

        //2. Uppercase
        List<String> names = Arrays.asList("john", "jane", "doe");
        for(String s : new EasyLevelStreamExample().upperCaseList(names)){
            System.out.println(s+" ");
        }

        //3. Find Max and Min in List
        List<Integer> nums = Arrays.asList(10, 25, 3, 8, 15);



    }
}
