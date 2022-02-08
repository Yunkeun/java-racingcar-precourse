package racingcar.number.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.number.model.Number;

public class NumberInputView {

	public NumberInputView() {
	}

	public Number writeNumber() {
		return new Number(castNumberToInt(Console.readLine()));
	}

	public int castNumberToInt(String number) {
		return Integer.parseInt(number);
	}
}
