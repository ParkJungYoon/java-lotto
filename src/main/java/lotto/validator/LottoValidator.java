package lotto.validator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoValidator {
    private final static int MIN_RANGE = 1;
    private final static int MAX_RANGE = 45;
    private final static String DUPLICATE_ERROR_MESSAGE = "[ERROR] 중복된 숫자는 입력할 수 없습니다.";
    private final static String OUT_RANGE_ERROR_MESSAGE = "[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.";

    public static void validateDuplicate(List<Integer> numbers) {
        Set<Integer> numSet = new HashSet<>(numbers);
        if (numSet.size() != numbers.size()) {
            throw new IllegalArgumentException(DUPLICATE_ERROR_MESSAGE);
        }
    }

    public static void validateRange(List<Integer> numbers) {
        for (int number : numbers) {
            if (number < MIN_RANGE || number > MAX_RANGE) {
                throw new IllegalArgumentException(OUT_RANGE_ERROR_MESSAGE);
            }
        }
    }
}
