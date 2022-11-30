package lotto.view;

public class OutputView {
    private final static String PURCHASE_AMOUNT_MESSAGE = "구입금액을 입력해 주세요.";
    private final static String PURCHASE_QUANTITY_MESSAGE = "%d개를 구매했습니다.";
    private final static String WINNING_LOTTO_INPUT_MESSAGE = "당첨 번호를 입력해 주세요.";
    private final static String BONUS_INPUT_MESSAGE = "보너스 번호를 입력해 주세요.";
    private final static String PROFIT_RESULT_MESSAGE = "총 수익률은 %.1f%%입니다.";

    public static void printPurchaseAmountMessage() {
        System.out.println(PURCHASE_AMOUNT_MESSAGE);
    }

    public static void printPurchaseQuantityMessage(int quantity) {
        System.out.printf(PURCHASE_QUANTITY_MESSAGE + "%n", quantity);
    }

    public static void printPurchaseLotto(String lottos) {
        System.out.println(lottos);
    }

    public static void printWinningLottoInputMessage() { System.out.println(WINNING_LOTTO_INPUT_MESSAGE); }

    public static void printBonusInputMessage() { System.out.println(BONUS_INPUT_MESSAGE); }

    public static void printProfit(double profit) { System.out.println(String.format(PROFIT_RESULT_MESSAGE, profit)); }

    public static void printErrorMessage(String e) {
        System.out.println(e);
    }
}
