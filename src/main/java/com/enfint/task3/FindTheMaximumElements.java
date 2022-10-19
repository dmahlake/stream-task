package com.enfint.task3;

import java.math.BigDecimal;
import java.util.*;

public class FindTheMaximumElements {

    public List<BigDecimal> getThreeMaximum(List<String> input) {
        // TODO: task3

        return  (List<BigDecimal>) input.stream()
                .map(BigDecimal::new)
                .max(Comparator.naturalOrder())
                .orElse(BigDecimal.ZERO);
    }

}
