package racingcar.utils;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.model.Car;
import racingcar.model.Cars;

// 수정한 부분: 컨벤션 상 factory라고 네이밍하는 것이 알맞다.
public class CarFactory {

	private CarFactory() {
	}

	// 수정한 부분: for문을 사용함으로써 발생할 수도 있는 side effect를 stream을 사용하면서 방지한다.
	public static Cars makeCars(List<String> names) {
		return new Cars(names.stream()
			.map(Car::new)
			.collect(Collectors.toList()));
	}
}
