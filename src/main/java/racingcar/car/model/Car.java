package racingcar.car.model;

import static racingcar.util.ErrorMessage.*;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

	private final String name;
	private int position = 0;
	private static final int MAX_LENGTH = 5;
	private static final int MINIMUM_RANDOM_NUMBER = 0;
	private static final int MAXIMUM_RANDOM_NUMBER = 9;
	private static final int MINIMUM_NUMBER_TO_MOVE = 4;

	public Car(String name) {
		validateNameLength(name);
		this.name = name;
	}

	private void validateNameLength(String name) {
		if (name.isEmpty() || name.length() > MAX_LENGTH) {
			throw new IllegalArgumentException(ERROR_HEADER + LENGTH_ERROR_MESSAGE);
		}
	}

	public int getPosition() {
		return position;
	}

	public void moveForward() {
		if (checkMoveForward()) {
			position++;
		}
	}

	public boolean checkMoveForward() {
		final int resultNumber = Randoms.pickNumberInRange(MINIMUM_RANDOM_NUMBER, MAXIMUM_RANDOM_NUMBER);
		return resultNumber >= MINIMUM_NUMBER_TO_MOVE;
	}
}
