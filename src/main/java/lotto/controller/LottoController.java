package lotto.controller;

import lotto.domain.GenerateRandomNumbersImpl;
import lotto.domain.Lotto;
import lotto.domain.Lottos;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;

import static lotto.validator.NumberValidator.validateRange;
import static lotto.validator.NumberValidator.validateUnit;

public class LottoController {
    public void lottoStart() {
        purchaseLotto();
    }

    private int initLottoQuantity() {
        int amount = Integer.parseInt(InputView.readPurchaseAmount());

        validateRange(amount);
        validateUnit(amount);
        return amount / 1000;
    }

    private void purchaseLotto() {
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
}
