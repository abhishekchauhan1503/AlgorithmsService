package com.algorithms.services;

import com.algorithms.dynamicprogramming.RodCutter;
import com.algorithms.dynamicprogramming.models.RodCutterResult;
import com.algorithms.input.RodCutterInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlgorithmsController {
    private static final String ROD_CUTTER_MAPPING = "/rod-cut/";

    @Autowired
    @Qualifier(value = RodCutter.BEAN_NAME)
    private RodCutter rodCutter;

    @RequestMapping(value = {ROD_CUTTER_MAPPING, ROD_CUTTER_MAPPING + "/**"})
    public RodCutterResult cutRod(@RequestBody RodCutterInput rodCutterInput) {
        return rodCutter.cutRod(rodCutterInput.getRodLength(), rodCutterInput.getPieceLengthToProfitMap());
    }
}
