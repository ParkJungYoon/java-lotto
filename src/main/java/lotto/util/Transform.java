package lotto.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Transform {
    public static List<String> splitedNumbers(String input) {
        return Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }

    public static List<Integer> convertType (List<String> input) {
        List<Integer> numbers = new ArrayList<>();
        for (String number : input) {
            numbers.add(Integer.parseInt(number));
        }
        return numbers;
    }
}
