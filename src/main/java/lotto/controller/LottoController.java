package lotto.controller;

import lotto.view.InputView;

import static lotto.validator.NumberValidator.validateRange;
import static lotto.validator.NumberValidator.validateUnit;

public class LottoController {


    private int initLottoQuantity() {
        int amount = Integer.parseInt(InputView.readPurchaseAmount());

        validateRange(amount);
        validateUnit(amount);
        return amount / 1000;
    }
}
