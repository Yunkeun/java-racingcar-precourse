package racingcar.number.view;

import static racingcar.util.ErrorMessage.*;

import camp.nextstep.edu.missionutils.Console;
import racingcar.number.model.NumberOfRaces;

public class NumberInputView {

	private static final String REGEX = "^[0-9]+$";

	public NumberInputView() {
	}

	public NumberOfRaces writeNumber() {
		final String inputNumber = Console.readLine();
		try {
			validateInputIsNumber(inputNumber);
			return new NumberOfRaces(castNumberToInt(inputNumber));
		} catch (IllegalArgumentException IAE) {
			printErrorMessage(IAE);
			return writeNumber();
		}
	}

	public int castNumberToInt(String number) {
		return Integer.parseInt(number);
	}

	private void validateInputIsNumber(String inputNumber) {
		if (!inputNumber.matches(REGEX)) {
			throw new IllegalArgumentException(ERROR_HEADER + NEGATIVE_NUMBER_ERROR_MESSAGE);
		}
	}
}
