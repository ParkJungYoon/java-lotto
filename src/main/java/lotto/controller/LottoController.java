package lotto.controller;

import lotto.domain.GenerateRandomNumbersImpl;
import lotto.domain.Lotto;
import lotto.domain.Lottos;
import lotto.domain.WinningLottoNumbers;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;

import static lotto.util.Transform.convertType;
import static lotto.util.Transform.splitedNumbers;
import static lotto.validator.LottoValidator.validateNonNumericNumbers;
import static lotto.validator.NumberValidator.*;

public class LottoController {
    public void lottoStart() {
        initPurchaseLotto();
        WinningLottoNumbers winningLottoNumbers = new WinningLottoNumbers(initWinningLotto(), initBonus());
        System.out.println(winningLottoNumbers.toString());
    }

    private int initLottoQuantity() {
        int amount = Integer.parseInt(InputView.readPurchaseAmount());

        validateAmountRange(amount);
        validateUnit(amount);
        return amount / 1000;
    }

    private void initPurchaseLotto() {
        GenerateRandomNumbersImpl generateRandomNumbers = new GenerateRandomNumbersImpl();
        List<Lotto> lottos = new ArrayList<>();

        int quantity = initLottoQuantity();
        for (int i = 0; i < quantity; i++) {
            lottos.add(new Lotto(generateRandomNumbers.generate()));
        }
        Lottos purchaseLottos = new Lottos(lottos);

        OutputView.printPurchaseQuantityMessage(quantity);
        OutputView.printPurchaseLotto(purchaseLottos.toString());
    }

    private Lotto initWinningLotto() {
        String winning = InputView.readWinningNumbers();
        return new Lotto(transformInputNumbers(winning));
    }

    private List<Integer> transformInputNumbers(String winningLotto) {
        List<String> numbers = splitedNumbers(winningLotto);

        validateNonNumericNumbers(numbers);
        return convertType(numbers);
    }

    private int initBonus() {
        int bonus = Integer.parseInt(InputView.readBonusNumber());

        validateLottoNumberRange(bonus);
        return bonus;
    }
}
