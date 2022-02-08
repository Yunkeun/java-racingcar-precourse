package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.model.Car;

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
}
