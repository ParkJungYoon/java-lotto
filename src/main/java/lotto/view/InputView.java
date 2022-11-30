package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String readPurchaseAmount() {
        OutputView.printPurchaseAmountMessage();
        return Console.readLine();
    }
}
