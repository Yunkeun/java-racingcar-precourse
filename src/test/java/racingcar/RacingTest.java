package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import racingcar.car.model.Car;

public class RacingTest {

	@Test
	void 전진_조건_테스트() {
		//given
		final String carName = "car1";
		final Car car = new Car(carName);
		final int currentPosition = car.getPosition();
		//when
		car.moveForward();
		//then
		boolean isSuccessTest = car.getPosition() - currentPosition == 0 || car.getPosition() - currentPosition == 1;
		assertThat(isSuccessTest).isEqualTo(true);
	}
}
