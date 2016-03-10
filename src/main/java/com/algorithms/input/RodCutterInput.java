package com.algorithms.input;

import java.util.Map;

public class RodCutterInput {
    private int rodLength;
    private Map<Integer, Integer> pieceLengthToProfitMap;

    public int getRodLength() {
        return rodLength;
    }

    public void setRodLength(int rodLength) {
        this.rodLength = rodLength;
    }

    public Map<Integer, Integer> getPieceLengthToProfitMap() {
        return pieceLengthToProfitMap;
    }

    public void setPieceLengthToProfitMap(Map<Integer, Integer> pieceLengthToProfitMap) {
        this.pieceLengthToProfitMap = pieceLengthToProfitMap;
    }
}
