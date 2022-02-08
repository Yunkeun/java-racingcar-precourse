package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.model.Car;
import racingcar.model.Number;

public class InputView {

	private static final String COMMA = ",";

	public InputView() {
	}

	public List<Car> writeCars() {
		List<String> carNames = splitName(Console.readLine());
		try {
			return carNames.stream().map(Car::new).collect(Collectors.toList());
		} catch (IllegalArgumentException IAE) {
			OutputView.printErrorMessage(IAE);
			return writeCars();
		}
	}

	public List<String> splitName(String carsName) {
		return Arrays.asList(carsName.split(COMMA));
	}

	public Number writeNumber() {
		return new Number(castNumberToInt(Console.readLine()));
	}

	public int castNumberToInt(String number) {
		return Integer.parseInt(number);
	}
}
