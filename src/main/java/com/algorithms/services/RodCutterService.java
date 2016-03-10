package com.algorithms.services;


import com.algorithms.dynamicprogramming.models.RodCutterResult;

import java.util.Map;

public interface RodCutterService {
    RodCutterResult getRodCutterResult(int lengthOfRod, Map<Integer, Integer> pieceLengthToProfitMap);
}
