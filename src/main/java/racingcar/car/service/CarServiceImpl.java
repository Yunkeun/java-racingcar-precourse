package racingcar.car.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.car.model.Car;
import racingcar.car.model.Cars;

public class CarServiceImpl implements CarService {

	private static final int MINIMUM_RANDOM_NUMBER = 0;
	private static final int MAXIMUM_RANDOM_NUMBER = 9;
	private static final int MINIMUM_NUMBER_TO_MOVE = 4;

	@Override
	public void race(Cars cars) {
		cars.getCars().forEach(this::moveForward);
	}

	@Override
	public Cars decideWinner(Cars cars) {
		return cars.calculateWinners();
	}

	private void moveForward(Car car) {
		if (checkMoveForward()) {
			car.movePosition();
		}
	}

	private boolean checkMoveForward() {
		final int resultNumber = Randoms.pickNumberInRange(MINIMUM_RANDOM_NUMBER,
			MAXIMUM_RANDOM_NUMBER);
		return resultNumber >= MINIMUM_NUMBER_TO_MOVE;
	}
}
