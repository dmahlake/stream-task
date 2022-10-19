package com.enfint.task2;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class ListOperation {

    public int integerSum(List<String> input) {
        // TODO: task2

        StringBuffer stringBuffer = new StringBuffer();
        for (String ab : input){
            stringBuffer.append(ab);
            stringBuffer.append(" ");
        }

        String str = stringBuffer.toString();

        int sum = Arrays.stream(str.split(" "))
                .filter(x -> x.matches("\\d+"))
                .mapToInt(Integer::parseInt)
                .sum();

        return sum < 0 ? null : sum;
    }
}
