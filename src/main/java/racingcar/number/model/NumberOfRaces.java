package racingcar.number.model;

import static racingcar.util.ErrorMessage.*;

public class NumberOfRaces {

	private final int number;
	private static final int MINIMUM_POSITIVE_NUMBER = 1;

	public NumberOfRaces(int number) {
		validateNumberIsPositive(number);
		this.number = number;
	}

	private void validateNumberIsPositive(int number) {
		if (number < MINIMUM_POSITIVE_NUMBER) {
			throw new IllegalArgumentException(ERROR_HEADER + NEGATIVE_NUMBER_ERROR_MESSAGE);
		}
	}

	public int getNumber() {
		return number;
	}
}
