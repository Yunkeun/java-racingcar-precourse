package racingcar;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.car.model.Car;
import racingcar.car.view.CarInputView;

public class CarNameInputTest {

	@Test
	void 자동차_이름_쉼표_구분() {
		//given
		final String answer1 = "car1";
		final String answer2 = "car2";
		final CarInputView inputView = new CarInputView();

		//when
		final String carsName1 = "car1";
		final String carsName2 = "car1,car2";
		final List<String> carsNameList1 = inputView.splitName(carsName1);
		final List<String> carsNameList2 = inputView.splitName(carsName2);

		//then
		assertThat(carsNameList1.contains(answer1)).isEqualTo(true);

		assertThat(carsNameList2.contains(answer1)).isEqualTo(true);
		assertThat(carsNameList2.contains(answer2)).isEqualTo(true);
	}

	@Test
	void 자동차_이름_5자_이하() {
		//given
		final String carName1 = "car123";

		//then
		Assertions.assertThrows(IllegalArgumentException.class,
			() -> new Car(carName1));
	}

	@Test
	void 자동차_이름_공백() {
		//given
		final String carName = "";

		//then
		Assertions.assertThrows(IllegalArgumentException.class,
			() -> new Car(carName));
	}
}
