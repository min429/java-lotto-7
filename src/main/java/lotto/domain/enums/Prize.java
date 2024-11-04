package lotto.domain.enums;

public enum Prize {
	FIRST(2000_000_000),
	SECOND(30_000_000),
	THIRD(1_500_000),
	FOURTH(50_000),
	FIFTH(5_000),
	NO_MATCH(0);

	private final int prize;

	Prize(int prize) {
		this.prize = prize;
	}

	public int getPrize() {
		return prize;
	}
}
