package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.utils.CarFactory;
import racingcar.view.InputView;
import racingcar.view.OutputView;

// 수정한 부분: 인스턴스화를 통해 중복되는 인자(cars, numberOfAttempts)를 객체에 종속시킨다.
public class GameController {

	private static final int MINIMUM_ATTEMPT_NUMBER = 0;
	private final Cars cars;
	private final int numberOfAttempts;

	public GameController() {
		this.cars = CarFactory.makeCars(InputView.writeCarNames());
		this.numberOfAttempts = InputView.writeNumberOfAttempts();
	}

	public void playRacing() {
		OutputView.printExecutionResult();
		for (int i = MINIMUM_ATTEMPT_NUMBER; i < numberOfAttempts; i++) {
			// 수정한 부분: cars 내에서 view에 접근하게 하지 않고 controller를 통해 view에 접근하게 한다.
			cars.getCars().forEach(Car::movePosition);
			cars.getCars().forEach(OutputView::printCarNameAndPosition);
			OutputView.printNewLine();
		}
		// 수정한 부분: firstPosition을 객체에서 get하지 않고 객체 내에서 처리할 수 있게 수정한다.
		OutputView.printWinner(cars.getWinner());
	}
}
