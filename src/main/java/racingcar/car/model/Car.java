package racingcar.car.model;

import static racingcar.util.ErrorMessage.*;

public class Car {

	private final String name;
	private int position = 0;
	private static final int MAX_LENGTH = 5;

	public Car(String name) {
		validateNameLength(name);
		this.name = name;
	}

	private void validateNameLength(String name) {
		if (name.isEmpty() || name.length() > MAX_LENGTH) {
			throw new IllegalArgumentException(ERROR_HEADER + LENGTH_ERROR_MESSAGE);
		}
	}
}