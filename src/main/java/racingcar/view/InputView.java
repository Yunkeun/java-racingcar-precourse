package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class InputView {

	private static final String COMMA = ",";

	public InputView() {
	}

	public List<String> getCarNames() {
		return splitName(Console.readLine());
	}

	public List<String> splitName(String carsName) {
		return Arrays.asList(carsName.split(COMMA));
	}
}
