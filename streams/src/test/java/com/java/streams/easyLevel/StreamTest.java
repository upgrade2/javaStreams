package com.java.streams.easyLevel;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StreamTest {

    @Test
    public void testEvenNumbers(){
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> expected = Arrays.asList(2,4,6,8,10);
        List<Integer> result = new EasyLevelStreamExample().filterEvenNumbers(input);
        assertEquals(expected,result);
    }

    @Test
    public void testToUpperCase() {
        List<String> input = Arrays.asList("john", "jane", "doe");
        List<String> expected = Arrays.asList("JOHN", "JANE", "DOE");
        List<String> result = new EasyLevelStreamExample().upperCaseList(input);
        assertEquals(expected,result);
    }

    @Test
    public void testRemoveDuplicates(){
        List<Integer> input = Arrays.asList(1,2,2,3,3,4,4,5,6,7,8);
        List<Integer> expected = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> result = new EasyLevelStreamExample().removeDuplicates(input);
        assertEquals(expected,result);
    }

    @Test
    public void testMaxMin(){
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8);
        Map<String,Integer> expected = new HashMap<>();
        expected.put("Max",8);
        expected.put("Min",1);
        Map<String ,Integer> result = new EasyLevelStreamExample().maxMin(input);
        assertEquals(expected,result);
    }
    @Test
    public void testSumOfEvenNumbers(){
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8);
        Integer expected = 20;
        Integer result = new EasyLevelStreamExample().sumOfEvenNumbers(input);
        assertEquals(expected,result);
    }

    @Test
    public void testSquareEachNumber(){
        List<Integer> input = Arrays.asList(1,2,3,4,5,6);
        List<Integer> expected = Arrays.asList(1,4,9,16,25,36);
        List<Integer> result = new EasyLevelStreamExample().squareEachNumber(input);
        assertEquals(expected,result);
    }

    @Test
    public void testFindAverage(){
        List<Integer> input = Arrays.asList(10, 20, 30);
        Double expected = 20.0;
        Double result = new EasyLevelStreamExample().findAverage(input);
        assertEquals(expected,result);
    }

    @Test
    public void testPartitions(){
        List<Integer> input =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> even = Arrays.asList(2,4,6,8,10);
        List<Integer> odd = Arrays.asList(1,3,5,7,9);
        Map<Boolean,List<Integer>> result = new EasyLevelStreamExample().partition(input);

        assertEquals(even,result.get(true));
        assertEquals(odd,result.get(false));
    }

    @Test
    public void testGetTopNElements(){
        List<Integer> input =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> expected =Arrays.asList(10,9,8,7);
        Integer n = 4;
        List<Integer> result = new EasyLevelStreamExample().getTopNElement(input,n);
        assertEquals(expected,result);

    }
    @Test
    public void emptyTestGetTopNElements(){
        List<Integer> input = Collections.emptyList();
        List<Integer> expected =Collections.emptyList();
        Integer n = 4;
        List<Integer> result = new EasyLevelStreamExample().getTopNElement(input,n);
        assertEquals(expected,result);

    }

    @Test
    public void testMultiplyAllElements(){
        List<Integer> input = Arrays.asList(2, 3, 6);
        int expected = 36;
        assertEquals(expected,new EasyLevelStreamExample().multiplyAllElements(input));
    }

    @Test
    public void testCountPositiveIntegers(){
        List<Integer> input = Arrays.asList(-1, 2, -3, 4, 5);
        long expected =3;
        assertEquals(expected,new EasyLevelStreamExample().countPositiveIntegers(input));
    }
}
