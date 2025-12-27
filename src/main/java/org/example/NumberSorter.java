package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class NumberSorter {

    private ArrayList<Integer> toIntArray(String[] texts) {

        ArrayList<Integer> nums = new ArrayList<>();
        int tmp;

        for(String text: texts) {
            tmp = 0;
            for (int i = 0; i < text.length(); i++) {
                if(text.charAt(i) >= 48 && text.charAt(i) <= 57) {
                    nums.add(text.charAt(i) - 48);
                }
            }
        }

        return nums;
    }

    public String sorted(String[] nums) {
        Stream<Integer> numStream = toIntArray(nums).stream().sorted();

        Object[] result = numStream.toArray();

        return Arrays.toString(result);
    }
}
