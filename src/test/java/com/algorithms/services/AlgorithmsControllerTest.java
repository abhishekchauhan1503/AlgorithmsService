package com.algorithms.services;

import com.algorithms.input.RodCutterInput;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class AlgorithmsControllerTest {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        RodCutterInput obj = new RodCutterInput();
        int lengthOfRod = 4;
        Map<Integer, Integer> pieceLengthToProfitMap = new HashMap<Integer, Integer>();
        pieceLengthToProfitMap.put(0, 0);
        pieceLengthToProfitMap.put(1, 2);
        pieceLengthToProfitMap.put(2, 3);
        pieceLengthToProfitMap.put(3, 7);
        pieceLengthToProfitMap.put(4, 5);
        obj.setRodLength(lengthOfRod);
        obj.setPieceLengthToProfitMap(pieceLengthToProfitMap);

        //Object to JSON in String
        String jsonInString = mapper.writeValueAsString(obj);
        System.out.println(jsonInString);
    }

    @Test
    public void test(){

    }
}
