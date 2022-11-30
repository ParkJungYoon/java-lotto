package lotto.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static lotto.validator.LottoValidator.validateDuplicate;
import static lotto.validator.LottoValidator.validateRange;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        validateDuplicate(numbers);
        validateRange(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현


    @Override
    public String toString() {
        return numbers.toString();
    }
}
