package lotto.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static lotto.validator.LottoValidator.validateDuplicate;
import static lotto.validator.LottoValidator.validateRange;

public class Lotto {
    private final static String OVER_SIZE_ERROR_MESSAGE = "[ERROR] 로또 번호는 6개입니다.";
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        validateDuplicate(numbers);
        validateRange(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(OVER_SIZE_ERROR_MESSAGE);
        }
    }

    // TODO: 추가 기능 구현

    public boolean isContain(int bonus) {
        return numbers.contains(bonus);
    }

    @Override
    public String toString() {
        return numbers.toString();
    }
}
