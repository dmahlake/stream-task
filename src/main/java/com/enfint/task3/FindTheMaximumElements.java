package com.enfint.task3;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class FindTheMaximumElements {

    public List<BigDecimal> getThreeMaximum(List<String> input) {
        // TODO: task3

        if (input == null)
            return Collections.emptyList();

        return input.stream()
                .filter(Objects::nonNull)
                .sorted((i, j) ->new BigDecimal(j).compareTo(new BigDecimal(i)))
                .limit(3)
                .map(BigDecimal::new)
                .collect(Collectors.toList());
    }
}
