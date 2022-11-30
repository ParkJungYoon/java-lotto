package lotto.domain;

public enum Rank {
    ONE(6, false, 2_000_000_000),
    TWO(5, true, 30_000_000),
    THREE(5, false, 1_500_000),
    FOUR(4, false, 50_000),
    FIVE(3, false, 5_000);

    private final int matchCount;
    private final boolean matchBonus;
    private final int prize;


    Rank(int matchCount, boolean matchBonus, int prize) {
        this.matchCount = matchCount;
        this.matchBonus = matchBonus;
        this.prize = prize;
    }
}
