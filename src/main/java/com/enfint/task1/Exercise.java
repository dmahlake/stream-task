package com.enfint.task1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise {

    public List<Integer> findDuplicates(List<Integer> integerList, int numberOfDuplicates) {
        // TODO: task1
        return integerList.stream().collect(Collectors.groupingBy(Function.identity()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
    

}
