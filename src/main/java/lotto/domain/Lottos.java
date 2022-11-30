package lotto.domain;

import java.util.List;
import java.util.StringJoiner;

import static lotto.validator.LottoValidator.validateDuplicate;
import static lotto.validator.LottoValidator.validateRange;

public class Lottos {
    private final List<Lotto> purchaseNumbers;

    public Lottos(List<Lotto> purchaseNumbers) {
//        validate(numbers);
//        validateDuplicate(numbers);
//        validateRange(numbers);
        this.purchaseNumbers = purchaseNumbers;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\n");
        for (Lotto lotto : purchaseNumbers) {
            sj.add(lotto.toString());
        }
        return sj.toString();
    }
}
