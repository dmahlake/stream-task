package com.enfint.task1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise {

    public List<Integer> findDuplicates(List<Integer> integerList, int numberOfDuplicates) {
        // TODO: task1
        if (integerList == null)
            return Collections.emptyList();

        return integerList.stream()
                .filter(list -> list != null)
                .collect(Collectors.groupingBy(Function.identity()))
                .entrySet()
                .stream().filter(i -> i.getValue().size() == numberOfDuplicates)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
    

}
