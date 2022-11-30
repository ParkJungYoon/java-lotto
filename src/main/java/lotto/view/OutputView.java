package lotto.view;

public class OutputView {
    private final static String PURCHASE_AMOUNT_MESSAGE = "구입금액을 입력해 주세요.";
    private final static String PURCHASE_QUANTITY_MESSAGE = "%d개를 구매했습니다.";

    public static void printPurchaseAmountMessage() {
        System.out.println(PURCHASE_AMOUNT_MESSAGE);
    }

    public static void printPurchaseQuantityMessage(int quantity) {
        System.out.printf(PURCHASE_QUANTITY_MESSAGE + "%n", quantity);
    }

    public static void printPurchaseLotto(String lottos) {
        System.out.println(lottos);
    }
}
