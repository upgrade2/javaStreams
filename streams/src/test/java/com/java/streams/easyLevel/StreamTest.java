package com.java.streams.easyLevel;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

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



}
