package racingcar.car.view;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import racingcar.car.model.Car;
import racingcar.car.model.Cars;

public class CarOutputView {

	private static final String NOTICE_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String RESULT = "실행 결과";
	private static final String DELIMITER = " : ";
	private static final String CAR_DELIMITER = ", ";
	private static final String POSITION = "-";
	private static final String FINAL_WINNER_IS = "최종 우승자";

	public CarOutputView() {
	}

	public void printErrorMessage(IllegalArgumentException IAE) {
		System.out.println(IAE.getMessage());
	}

	public void askCarNames() {
		System.out.println(NOTICE_CAR_NAMES);
	}

	public void printResult() {
		System.out.println(RESULT);
	}

	public void printPositions(Cars cars) {
		cars.getCars().forEach(this::printPosition);
		printNewLine();
	}

	private void printOneCarPosition(Integer position) {
		IntStream.range(0, position).forEach(i ->
			System.out.print(POSITION)
		);
		System.out.println();
	}

	private void printPosition(Car car) {
		System.out.print(car.getName() + DELIMITER);
		printOneCarPosition(car.getPosition());
	}

	private void printNewLine() {
		System.out.println();
	}

	public void printWinners(Cars winners) {
		System.out.print(FINAL_WINNER_IS + DELIMITER);
		final List<String> winnerNames = winners.getCars()
			.stream()
			.map(Car::getName)
			.collect(Collectors.toList());
		for (String winnerName : winnerNames) {
			System.out.print(winnerName);
			printCarDelimiter(winnerNames, winnerName);
		}
	}

	private void printCarDelimiter(List<String> winnerNames, String winnerName) {
		if (!Objects.equals(winnerName, winnerNames.get(winnerNames.size()-1))) {
			System.out.print(CAR_DELIMITER);
		}
	}
}
