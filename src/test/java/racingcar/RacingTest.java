package racingcar;

import static org.assertj.core.api.Assertions.*;

import java.util.Collections;
import org.junit.jupiter.api.Test;
import racingcar.car.model.Car;
import racingcar.car.model.Cars;
import racingcar.car.service.CarService;
import racingcar.car.service.CarServiceImpl;

public class RacingTest {

	private final CarService carService = new CarServiceImpl();

	@Test
	void 하나의_자동차_레이스_테스트() {
		//given
		final String carName = "car1";
		final Car car = new Car(carName);
		final int currentPosition = car.getPosition();
		final Cars cars = new Cars(Collections.singletonList(new Car(carName)));
		//when
		carService.race(cars);
		//then
		boolean isSuccessTest = car.getPosition() - currentPosition == 0
			|| car.getPosition() - currentPosition == 1;
		assertThat(isSuccessTest).isEqualTo(true);
	}
}
