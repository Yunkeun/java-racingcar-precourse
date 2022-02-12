package racingcar.car.view;

import java.util.stream.IntStream;
import racingcar.car.model.Car;
import racingcar.car.model.Cars;

public class CarOutputView {

	private static final String NOTICE_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String RESULT = "실행 결과";
	private static final String POSITION = "-";

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
		System.out.print(car.getName());
		printOneCarPosition(car.getPosition());
	}

	private void printNewLine() {
		System.out.println();
	}
}
