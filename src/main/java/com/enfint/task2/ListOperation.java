package com.enfint.task2;

import java.util.List;
import java.util.Objects;


public class ListOperation {

    private String regex1 = "^[A-Z][a-z]{2,}(?: [A-Z][a-z]*)*$";
    public int integerSum(List<String> input) {
        // TODO: task2

        if (input == null)
            return 0;

        return input.stream()
                .filter(Objects::nonNull)
                .filter(items -> items.matches(regex1))
                .mapToInt(Integer::parseInt)
                .sum();

    }
}
