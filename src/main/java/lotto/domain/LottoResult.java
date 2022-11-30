package lotto.domain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LottoResult {
    private Map<Rank, Integer> result = new HashMap<>();
    // 정답 객체에 내가 구매한 로또랑 일치하는지 물어보고 일치 개수랑 보너스 번호 일치 여부 받아서 Rank에서 이게 일치하는 상수를 꺼냄.

    public void getResult(WinningLotto winningLotto, Lottos purchaseLotto) {
        for (Iterator<Lotto> it = purchaseLotto.iterator(); it.hasNext(); ) {
            Lotto lotto = it.next();
            Rank rank = winningLotto.oneCompare(lotto);
            if (result.containsKey(rank)) {
                result.put(rank, result.get(rank) + 1);
                continue;
            }
            result.put(rank, 1);
        }
    }

    public int calculateTotalPrize() {
        int totalPrize = 0;
        for (Rank rank : result.keySet()) {
            totalPrize += rank.getPrize();
        }
        return totalPrize;
    }

    public double calculateProfitRate(int amount) {
        int totalPrize = calculateTotalPrize();
        return (totalPrize / (amount * 1.0)) * 100;
    }

    @Override
    public String toString() {
        return "LottoResult{" +
                "result=" + result +
                '}';
    }
}
