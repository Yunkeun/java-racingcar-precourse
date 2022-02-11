package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.car.model.Car;

public class RacingTest {

	private static final int MINIMUM_NUMBER_TO_MOVE = 4;
	private static final int MOVE_FORWARD_ONE = 1;

	@Test
	void 전진_조건_테스트() {
		//given
		final String carName = "car1";
		final Car car = new Car(carName);
		final int currentPosition = car.getPosition();
		//when
		final int resultNumber = car.checkMoveForward();
		car.moveForward(resultNumber);
		//then
		if (resultNumber >= MINIMUM_NUMBER_TO_MOVE) {
			Assertions.assertThat(currentPosition + MOVE_FORWARD_ONE).isEqualTo(car.getPosition());
			return;
		}
		Assertions.assertThat(currentPosition).isEqualTo(car.getPosition());
	}
}
