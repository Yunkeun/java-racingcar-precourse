package racingcar.number.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.number.model.NumberOfRaces;

public class NumberInputView {

	public NumberInputView() {
	}

	public NumberOfRaces writeNumber() {
		return new NumberOfRaces(castNumberToInt(Console.readLine()));
	}

	public int castNumberToInt(String number) {
		return Integer.parseInt(number);
	}
}
