package com.enfint.task4;

import java.util.*;

public class EvenAndOddFinder {

    Map<CharacterType, Set<String>> findFromCollection(List<Set<String>> input) {
        // TODO: task4

        if (input == null)
            return Collections.emptyMap();


        List<String> newList = new ArrayList<>();
        for(Set<String> outer : input){
            for (String inner : outer)
            {
                newList.add(inner);
            }
        }

        Set<String> even = new HashSet<>();
        Set<String> odd = new HashSet<>();

        for(String list : newList)
        {
            CharacterType characterType = list.length() % 2 == 0 ? CharacterType.EVEN : CharacterType.ODD;
            if (characterType.equals(CharacterType.EVEN))
            {
                even.add(list);
            }
            else {
                odd.add(list);
            }
        }

        Map<CharacterType, Set<String>> oddandeven = new HashMap<>();
        oddandeven.put(CharacterType.EVEN, even);
        oddandeven.put(CharacterType.ODD, odd);

        return oddandeven;
    }

}
