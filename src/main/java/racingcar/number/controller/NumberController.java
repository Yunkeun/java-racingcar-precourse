package racingcar.number.controller;

import racingcar.number.model.NumberOfRaces;
import racingcar.number.view.NumberInputView;
import racingcar.number.view.NumberOutputView;

public class NumberController {

	private final NumberInputView numberInputView;
	private final NumberOutputView numberOutputView;

	public NumberController(NumberInputView numberInputView, NumberOutputView numberOutputView) {
		this.numberInputView = numberInputView;
		this.numberOutputView = numberOutputView;
	}

	public NumberOfRaces makeNumberOfRaces() {
		numberOutputView.askTryNumber();
		return numberInputView.writeNumber();
	}
}
