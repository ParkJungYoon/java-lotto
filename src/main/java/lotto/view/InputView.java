package lotto.view;

import camp.nextstep.edu.missionutils.Console;

import static lotto.validator.NumberValidator.validateNonNumeric;

public class InputView {
    public static String readPurchaseAmount() {
        OutputView.printPurchaseAmountMessage();
        String amount = Console.readLine();

        validateNonNumeric(amount);
        return amount;
    }

    public static String readWinningNumbers() {
        return Console.readLine();
    }

    public static String readBonusNumber() {
        String bonus = Console.readLine();

        validateNonNumeric(bonus);
        return bonus;
    }
}
