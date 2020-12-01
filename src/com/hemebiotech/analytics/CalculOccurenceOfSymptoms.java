package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class CalculOccurenceOfSymptoms implements ICalculOccurenceOfSymptoms {
    /**
     * @return {@link TreeMap} of symtoms with thier occurence implimented by the {@link Map} interface but collected in alphabetical order
     *
     *
     *
     */

    @Override
    public Map<String, Integer> calcul(List<String> symptoms) {

        Map<String, Integer> map = new TreeMap<>();


        symptoms.forEach(symptom -> map.put(symptom, map.getOrDefault(symptom, 0) + 1));


        return map;

    }

}
