package racingcar.number.controller;

import racingcar.number.model.Number;
import racingcar.number.view.NumberInputView;
import racingcar.number.view.NumberOutputView;

public class NumberController {

	private final NumberInputView numberInputView;
	private final NumberOutputView numberOutputView;

	public NumberController(NumberInputView numberInputView, NumberOutputView numberOutputView) {
		this.numberInputView = numberInputView;
		this.numberOutputView = numberOutputView;
	}

	public void getNumber() {
		numberOutputView.askTryNumber();
		final Number number = numberInputView.writeNumber();
	}
}
